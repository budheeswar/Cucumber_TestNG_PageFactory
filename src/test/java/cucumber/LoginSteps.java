package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageFactory.LoginPage;

public class LoginSteps {

	WebDriver driver = null;

	@Given("I entered Demo practice URL")
	public void i_entered_demo_practice_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/");
	}

	@And("I navigated to Practice Form")
	public void i_navigated_to_practice_form() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Thread.sleep(700);
//	   driver.findElement(By.linkText("PRACTICE")).click();
//	   Thread.sleep(700);
//	   driver.findElement(By.linkText("Test Login Page")).click();

		// Using Page Factory to get elements and perform actions.. instead of Line 28 to 30
		LoginPage object = new LoginPage(driver);
		object.navigateToPracticeFrom(); //
		
		Thread.sleep(2000);

	}

}
