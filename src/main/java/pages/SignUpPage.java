package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;

public class SignUpPage extends ProjectSpecifications {

	@FindBy(xpath = "//input[@id=\"firstName\"]")
	WebElement firstName;

	@FindBy(xpath = "//input[@id=\"lastName\"]")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailAddress;

	@FindBy(xpath = "//input[@id=\"fld-p1\"]")
	WebElement password;

	@FindBy(xpath = "//input[@id=\"reenterPassword\"]")
	WebElement confirmpassword;

	@FindBy(xpath = "//input[@id=\"phone\"]")
	WebElement mobilePhoneNumber;

	@FindBy(xpath = "//button[text()='Create an Account']")
	WebElement createAnAccountButton;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public void firstName(String firstNamevalue) {

		sendKeys(firstName, firstNamevalue);
	}

	public void lastName(String lastNamevalue) {

		sendKeys(lastName, lastNamevalue);
	}

	public void emailAddress(String emailAddressvalue) {
		sendKeys(emailAddress, emailAddressvalue);
	}
	
	public void password(String passwordvalue) {

		sendKeys(password, passwordvalue);
	}

	public void confirmPassword(String confirmPassowordvalue) {

		sendKeys(confirmpassword, confirmPassowordvalue);
	}

	public void mobilePhoneNumber(String mobilePhoneNumbervalue) {

		sendKeys(mobilePhoneNumber, mobilePhoneNumbervalue);
	}

	public void createAnAccountButton() {

		click(createAnAccountButton);
	}

	public boolean isSignUpFailed() {

		return false;
	}

}
