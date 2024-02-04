package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Base;

import org.openqa.selenium.By;

public class LoginPage extends Base{
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css = "#userProfileMenu button")
	WebElement Account_Icon;
	
	@FindBy(id = "username")
	WebElement MobileNumber;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "submitBtn")
	WebElement Go_tO_MyAccount;
	
	public void Login(String mobilenum , String pass) throws InterruptedException
	{
		Account_Icon.click();
		MobileNumber.sendKeys(mobilenum);
		password.sendKeys(pass);
		Go_tO_MyAccount.click(); 
		//return new HomePage();
	}
}
