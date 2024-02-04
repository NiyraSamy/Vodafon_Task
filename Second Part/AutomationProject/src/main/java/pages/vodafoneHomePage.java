package pages;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Base;
import okio.Timeout;

public class vodafoneHomePage extends Base{
	
	public vodafoneHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(@class,'close')]") 
	WebElement CloseCookies;
	
	@FindBy(xpath = "//a[contains(text(),'انتقل الي الصفحة الرئيسية ! ')]")
	WebElement HomePageLink;
	
	public void OpenHomePage() throws InterruptedException
	{
		Thread.sleep(9000);
		CloseCookies.click();
		HomePageLink.click(); 
		//l.click();
	}
	
	public void GetHomePage() throws InterruptedException
	{
		System.out.println(driver.getCurrentUrl());
		
		assertEquals("Home page loaded", "https://eshop.vodafone.com.eg/ar/", driver.getCurrentUrl());
		
	}
	

}
