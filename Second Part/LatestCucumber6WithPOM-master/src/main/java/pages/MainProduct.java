package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qacart.base.Base;

public class MainProduct extends Base{
	
	public MainProduct()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ("/html/body/vf-root/main/section[2]/vf-middleware/vf-product-details-page/div[1]/div/vf-crumbs/div/div[1]/button")) 
	WebElement MainPage;
	
	@FindBy(xpath = ("/html/body/vf-root/main/section[2]/vf-landing-page/vf-ng-main-container[1]/section/div/div[1]/button[8]"))
	WebElement category;
	
	@FindBy(xpath = ("/html/body/vf-root/main/section[2]/vf-product-list-page/div/div[2]/div[4]/vf-product-box-featured[1]/div/div[2]/img"))
	WebElement item1;
	
	@FindBy(xpath = ("/html/body/vf-root/main/section[2]/vf-product-list-page/div/div[2]/div[4]/vf-product-box-featured[3]/div/div[2]/img"))
	WebElement item2;
	

	@FindBy(xpath = ("/html/body/vf-root/main/section[2]/vf-middleware/vf-product-details-page/div[2]/div/div/div[1]/div[3]/div[7]/button[1]"))
	WebElement addtocart;
	
	
	public void add_item_to_cart()
	{
		//add 1 item
		MainPage.click();
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
