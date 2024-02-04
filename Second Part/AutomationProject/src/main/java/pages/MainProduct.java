package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Base;

public class MainProduct extends Base{
	
	public MainProduct()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ("//button[contains(@routerlink,'/')]")) 
	WebElement MainPage;
	
	@FindBy(xpath = ("(//button[contains(@class,'menuTab')])[8]"))
	WebElement category;
	
	@FindBy(xpath = ("(//div[contains(@class,'product-card')]//div[contains(@class,'img-container')]//img)[1]"))
	WebElement item1;
	
	@FindBy(xpath = ("(//div[contains(@class,'product-card')]//div[contains(@class,'img-container')]//img)[2]"))
	WebElement item2;
	
	@FindBy(xpath = ("//button[contains(@class,'add-to-cart')]"))
	WebElement addtocart;
	
	
	public void add_item_to_cart() throws InterruptedException
	{
		//add 1 item
		
		category.click();
		item1.click();
		addtocart.click();
		
		//add 2 item
		MainPage.click();
		category.click();
		item2.click();
		addtocart.click();
	}
	
	
}
