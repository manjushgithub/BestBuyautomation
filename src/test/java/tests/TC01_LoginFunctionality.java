 package tests;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.LogInPage;
import pages.ValidateTitlePage;
//import utils.DataSupplierClass;
import utils.UtilClass;


public class TC01_LoginFunctionality extends ProjectSpecifications {
	
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

