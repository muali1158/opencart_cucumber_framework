package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super (driver);//invoking parent class constructor or variables or methods
	}
	
	//Elements
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement linkMyaccount;
	
	@FindBy(linkText="Register")
	WebElement linkRegister;
	
	@FindBy(xpath="//li[@class='dropdown open']//li[2]/a")
	WebElement linkLogin;
	
	//Action methods
	public void clickMyAccount()
	{
		linkMyaccount.click();
	}
	
	public void clickRegister()
	{
		linkRegister.click();
	}
	
	public void clickLogin()
	{
		linkLogin.click();
	}

}
