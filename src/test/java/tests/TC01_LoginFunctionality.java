 package tests;

import base.ProjectSpecifications;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;

import java.io.IOException;

//import utils.DataSupplierClass;


public class TC01_LoginFunctionality extends ProjectSpecifications {
	//before method run after each and evry test cases to run chnages
	@BeforeTest()
	public void setup() {
		sheetName = "LoginTest";//same name for the sheet in excel sheet
	}
	
	@Test(dataProvider = "getInputData")
	public void LoginTest(String userName, String password) throws IOException, InterruptedException {
		HomePage home = new HomePage();
		home.chooseCountry(); 
		
		//ValidateTitlePage vt = new ValidateTitlePage();
	
		home.clickAccount();
		home.clickSignIn();
		System.out.println(driver.getTitle());	
		LogInPage signin = new LogInPage();
		signin.emailAddress(userName);
		signin.password(password);
		try {
		    CaptureScreen("SignIn1");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		signin.clickSignInButton();
		try {
		    CaptureScreen("SignIn2");
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
		
}

