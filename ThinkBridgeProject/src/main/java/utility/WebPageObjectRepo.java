package utility;

import org.openqa.selenium.WebDriver;
import Webpages.WebPage_Login;

public class WebPageObjectRepo // This is a class which contain object repository of each webpage to get webpage instance for test the features 
{
	private WebDriver driver;
	public WebPageObjectRepo (WebDriver driver1)
	{
		this.driver=driver1;
	}
	
	
	WebPage_Login loginPage;  // instance of login page 

	public WebPage_Login login()
	{
		if(loginPage==null)
			loginPage = new WebPage_Login(driver);  // created instance of login page and checked if already created the revert the same instance 
		
		return loginPage;
	}
	
}
