package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	//Elements
	@FindBy(name="firstname")
	WebElement txtFirstname;
	
	@FindBy(name="lastname")
	WebElement txtLastname;
	
	@FindBy(name="email")
	WebElement txtEmail;
	
	@FindBy(name="telephone")
	WebElement txtTelephone;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="confirm")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkdPolicy;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void setFirstName(String fname){
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname){
		txtLastname.sendKeys(lname);
	}
	
	public void setFmail(String email){
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String tel){
		txtTelephone.sendKeys(tel);
	}
	
	public void setPassword(String pwd){
		txtPassword.sendKeys(pwd);
	}
	public void setConfirmPassword(String pwd){
		txtConfirmPassword.sendKeys(pwd);
	}
	
		public void setPrivacyPolicy(){
		chkdPolicy.click();
	}
	
	public void clickCountinue(){
		btnContinue.click();
	} 
/*	JavascriptExecutor js=(JavascriptExecutor)driver;
	public void setPrivacyPolicy(){
		js.executeScript("arguments[0].click();",chkdPolicy);
	}
	public void clickCountinue(){
		js.executeScript("arguments[0].click();",btnContinue);
	}  */  
    
    
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}   
	}
}

