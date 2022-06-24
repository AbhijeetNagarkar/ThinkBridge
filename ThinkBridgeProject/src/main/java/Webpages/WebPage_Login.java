package Webpages;

import java.util.List;
import utility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPage_Login extends Constants //extended to fetch automation URL
{
	private WebDriver driver;
	WebDriverWait wait;
	
	public WebPage_Login(WebDriver driver) //POM representation to initialize webelements
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	
	}
	
	@FindBy(id = "language")
	WebElement language;
	
	@FindBy(xpath = "//input[@name='name']")
	WebElement name;
	
    @FindBy(xpath = "//input[@name='orgName']")
	WebElement orgname;
    
    @FindBy(xpath = "//input[@name='email']")
	WebElement email;
    
    @FindBy(xpath = "//span[text()=\"I agree to the\"]")
	WebElement agreecheckbox;
    
    @FindBy(xpath = "//button[@type='submit']")
	WebElement getstarted;
    
      
    
	public void launchURL() // fetch URL using extended Constant class
	{
		driver.get(AUTOMATIONURL);
	}
	
	public boolean validatelanguage(String lang1,String lang2) throws InterruptedException // validate language
	{
		
			//	Thread.sleep(5000);
				language.click();
		
				
				List<WebElement> elements = driver.findElements(By.xpath("//a//div[@class='ng-binding ng-scope']"));
				//getting list of dropdown menu
				
				int flag=0;
				
				java.util.Iterator<WebElement> itr=elements.iterator(); // initialize iterator to iterate list
				while(itr.hasNext())          // iterating list
				{
					String text = itr.next().getText();
					if(text.equals(lang1) || text.equals(lang2))  // checking language
					{
						System.out.println(text +" language available");
						flag=flag+1;                              //language match then increasing flag 
					}
					
				}
				name.click();
				if(flag==2)  // validate both language available
					return true;
				
				return false;
	}
	
	public void EnterName(String uname) 
	{
		name.sendKeys(uname);               // entering name as per given parameter
	}
	
	public void EnterOrganization(String org) 
	{
		orgname.sendKeys(org);  // entering organization as per given parameter
	}

	public void EnterEmailId(String mail) 
	{
		email.sendKeys(mail);   // entering email id as per given parameter
	}
	public void SelectTermsandConditions() throws InterruptedException 
	{
		agreecheckbox.click();     // click Terms and condition check box
	}
	public void SignUp() throws InterruptedException
	{
		getstarted.click();    // click on get started button
	}
	
}
