package StepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;
import utility.WebPageObjectRepo;

public class SignUpStepDefinitionClass extends Constants {

	WebPageObjectRepo objPageObjRepo;  //its a class instance(class where we can store all webpage instance and using this obj repo instance we can fetch webpage instance
	WebDriver driver;
	
	@Given("^User Launch a new Browser$")
	public void user_Launch_a_new_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		if (browserName.equalsIgnoreCase("Chrome"))  // here we have checked on which browser we need to test
		{
			WebDriverManager.chromedriver().setup(); // created instance for chrome browser
			driver = new ChromeDriver();
		}

		if (browserName.equalsIgnoreCase("FireFox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
				
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		objPageObjRepo = new WebPageObjectRepo(driver);		// instance which will give us webpage instances
	}

	@When("^User Open URL https://jt-dev\\.azurewebsites\\.net/#/SignUp$")
	public void user_Open_URL_https_jt_dev_azurewebsites_net_SignUp() throws Throwable {
	   
		objPageObjRepo.login().launchURL();     // objPageObjRepo.login() will provide login webpage class object and it has loginURL method and other method mentioned below
	}

	@Then("^Validate that the dropdown has \"([^\"]*)\" and \"([^\"]*)\"$")
	public void validate_that_the_dropdown_has_and(String lang1, String lang2) throws Throwable {

		Assert.assertTrue(objPageObjRepo.login().validatelanguage(lang1,lang2));  //asserting whether it has both language
	}

	@Then("^Enter in User name$")
	public void enter_in_User_name() throws Throwable {

		objPageObjRepo.login().EnterName("Abhijeet");               
	}

	@Then("^Enter organization$")
	public void enter_organization() throws Throwable {

		objPageObjRepo.login().EnterOrganization("ThinkBridge");
	}

	@Then("^Enter email address\\.$")
	public void enter_email_address() throws Throwable {

		objPageObjRepo.login().EnterEmailId("abhijeet.nagarkar@gmail.com");
	}

	@Then("^Click on I agree to the Terms and Conditions$")
	public void click_on_I_agree_to_the_Terms_and_Conditions() throws Throwable {

		objPageObjRepo.login().SelectTermsandConditions();
	   
	}

	@Then("^Click on SignUp$")
	public void click_on_SignUp() throws Throwable {

	   objPageObjRepo.login().SignUp();
	}
	
	@Then("^Validate Email received$")
	public void validate_Email_received() throws Throwable {
	  
		// we can write the code to open Mail inbox and look for received mail using mail trap or we can check in db whether mail has been triggered or not
	}
	@After
	public void closeBrowser() 
	{
		driver.quit();
	}
}
