package com.sdettrainingSele.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WebDriverIntro {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		System.out.println("page title is : " + driver.getTitle());
		
		
		driver.findElement(By.id("email")).sendKeys("irfan@sdettraining.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("PasswOrd!@#");
		driver.findElement(By.id("u_0_2")).click();
		
		String expectedValue = "The email you've entered doesn't match any account. Sign up for an account.";
		String actualValue;
		
		//Thread.sleep(3000)
		
		actualValue = "";
		actualValue = driver
				.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div"))
				.getText();
		
		System.out.println("Actual value is ;"+ actualValue);
		
		if (expectedValue.equals(actualValue)){
			System.out.println("Test Passed");
			
		} else 
			System.out.println("Test Failed");
		//driver.quit();
		

	}

}
