package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPage;

public class CredentialTestSteps {
	WebDriver driver = null;
	@Then("user should be in Login Page")
	public void user_should_be_in_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Thread.sleep(700);
		LoginPage object = new LoginPage(driver);
		object.navigateToPracticeFrom(); //
		
		Thread.sleep(2000);
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	    System.out.println("valid username & password");
	}

	@Then("Login should be successful")
	public void login_should_be_successful() {
		 System.out.println("success");
	}

	@When("user enter invalid username and password")
	public void user_enter_invalid_username_and_password() {
		 System.out.println("invalid username & password");
	}

	@Then("Login should be Unsuccessful")
	public void login_should_be_unsuccessful() {
		 System.out.println("fail");
	}
}
