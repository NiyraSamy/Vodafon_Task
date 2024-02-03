package pages;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qacart.base.Base;

import okio.Timeout;

public class vodafoneHomePage extends Base{
	
	public vodafoneHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"onetrust-close-btn-container\"]")
	WebElement CloseCookies;
	
	@FindBy(xpath = "/html/body/vf-root/main/section[2]/vf-fallback/section/a")
	WebElement HomePageLink;
	
	@FindBy(xpath = "/html/body/vf-root/main/section[1]/vf-nav-bar/nav/div/div[1]/p")
	WebElement l;
	
	@FindBy(xpath = "/html/body/vf-root/main/section[2]/vf-landing-page/vf-ng-main-container[2]/section/div/div[2]/vf-main-carousel/div[1]/div[2]/img")
	WebElement imgHomepage;
	
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
