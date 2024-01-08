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
	@Test
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

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@BeforeTest()
	public void setup() {
		sheetName = "ValidateBottomLinks";// same name for the sheet in excel sheet
	}

	@Test(dataProvider = "getInputData")
	public void validateBottomLinks(String Title1, String Title2, String Title3, String Title4, String Title5, String Title6,
			String Title7, String Title8, String Title9, String Title10, String Title11, String Title12, String Title13,
			String Title14, String Title15, String Title16, String Title17, String Title18, String Title19,
			String Title20) {

		HomePage home = new HomePage();
		home.chooseCountry();
		home.scroll();

		ValidataBottomLinksPage vbl = new ValidataBottomLinksPage();
		vbl.clickaccessibility(Title1);
		vbl.clickaccessibility(Title2);
		vbl.clickTermsandConditons(Title3);
		vbl.clickTermsandConditons(Title4);
		vbl.clickPrivacy(Title5);
		vbl.clickPrivacy(Title6);
		vbl.clickInterestBasedAds(Title7);
		vbl.clickInterestBasedAds(Title8);
		vbl.clickStatePrivacyRights(Title9);
		vbl.clickStatePrivacyRights(Title10);
		vbl.clickHealthDataPrivacy(Title11);
		vbl.clickHealthDataPrivacy(Title12);
		vbl.clickDoNotSellOrShareMyPersonalInformation(Title13);
		vbl.clickDoNotSellOrShareMyPersonalInformation(Title14);
		vbl.clickLimitUseOfMySensitivePersonalInformation(Title15);
		vbl.clickLimitUseOfMySensitivePersonalInformation(Title16);
		vbl.clickTargetedAdvertisingOptOut(Title17);
		vbl.clickTargetedAdvertisingOptOut(Title18);
		vbl.clickCASupplyChainTransparencyAct(Title19);
		vbl.clickCASupplyChainTransparencyAct(Title20);
		}
	}



/*


List<WebElement> menuLink = vbl.getbottomlinkname();

for (WebElement menuItem : menuLink) {

	menuItem.click();
*/
	