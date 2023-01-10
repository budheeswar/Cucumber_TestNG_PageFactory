package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver drive) {
		this.driver = drive;
		PageFactory.initElements(drive, this);
	}
	
	@FindBy(linkText = "PRACTICE")
	WebElement practice;
	
	@FindBy(linkText = "Test Login Page")
	WebElement loginForm;
	
	public void navigateToPracticeFrom() throws InterruptedException {
		practice.click();
		Thread.sleep(1000);
		loginForm.click();
	}

}
