package utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;
import javax.net.ssl.HttpsURLConnection;
import javax.print.attribute.standard.Destination;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.dockerjava.api.model.Link;
import org.openqa.selenium.interactions.Actions;

public class UtilClass {

	public static WebDriver driver;
	public String sheetName;

	public void BrowserLaunch(String browser) {

		ChromeOptions options = new ChromeOptions();
		if (browser.equalsIgnoreCase("Chrome")) {

			   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
			
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("Chrome-Headless")) {

			options.addArguments("--headless=new");
			driver = new ChromeDriver(options);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	public void url(String url) {
		driver.get(url);

	}

	public void click(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}

	public void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void closeBrowser() {
		driver.close();
	}

	public void CheckBrokenLink(String urlToCheck) {

		{
			try {

				URL url = new URL(urlToCheck);
				HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
				connection.setConnectTimeout(3000);
				connection.connect();
				int statusCode = connection.getResponseCode();

				if (statusCode == 200) {
					System.out.println("Link is valid: " + urlToCheck);
				} else {
					System.out.println("is a Broken Link: " + urlToCheck + " (Status Code: " + statusCode + ")");
				}
			} catch (IOException e) {
				System.out.println("Exception occurred while checking the link: " + urlToCheck);
			}
		}
	}

	public void validateTitle(String expected_title) {
		try {
			String my_title = driver.getTitle();

			System.out.println("Title is: " + my_title);

			Assert.assertEquals(my_title, expected_title);

		} catch (Exception e) {
			
		}

	}

	public void bottomLinks() {

		String[] expectedTitles = {

				"Accessibility", "Terms & Conditions", "Privacy", "Interest-Based Ads", "State Privacy Rights",
				"Health Data Privacy", "Do not sell/share my personal information",
				"Limit Use of my Sensitive Personal Information", "Targeting Advertising opt out",
				"CA Supply Chain Transparency Act"

		};

		String my_title = driver.getTitle();

		System.out.println("Title is: " + my_title);

		String expected_title = "Accessibility - Best Buy";

		Assert.assertEquals(my_title, expected_title);
	}
	
	
	

	public String CaptureScreen(String snap) throws IOException {
		String absolutepath_screen = "";
		try {
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File destinationfile = new File("src/screenshots/" + snap + System.currentTimeMillis() + ".png");

			absolutepath_screen = destinationfile.getAbsolutePath();

			FileUtils.copyFile(srcFile, destinationfile);

			System.out.println("Screenshot captured at: " + absolutepath_screen);

		} catch (Exception e) {
			
		}
		return absolutepath_screen;
	}
	
	
	

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static String[][] readExcel(String sheetName) throws IOException {

		XSSFWorkbook book = new XSSFWorkbook("./data/CommonData.xlsx");
		XSSFSheet sheet = book.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		short columnCount = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[rowCount][columnCount];
		for (int i = 1; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);

				switch (cell.getCellType()) {
				case STRING:
					data[i - 1][j] = cell.getStringCellValue();
					break;
				case NUMERIC:

					data[i - 1][j] = String.valueOf(cell.getNumericCellValue());
					break;

				default:
					data[i - 1][j] = cell.getStringCellValue();

				}
			}
		}
		book.close();
		return data;
	}
}

/*
 * if (my_title.equals(expected_title)) {
 * System.out.println("Title validation passed!"); } else {
 * System.out.println("Title validation failed. Expected title: " +
 * expected_title);
 * 
 * throw new AssertionError("Title validation failed. Expected title: " +
 * expected_title); } } catch (AssertionError e) {
 * 
 * System.out.println("Caught AssertionError: " + e.getMessage());
 */