package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v115.autofill.model.CreditCard;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;

public class HomePage extends ProjectSpecifications {

	@FindBy(xpath = ("(//img[@alt='United States'])[1]")) // img[@alt='United States'])[1]
	WebElement country;

	@FindBy(xpath = "//span[text()=\"Account\"]")
	WebElement account;

	@FindBy(xpath = "//a[text()=\"Sign In\"]")
	WebElement SignIn;

	@FindBy(xpath = "//a[text()=\"Create Account\"]")
	WebElement CreateAccount;

	@FindBy (xpath = "//input[@class='search-input']")
	WebElement seacrhBox;
	
	@FindBy (xpath = "//span[@class='header-search-icon']")
	WebElement searchIcon;
	
	@FindBy (xpath = "")
	WebElement crossMarkIcon;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void chooseCountry() {
		click(country);
	}

	public void clickAccount() throws InterruptedException {
		Thread.sleep(10000);
		click(account);
	}

	public void clickSignIn() {
		click(SignIn);
	}

	public void clickCreateAccount() {
		click(CreateAccount);

	}
	
	public void clickSignIn1() {
		clickSignIn();
	}
	
	public void SearchBox() {
		click(seacrhBox);
		
	}
	
	public void SearchBoxIcon() {
		click(searchIcon);
	}
	
	public void crossMarkIcon() {
		((JavascriptExecutor) driver).executeScript("debugger;");
		click(crossMarkIcon);
	}

    public void BrokenLink() {
    	CheckBrokenLink("https://www.bestbuy.com");
    	
    }

	public boolean FailAddingItemToCart() {	
		return false;
	}

	public boolean isLinkBroken() {
		
		return false;
	}
}
