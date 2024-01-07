package tests;

import java.io.IOException;
import java.nio.channels.NonWritableChannelException;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.AddingItemToCartPage;
import pages.HomePage;
import utils.UtilClass;



public class TC06_AddingItemToCart extends ProjectSpecifications {
	
	@BeforeTest()
	public void setup() {
		sheetName = "AddingItemToCart";//same name for the sheet in excel sheet
	}

	@Test (dataProvider = "getInputData")
	public void AddingItemToCart(String searchbox) throws InterruptedException, IOException {

		HomePage home = new HomePage();
		home.chooseCountry();
		
		AddingItemToCartPage itc = new AddingItemToCartPage();
		
		itc.searchBox();
		itc.product1();
		itc.addtoCartButton();
		itc.goToCartButton();
		CaptureScreen("Snap6A1");
		
		itc.hamburgericon();
		itc.appliances();
		itc.majorkitchenappliances();
		itc.refrigerators();
		itc.frenchdoorrefrigerators();
		itc.product2();
		itc.addToCartButton1();
		itc.goToCartButton1();
		itc.closeicon();
		CaptureScreen("Snap6A2");
		
		
		itc.hamburgericon();
		itc.brands();
		itc.samsung();
		itc.tvandhometheater();
		itc.tvs();
		itc.product3();
		itc.addToCartButton2();
		itc.goToCartButton2();
		CaptureScreen("Snap6A3");	
		
		
	}
}
