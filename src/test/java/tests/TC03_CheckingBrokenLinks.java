package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.LogInPage;
import utils.UtilClass;


public class TC03_CheckingBrokenLinks extends ProjectSpecifications {
	@BeforeTest()
	public void setup() {
		sheetName = "BrokenLinksTest";
	}
	
	@Test(dataProvider = "getInputData")
	public void CheckBrokenLinksTest() {

		HomePage home = new HomePage();
		home.chooseCountry();

		home.BrokenLink();
		
		try {
			CaptureScreen("BrokenLinks1");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			CaptureScreen("BrokenLinks2");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}