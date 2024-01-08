package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;

public class ValidataBottomLinksPage extends ProjectSpecifications{

	
	@FindBy (xpath = "//a[contains(text(), 'Accessibility')]")
	WebElement accessibility;
	
	@FindBy (xpath = "//a[contains(text(), 'Terms & Conditions')]")
	WebElement TermsandConditions;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'Privacy')][1]")
	WebElement Privacy;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'Interest-Based Ads')]")
	WebElement InterestBasedAds;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'State Privacy Rights')]")
	WebElement StatePrivacyRights;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'Health Data Privacy')]")
	WebElement HealthDataPrivacy;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'Do Not Sell/Share My Personal Information')]")
	WebElement DoNotSellOrShareMyPersonalInformation;
	
	@FindBy (xpath = "//a[text()='Return to home page']")
	WebElement returnToHomePage;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'Limit Use of My Sensitive Personal Information')]")
	WebElement LimitUseofMySensitivePersonalInformation;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'Targeted Advertising Opt Out')]")
	WebElement TargetedAdvertisingOptOut;
	
	@FindBy (xpath = "//a[contains(@class, 'body-copy-sm mr-200') and contains(text(), 'CA Supply Chain Transparency Act')]")
	WebElement CASupplyChainTransparencyAct;
	

	@FindBy(xpath = "//a[contains(@class, 'mini-header__nav')]")
	WebElement returntopreviouspage;
	
	
	public ValidataBottomLinksPage() {
		PageFactory.initElements(driver, this);
	}

	
	public void clickaccessibility(String Title1) {
		click(accessibility);
		validateTitle(Title1);
	}
	
	public void clickTermsandConditons(String Title2) {
		click(TermsandConditions);
		validateTitle(Title2);
	}
	
	public void clickPrivacy(String Title3) {
		click(Privacy);
		validateTitle(Title3);
	}
	
	
	
	
	public void clickInterestBasedAds(String Title7) {
		click(InterestBasedAds);
		validateTitle(Title7);
	}

	public void clickStatePrivacyRights(String Title9) {
		click(StatePrivacyRights);
		validateTitle(Title9);
	}
	
	public void clickHealthDataPrivacy(String Title11) {
		click(HealthDataPrivacy);
		validateTitle(Title11);
	}
	
	public void clickDoNotSellOrShareMyPersonalInformation(String Title13) {
		click(DoNotSellOrShareMyPersonalInformation);
		validateTitle(Title13);
	}
	
	public void clickLimitUseOfMySensitivePersonalInformation(String Title15) {
		click(LimitUseofMySensitivePersonalInformation);
		validateTitle(Title15);
	}
	
	public void clickTargetedAdvertisingOptOut(String Title17) {
		click(TargetedAdvertisingOptOut);
		validateTitle(Title17);
	}
	
	public void clickCASupplyChainTransparencyAct(String Title19) {
		click(CASupplyChainTransparencyAct);
		validateTitle(Title19);
	}	

	public void clickReturntopreviouspage() {
		click(returntopreviouspage);
	}


	public void clickReturnToHomePage() {
		click(returnToHomePage);
		
	}
}
