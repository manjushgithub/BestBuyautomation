package pages;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.ProjectSpecifications;

public class BrokenLinkPage extends ProjectSpecifications{

	
	   @Test
	   public void test() throws IOException, InterruptedException {
	         // Find all the links on the page.
	         List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	         
	         System.out.println(allLinks.size());
	         
	          
	         for(int i=0;i<allLinks.size();i++){
	         	
	         	
	         	WebElement element = allLinks.get(i);
	         	String url = element.getAttribute("href");
	         	
	         	URL link = new URL(url);
	         	
	         	HttpsURLConnection httpConn = (HttpsURLConnection) link.openConnection();
	         	
	         	Thread.sleep(3000);
	         	
	         	httpConn.connect();
	         	
	         	int respcode = httpConn.getResponseCode();
	         	
	         	if(respcode>=400) {
	         		System.out.println(url + " -" + "is broken link");
	         	}
	         	
	         	else {
	 				System.out.println(url + "-" + "is a valid link");
	 			}
	         }
	     }
	
}
