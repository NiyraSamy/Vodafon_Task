package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qacart.base.Base;

public class SearchProduct extends Base{
	
	public SearchProduct()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ("//*[@id=\"searchInput\"]")) 
	WebElement SearchBar;
	
	@FindBy(xpath = ("/html/body/vf-root/main/section[1]/vf-nav-bar/nav/div/div[2]/vf-search-engine/div[1]/div[2]/div[3]/div/p"))
	WebElement Searchiteminbar;
	
	@FindBy(xpath = ("/html/body/vf-root/main/section[2]/vf-product-list-page/div/div[2]/div[5]/vf-product-box-featured[1]/div/div[2]/img"))
	WebElement searchitem;
	
	@FindBy(xpath = ("/html/body/vf-root/main/section[2]/vf-middleware/vf-product-details-page/div[2]/div/div/div[1]/div[3]/div[5]/button[1]"))
	WebElement addSearchitem;

	
	public void addproductfromsearch(String productname)
	{
		SearchBar.sendKeys(productname);
		Searchiteminbar.click();
		searchitem.click();
		addSearchitem.click();
	}

}
