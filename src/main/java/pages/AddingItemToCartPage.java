package pages;

import java.io.IOException;

import javax.xml.xpath.XPath;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;

public class AddingItemToCartPage extends ProjectSpecifications {

	@FindBy(xpath = "//input[@class='search-input']")
	WebElement searchBox;

	@FindBy(xpath = "(//a[@href='/site/wd-my-passport-ultra-for-mac-2tb-external-usb-3-0-portable-hard-drive-silver/6290662.p?skuId=6290662'])[2]")
	WebElement product1;

	@FindBy(xpath = "(//button[@data-sku-id='6290662'])[1]")
	WebElement addToCartButton;

	@FindBy(xpath = "//div[@class = 'go-to-cart-button']")
	WebElement goToCartButton;

	@FindBy(xpath = "//button[contains(@class, 'c-button-unstyled hamburger-menu-button')]")
	WebElement hamburgericon;

	@FindBy(xpath = "//button[contains(@class, 'c-button-unstyled hamburger-menu-flyout-list-item ') and contains(text(), 'Appliances' )]")
	WebElement appliances;

	@FindBy(xpath = "//button[contains(@class, 'c-button-unstyled hamburger-menu-flyout-list-item ') and contains(text(), 'Major Kitchen Appliances' )]")
	WebElement majorkitchenappliances;

	@FindBy(xpath = "(//a[@href='/site/home-appliances/refrigerators/abcat0901000.c?id=abcat0901000'])[1]")
	WebElement refrigerators;

	@FindBy(xpath = "//div[@class='flex-copy-wrapper']/a[@href='/site/refrigerators/french-door-refrigerators/abcat0901004.c?id=abcat0901004']")
	WebElement frenchdoorrefrigerators;

	@FindBy(xpath = "(//a[@href='/site/samsung-32-cu-ft-3-door-french-door-smart-refrigerator-with-dual-auto-ice-maker-matte-black/6546224.p?skuId=6546224'])[2]")
	WebElement product2;

	@FindBy(xpath = "(//button[@data-sku-id=6546224])[1]")
	WebElement addToCartButton1;

	@FindBy(xpath = "//div[@class = 'go-to-cart-button']")
	WebElement goToCartButton1;

	@FindBy(xpath = "//button[@class='c-close-icon c-modal-close-icon']")
	WebElement closeicon;

	@FindBy(xpath = "//*[contains(@class, 'c-button-unstyled top-four v-fw-medium') and contains(text(), 'Brands')]")
	WebElement brands;

	@FindBy(xpath = "//a[contains(@class, 'hamburger-menu-flyout-list-item') and contains(text(), 'Samsung')]")
	WebElement samsung;

	@FindBy(xpath = "//a[contains(text(), 'TV & Home Theater')]")
	WebElement tvandhometheater;

	@FindBy(xpath = "//a[contains(text(), 'TVs') and (@class = 'link-element')]")
	WebElement tvs;

	@FindBy(xpath = "(//a[@href='/site/samsung-32-class-n5300-series-led-full-hd-smart-tizen-tv/6202106.p?skuId=6202106'])[1]")
	WebElement product3;

	@FindBy(xpath = "(//button[@data-sku-id=6202106])[1]")
	WebElement addToCartButton2;

	@FindBy(xpath = "//div[@class = 'go-to-cart-button']")
	WebElement goToCartButton2;

	public AddingItemToCartPage() {
		PageFactory.initElements(driver, this);
	}

	public void searchBox() {
		searchBox.click();
		searchBox.sendKeys("WD - My Passport Ultra for Mac 2TB External USB 3.0 Portable Hard Drive - Silver");
		searchBox.submit();
	}

	public void product1() {
		product1.click();
	}

	public void addtoCartButton() throws InterruptedException {
		Thread.sleep(7000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
		click(addToCartButton);

	}

	public void goToCartButton() throws InterruptedException {
		Thread.sleep(3000);
		goToCartButton.click();
	}

	public void hamburgericon() {
		click(hamburgericon);
	}

	public void appliances() {
		click(appliances);
	}

	public void majorkitchenappliances() {
		click(majorkitchenappliances);
	}

	public void refrigerators() {
		click(refrigerators);
	}

	public void frenchdoorrefrigerators() {
		click(frenchdoorrefrigerators);
	}

	public void product2() {
		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver);
		jsExecutor.executeScript("window.scrollTo(0,125)", product2.getLocation().x, product2.getLocation().y);
		click(product2);
	}

	public void addToCartButton1() throws IOException {
		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver);
		// jsExecutor.executeScript("window.scrollTo(0,500)",
		// addToCartButton1.getLocation().x, addToCartButton1.getLocation().y);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartButton1);
		addToCartButton1.click();

		CaptureScreen("AddToCartButton1");
	}

	public void goToCartButton1() {
		click(goToCartButton1);
	}

	public void closeicon() {
		click(closeicon);
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

	public void product3() {
		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver);
		jsExecutor.executeScript("window.scrollTo(0,600)", product3.getLocation().x, product3.getLocation().y);
		click(product3);
	}

	public void addToCartButton2() {
		JavascriptExecutor jsExecutor = ((JavascriptExecutor) driver);
		jsExecutor.executeScript("window.scrollTo(0,650)", addToCartButton2.getLocation().x,
				addToCartButton2.getLocation().y);
		click(addToCartButton2);
	}

	public void goToCartButton2() {
		click(goToCartButton2);
	}

}
