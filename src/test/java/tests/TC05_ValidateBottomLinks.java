package tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.ValidataBottomLinksPage;
import pages.ValidateTitlePage;
import utils.UtilClass;

public class TC05_ValidateBottomLinks extends ProjectSpecifications {
	@Test(priority = 1)
	public void ValidateBottomLinks() {
	HomePage home = new HomePage();
	home.chooseCountry();
	
	home.scroll();
	ValidataBottomLinksPage vbl = new ValidataBottomLinksPage();
	
	home.scroll();
	vbl.clickaccessibility("Accessibility - Best Buy");
	
	home.scroll();
	vbl.clickTermsandConditons("BestBuy.com Terms and Conditions");
	
	home.scroll();
	vbl.clickPrivacy("Privacy Policy Hub - Best Buy");
	
	home.scroll();
	vbl.clickInterestBasedAds("Interest-Based Ads - Best Buy");
	
	
	home.scroll();
    vbl.clickStatePrivacyRights("State Privacy Rights - Best Buy");
	

	home.scroll();
    vbl.clickHealthDataPrivacy("Privacy Policy Hub - Best Buy");
	
    home.scroll();
    vbl.clickDoNotSellOrShareMyPersonalInformation("Start Request - Best Buy");
    home.scroll();
    vbl.clickReturnToHomePage();
	
	home.scroll();
	vbl.clickLimitUseOfMySensitivePersonalInformation("Best Buy");
	home.scroll();
    vbl.clickReturnToHomePage();
	
	
	home.scroll();
	vbl.clickTargetedAdvertisingOptOut("Start Request - Best Buy");
	home.scroll();
    vbl.clickReturnToHomePage();
	
	
	
	home.scroll();
	vbl.clickCASupplyChainTransparencyAct("California Supply Chain Transparency Act - Best Buy");
	
	}



	
	@Test(priority = 2)
	public void ValidateBottomLinksNegative() {
	HomePage home = new HomePage();
	home.chooseCountry();
	
	home.scroll();
	ValidataBottomLinksPage vbl = new ValidataBottomLinksPage();
	
	home.scroll();
	vbl.clickaccessibility("Accessibility - Best Buy");
	
	home.scroll();
	vbl.clickTermsandConditons("BestBuy.com Terms and Conditions");
	
	home.scroll();
	vbl.clickPrivacy("Privacy Policy Hub - Best Buy");
	
	home.scroll();
	vbl.clickInterestBasedAds("Interest-Based Ads - Best Buy");
	
	
	home.scroll();
    vbl.clickStatePrivacyRights("State Privacy Rights - Best Buy");
	

	home.scroll();
    vbl.clickHealthDataPrivacy("Privacy Policy Hub - Best Buy");
	
    home.scroll();
    vbl.clickDoNotSellOrShareMyPersonalInformation("Start Request - Best Buy");
    home.scroll();
    vbl.clickReturnToHomePage();
	
	home.scroll();
	vbl.clickLimitUseOfMySensitivePersonalInformation("Best Buy");
	home.scroll();
    vbl.clickReturnToHomePage();
	
	
	home.scroll();
	vbl.clickTargetedAdvertisingOptOut("Start Request - Best Buy");
	home.scroll();
    vbl.clickReturnToHomePage();
	
	
	
	home.scroll();
	vbl.clickCASupplyChainTransparencyAct("California Supply Chain Transparency Act - Best Bui");
	
	}

}