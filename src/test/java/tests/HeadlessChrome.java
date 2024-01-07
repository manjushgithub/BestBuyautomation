package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import base.ProjectSpecifications;

public class HeadlessChrome {
	@Parameters("browser")
	@Test
	public void Headless(String option) {
		System.out.println("Parameter ="+ option);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		//options.addArguments("--disable-gpu");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.bestbuy.com");
		System.out.println(driver.getTitle());
		
	}

}
