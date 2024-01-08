package pages;

import java.util.List;

import org.bouncycastle.pkix.SubjectPublicKeyInfoChecker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.AddHasCasting;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.command.PullImageCmd;

import base.ProjectSpecifications;

public class ValidateTitlePage extends ProjectSpecifications {

	@FindBy(xpath = "//a[text() = 'Holiday Deals']")
	WebElement HolidayDeals;

	@FindBy(xpath = "//a[text()='Top Deals']")
	WebElement TopDeals;

	@FindBy(xpath = "//a[text()='Deal of the Day']")
	WebElement DealoftheDay;

	@FindBy(xpath = "(//a[text()='My Best Buy Memberships'])[1]")
	WebElement MyBestBuyMemberships;

	// @FindBy(xpath = "(//a[text()='Credit Cards'])[2]")
	// WebElement creditCards;

	@FindBy(xpath = "//span[text()='More']")
	WebElement More;

	@FindBy(xpath = "(//a[text()='Gift Cards'])[2]")
	WebElement GiftCards;

	@FindBy(xpath = "(//a[text()='Gift Ideas'])[2]")
	WebElement GiftIdeas;

	@FindBy(xpath = "(//a[text()='Yes, Best Buy Sells That'])[1]")
	WebElement yesBestBuySellsThat;

	@FindBy(xpath = "//a[contains(@class, 'utility-menu-flyout-list-item') and contains(text(), 'Donate to St. Jude')]")
	WebElement donatetoStJude;

	@FindBy(xpath = "//a[contains(@class, 'utility-menu-flyout-list-item') and contains(text(), 'Best Buy Outlet')]")
	WebElement bestBuyOutlet;

	@FindBy(xpath = "//a[contains(@class, 'utility-menu-flyout-list-item') and contains(text(), 'Best Buy Business')]")
	WebElement bestBuyBusiness;

	@FindBy(xpath = "//span[contains(@class, 'accountMenuCloseText')]")
	WebElement close;

	@FindBy(xpath = "//*[local-name()='svg' and namespace-uri()='http://www.w3.org/2000/svg' and @viewBox='0 0 100 100']/ancestor::div[@class='flyout-button-wrapper']")
	WebElement Account;

	@FindBy(xpath = "//a[contains(@class, 'mini-header__nav')]")
	WebElement returntopreviouspage;

	@FindBy(xpath = "//a[contains(text(), 'Create Account') and (@class = 'c-button c-button-outline c-button-sm create-account-btn')]")
	WebElement CreateAccount1;

	@FindBy(xpath = "//a[contains(text(), 'Sign In') and (@class = 'c-button c-button-secondary c-button-sm sign-in-btn')]")
	WebElement SignIn1;

	@FindBy(xpath = "//span[contains(text(), 'Recently Viewed')]")
	WebElement RecentlyViewed;

	@FindBy(xpath = "//a[contains(text(), 'Manage all your recently viewed items')]")
	WebElement Manageallyourrecentlyvieweditems;

	@FindBy(xpath = "//span[contains(text(), 'Order Status')]")
	WebElement OrderStatus;

	@FindBy(xpath = "//a[contains(text(), 'Continue')]")
	WebElement ContinueButton;

	@FindBy(xpath = "//span[contains(text(), 'Saved Items')]")
	WebElement SavedItems;

	@FindBy(xpath = "//a[contains(text(), 'See all your saved items')]")
	WebElement seeallyoursaveditems;

	@FindBy(xpath = "//a[contains(text(), 'CA Supply Chain Transparency Act')]")
	WebElement CASupplyChainTransparencyAct;
	
	public ValidateTitlePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickTopDeals(String Title1) {
		click(TopDeals);
		validateTitle(Title1);
	}

	public void clickDealOftheDay(String Title2) {
		click(DealoftheDay);
		validateTitle(Title2);
	}

	public void clickyesBestBuySellsThat(String Title3) {
		click(yesBestBuySellsThat);
		validateTitle(Title3);
	}

	public void clickMyBestBuyMemberships(String Title4) {
		click(MyBestBuyMemberships);
		validateTitle(Title4);
	}

	public void clickMore() {
		click(More);
	}

	public void clickGiftCards(String Title5) {
		click(GiftCards);
		validateTitle(Title5);
	}

	public void clickGiftIdeas(String Title6) {
		click(GiftIdeas);
		validateTitle(Title6);
	}

	public void clickDonatetoStJude(String Title7) {
		click(donatetoStJude);
		validateTitle(Title7);
	}

	public void clickClose() {
		click(close);
	}

	public void clickAccount1() {
		click(Account);
	}

	public void clickCreateAccount1(String Title8) {
		click(CreateAccount1);
		validateTitle(Title8);
	}

	public void clickSignIn1(String Title9) {
		click(SignIn1);
		validateTitle(Title9);
	}

	public void clickRecentlyViewed() {
		click(RecentlyViewed);
		
	}

	public void clickManageAllYourRecentlyViewedItems(String Title10) {
		click(Manageallyourrecentlyvieweditems);
		validateTitle(Title10);
	}

	public void clickOrderStatus(String Title11) {
		click(OrderStatus);
		click(ContinueButton);
		validateTitle(Title11);
	}

	public void clickContinueButton() {
		click(ContinueButton);

	}

	public void clickSavedItems(String Title12) {
		click(SavedItems);
		clickSeeAllYourSavedItems();
		validateTitle(Title12);
	}

	public void clickSeeAllYourSavedItems() {
		click(seeallyoursaveditems);
	}

	public void clickReturntopreviouspage() {
		click(returntopreviouspage);
	}

	
	
	
	
	// public void clickCreditCards() {
    //click(creditCards);
	// }

}