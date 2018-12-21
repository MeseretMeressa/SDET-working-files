package POM.FMHerndonSMJ.Cucumer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyTitle_StepDefinations {
	//WebDriver driver;
	String actualTitle;
	WebDriver driver = new ChromeDriver();
	
	@Given("^User is on landing page$")
		public void user_is_on_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
	}

	@When("^user cahecks the title$")
	public void user_cahecks_the_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		//actualTitle = driver.getTitle();
		System.out.println("page title is : " + driver.getTitle());
	}

	@Then("^It must say \"([^\"]*)\"$")
	public void it_must_say(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}



}
