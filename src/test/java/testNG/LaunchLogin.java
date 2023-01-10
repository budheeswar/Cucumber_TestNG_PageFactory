package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageFactory.LoginPage;

public class LaunchLogin {
	WebDriver driver = null;
  @Test
  public void performLogin() throws InterruptedException {
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Thread.sleep(700);
		LoginPage object = new LoginPage(driver);
		object.navigateToPracticeFrom(); //
		
		Thread.sleep(2000);
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/");
		Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod() {
	 driver.quit();
  }

}
