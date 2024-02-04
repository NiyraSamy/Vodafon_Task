package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Base;

public class Cart extends Base{
	public Cart()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(@class,'cart-btn')]/span")
	WebElement num_items_in_Cart;

	
	public void GetCartnum() throws InterruptedException
	{
		System.out.print("cart num before : " + num_items_in_Cart.getText());
		assertEquals("3", num_items_in_Cart.getText() );
		
	}
}

