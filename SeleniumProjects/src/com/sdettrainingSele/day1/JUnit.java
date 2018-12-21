package com.sdettrainingSele.day1;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class JUnit {
	WebDriver driver;
	String BaseUrl;
	
	public void setUp() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		BaseUrl = "http://www.facebook.com/";
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
	}

	public void testVerifyHomePage() throws Exception{
		driver.get(BaseUrl +"/");
		String actualPageTitle = driver.getTitle();
		String pageTitle = "Facebook - Log In or Sign Up";
		Assert.assertEquals(pageTitle, actualPageTitle);
		
		
	}
	public void tearDown() throws Exception{
		driver.quit();
	}
}
