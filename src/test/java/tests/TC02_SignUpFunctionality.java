package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import base.ProjectSpecifications;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pages.HomePage;
import pages.LogInPage;
import pages.SignUpPage;
import utils.UtilClass;

public class TC02_SignUpFunctionality extends ProjectSpecifications {
	
	@BeforeTest()
	public void setup() {
		sheetName = "SignUpTest";//same name for the sheet in excel sheet
	}
	
	@Test(dataProvider = "getInputData")
	public void SignUpTest(String firstName, String lastName, String emailAddress, String password, String confirmPassword, String mobilePhoneNumber) throws InterruptedException {
		
		HomePage home = new HomePage();
		home.chooseCountry();       
		home.clickAccount();
		home.clickCreateAccount();
		
		SignUpPage signup = new SignUpPage();
		signup.firstName(firstName);
		signup.lastName(lastName);
		signup.emailAddress(emailAddress);
		signup.password(password);
		signup.confirmPassword(confirmPassword);
		signup.mobilePhoneNumber(mobilePhoneNumber);
		
		
		System.out.println("");
		
		try {
		    CaptureScreen("SignUp1");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		signup.createAnAccountButton();	
		
		try {
		     CaptureScreen("SignUp2");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}
