package tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.AddHasCasting;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.ValidateTitlePage;
import utils.UtilClass;

public class TC04_ValidateTitle extends ProjectSpecifications {

	@Test()
	public void validatetitle() {

		HomePage home = new HomePage();
		home.chooseCountry(); 
		ValidateTitlePage vt = new ValidateTitlePage();

		vt.clickTopDeals("Top Deals and Featured Offers on Electronics - Best Buy");
		vt.clickDealOftheDay("Deal of the Day: Electronics Deals - Best Buy");
		//vt.clickyesBestBuySellsThat("Yes, Best Buy Sells That - Best Buy");
		vt.clickMyBestBuyMemberships("My Best Buy Memberships");
		vt.clickMore();
		vt.clickGiftCards("Gifts Cards and E-Gift Cards - Best Buy");
		vt.clickMore();
		vt.clickGiftIdeas("Gift Ideas 2024: Best Gifts to Give This Year - Best Buy");
		vt.clickMore();
		vt.clickDonatetoStJude("St.Jude Children's Research Hospital - Best Buy");
		vt.clickClose();
		vt.clickAccount1();
		vt.clickCreateAccount1("Best Buy: Create an Account");
		vt.clickReturntopreviouspage();
		vt.clickAccount1();
		vt.clickSignIn1("Sign In to Best Buy");
		vt.clickReturntopreviouspage();
		vt.clickRecentlyViewed("Recently Viewed Best Buy");
		vt.clickManageAllYourRecentlyViewedItems();
		vt.clickOrderStatus("Sign In for Order Status");
		vt.clickContinueButton();
		vt.clickReturntopreviouspage();     
		vt.clickSavedItems("Saved Items - Best Buy");
		vt.clickSeeAllYourSavedItems();
}
}