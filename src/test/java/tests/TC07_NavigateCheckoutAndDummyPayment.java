package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.CheckoutPage;

import pages.HomePage;
import utils.UtilClass;

public class TC07_NavigateCheckoutAndDummyPayment extends ProjectSpecifications {

	@BeforeTest()
	public void setup() {
		sheetName = "NavigateCheckoutAndDummyPayment";
	}

	@Test(dataProvider = "getInputData")
	public void NavigateCheckoutAndDummyPayment(String firstName2, String lastName2, String address2, String city,
			String state, String zipcode, String useremailaddress, String userphonenumber,
			String creditcardordebitcardnumber, String expirationmonth, String expirationyear, String securitycode)
			throws IOException {

		HomePage home = new HomePage();
		home.chooseCountry();

		CheckoutPage check = new CheckoutPage();
		check.hamburgericon();
		check.brands();
		check.samsung();
		check.tvandhometheater();
		check.tvs();
		check.product4();
		check.addToCartButton3();
		check.goToCartButton3();
		check.CheckoutButton();
		check.ContinueasGuest();
		check.switchalltodelivery();
		check.firstName2("Purchase");
		check.lastName2("Something");
		check.address2("AB Goose Creek Resort");
		check.city("Newport");
		check.state("NC");
		check.zipcode("28570");
		check.apply();
		check.useremailaddress("useremail@gmail.com");
		check.userphonenumber("980-563-1724");
		CaptureScreen("Snap9A1");
		check.continuetoscheduledelivery();
		try {
			CaptureScreen("Snap9A2");
		} catch (IOException e) {
			e.printStackTrace();
		}
		check.creditcardordebitcardnumber("4263 9826 0269 5299");
		check.expirationmonth("2");
		check.expirationyear("2026");
		check.securitycode("837");
		try {
			Thread.sleep(5000);
			check.ContinueToPaymentInformation();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		check.scroll();
		check.placeyourorder();

		try {
			CaptureScreen("NavigateCheckoutPayment");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
