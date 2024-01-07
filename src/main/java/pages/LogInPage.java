package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;

public class LogInPage extends ProjectSpecifications {

	@FindBy(xpath = "//input[@type=\"email\"]")
	WebElement email;
	
	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement signinButton;
	
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void emailAddress(String emailvalue) {
		
		sendKeys(email, emailvalue);
	}
	
	public void password(String passwordvalue) {
		sendKeys(password, passwordvalue);
	}
	
	public void clickSignInButton() {
		click(signinButton);
	}

	public boolean isSignInFailed() {
		
		return false;
	}
	
	}
	
	

