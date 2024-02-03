package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qacart.base.Base;

public class Cart extends Base{
	public Cart()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/vf-root/main/section[1]/vf-nav-bar/nav/div/div[3]/vf-cart/div/button/span")
	WebElement num_in_Cart_before;

	@FindBy(xpath = "/html/body/vf-root/main/section[1]/vf-nav-bar/nav/div/div[3]/vf-cart/div/button/img")
	WebElement x;
	
	public void GetCartnum() throws InterruptedException
	{
		x.click();
		System.out.print("cart num before : " + num_in_Cart_before.getText());
		
	}
}

