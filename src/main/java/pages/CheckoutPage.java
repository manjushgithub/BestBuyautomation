package pages;

import org.bouncycastle.pkix.SubjectPublicKeyInfoChecker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;

public class CheckoutPage extends ProjectSpecifications {

	@FindBy(xpath = "//button[contains(@class, 'c-button-unstyled hamburger-menu-button')]")
	WebElement hamburgericon;

	@FindBy(xpath = "//*[contains(@class, 'c-button-unstyled top-four v-fw-medium') and contains(text(), 'Brands')]")
	WebElement brands;

	@FindBy(xpath = "//a[contains(@class, 'hamburger-menu-flyout-list-item') and contains(text(), 'Samsung')]")
	WebElement samsung;

	@FindBy(xpath = "//a[contains(text(), 'TV & Home Theater')]")
	WebElement tvandhometheater;

	@FindBy(xpath = "//a[contains(text(), 'TVs') and (@class = 'link-element')]")
	WebElement tvs;

	@FindBy(xpath = "(//a[@href='/site/samsung-50-class-cu7000-crystal-uhd-4k-smart-tizen-tv/6537418.p?skuId=6537418'])[1]")
	WebElement product4;

	@FindBy(xpath = "//*[@data-sku-id = '6537418' and contains(text(), 'Add to Cart')]")
	WebElement addToCartButton3;

	@FindBy(xpath = "//div[@class = 'go-to-cart-button']")
	WebElement goToCartButton3;

	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary' and contains(text(), 'Checkout')]")
	WebElement checkoutbutton;

	@FindBy(xpath = "//input[@id='fld-e']")
	WebElement email1;

	@FindBy(xpath = "//input[@class='tb-input' and @type='password']")
	WebElement passoword1;

	@FindBy(xpath = "//button[@type='submit' and contains(text(), 'Sign In')]")
	WebElement signin;

	@FindBy(xpath = "//input[@id='number']")
	WebElement creditordebitcardnumber;

	@FindBy(xpath = "//input[@id='first-name']")
	WebElement firstname1;

	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lastname1;

	@FindBy(xpath = "//input[@class = 'tb-input v-medium addressLine1']")
	WebElement address;

	@FindBy(xpath = "//*[contains(@class, 'c-button c-button-secondary c-button-lg cia-guest-content__continue guest')]")
	WebElement continueasGuest;

	@FindBy(xpath = "//button[@class='c-button-link card-call-to-action-button']")
	WebElement switchalltodelivery;

	@FindBy(xpath = "//input[@class='tb-input' and @id='firstName']")
	WebElement firstname2;

	@FindBy(xpath = "//*[@class='tb-input' and @id='lastName']")
	WebElement lastname2;

	@FindBy(xpath = "//*[@class='tb-input  autocomplete__input' and @role='combobox']")
	WebElement address2;

	@FindBy(xpath = "//*[@class='tb-input' and @id='city']")
	WebElement city;

	@FindBy(xpath = "//*[@class='tb-select' and @id='state']")
	WebElement State;

	@FindBy(xpath = "//*[@class='tb-input' and @id='zipcode']")
	WebElement ZIPCode;

	@FindBy(xpath = "//span[text()= 'Apply']")
	WebElement apply;

	@FindBy(xpath = "//*[@class='tb-input' and @id='user.emailAddress']")
	WebElement useremailaddress;

	@FindBy(xpath = "//*[@class='tb-input' and @id='user.phone']")
	WebElement userphonenumber;

	@FindBy(xpath = "//span[contains(text(), 'Continue to Payment Information')]")
	WebElement continuetopaymentinformation;

	@FindBy(xpath = "//span[text()='Continue to Schedule Delivery']")
	WebElement continuetoscheduledelivery;

	@FindBy(xpath = "//input[contains(@class, 'tb-input') and contains(@class, 'v-medium') and @pattern='[0-9]*']")
	WebElement creditcardordebitcardnumber;

	@FindBy(xpath = "//select[@class='tb-select' and @id='expMonth']")
	WebElement expirationmonth;

	@FindBy(xpath = "//select[@class='tb-select' and @id='expYear']")
	WebElement expirationyear;

	@FindBy(xpath = "//input[contains(@class, 'tb-input') and contains(@class, 'v-medium') and @id='cvv']")
	WebElement securitycode;

	@FindBy(xpath = "//span[text() = 'Place Your Order']")
	WebElement placeyourorder;
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

	public void hamburgericon() {
		click(hamburgericon);
	}

	public void brands() {
		click(brands);
	}

	public void samsung() {
		click(samsung);
	}

	public void tvandhometheater() {
		click(tvandhometheater);
	}

	public void tvs() {
		click(tvs);
	}

	public void product4() {
		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver);
		// jsExecutor.executeScript("window.scrollTo(0,200)", product4.getLocation().x,
		// product4.getLocation().y);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", product4);
		click(product4);
	}

	public void addToCartButton3() {
		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver);
		// jsExecutor.executeScript("window.scrollTo(0,650)",
		// addToCartButton3.getLocation().x, addToCartButton3.getLocation().y);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartButton3);
		click(addToCartButton3);
	}

	public void goToCartButton3() {
		click(goToCartButton3);
	}

	public void CheckoutButton() {
		click(checkoutbutton);
	}

	public void email1(String email1value) {
		sendKeys(email1, email1value);
	}

	public void Password1(String passowrd1value) {

		sendKeys(passoword1, passowrd1value);
	}

	public void Signin1() {
		click(signin);
	}

	public void ContinueToPaymentInformation() throws InterruptedException {

		click(continuetopaymentinformation);
		Thread.sleep(5000);
	}

	public void CreditOrDebitCardNumber(String cardnumbervalue) {
		sendKeys(creditcardordebitcardnumber, cardnumbervalue);
	}

	public void FirstName1(String firstname1value) {
		sendKeys(firstname1, firstname1value);
	}

	public void LastName1(String lastname1value) {
		sendKeys(lastname1, lastname1value);
	}

	public void Address1(String addressvalue) {
		sendKeys(address, addressvalue);
	}

	public void ContinueasGuest() {
		click(continueasGuest);
	}

	public void switchalltodelivery() {
		click(switchalltodelivery);
	}

	public void firstName2(String firstname2value) {
		sendKeys(firstname2, firstname2value);
	}

	public void lastName2(String lastname2value) {
		sendKeys(lastname2, lastname2value);
	}

	public void address2(String address2value) {
		sendKeys(address2, address2value);
	}

	public void city(String cityvalue) {
		sendKeys(city, cityvalue);
	}

	public void state(String statevalue) {
		sendKeys(State, statevalue);
	}

	public void zipcode(String zipcodevalue) {
		sendKeys(ZIPCode, zipcodevalue);
	}

	public void apply() {
		click(apply);
	}

	public void useremailaddress(String useremailaddressvalue) {
		sendKeys(useremailaddress, useremailaddressvalue);
	}

	public void userphonenumber(String userphonenumbervalue) {
		sendKeys(userphonenumber, userphonenumbervalue);
	}

	public void continuetoscheduledelivery() {
		click(continuetoscheduledelivery);
	}

	public void scroll() {

	}

	public void continuetopaymentinformation() {

		click(continuetopaymentinformation);

	}

	public void creditcardordebitcardnumber(String creditcardordebitcardnumbervalue) {
		sendKeys(creditcardordebitcardnumber, creditcardordebitcardnumbervalue);
	}

	public void expirationmonth(String expirationmonthvalue) {
		sendKeys(expirationmonth, expirationmonthvalue);
	}

	public void expirationyear(String expirationyearvalue) {
		sendKeys(expirationyear, expirationyearvalue);
	}

	public void securitycode(String securitycodevalue) {
		sendKeys(securitycode, securitycodevalue);
	}
	
	public void placeyourorder() {
		click(placeyourorder);
	}

}
