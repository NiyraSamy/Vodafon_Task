package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Base;

public class SearchProduct extends Base{
	
	public SearchProduct()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = ("searchInput")) 
	WebElement SearchBar;
	
	@FindBy(xpath = ("/html/body/vf-root/main/section[1]/vf-nav-bar/nav/div/div[2]/vf-search-engine/div[1]/div[2]/div[3]/div/p"))
	WebElement Searchiteminbar;
	
	@FindBy(xpath = ("(//div[contains(@class,'product-result')]/img)[1]"))
	WebElement searchitem;
	
	@FindBy(xpath = ("//button[contains(@class,'add-to-cart')]"))
	WebElement addSearchitem;

	
	public void addproductfromsearch(String productname) throws InterruptedException
	{
		SearchBar.sendKeys(productname);
		searchitem.click();
		addSearchitem.click();
	}

}
