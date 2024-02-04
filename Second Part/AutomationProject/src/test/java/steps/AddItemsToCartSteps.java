package steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepackage.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.Duration;
import pages.Cart;
import pages.LoginPage;
import pages.MainProduct;
import pages.SearchProduct;
import pages.vodafoneHomePage;

public class AddItemsToCartSteps extends Base{
	
	vodafoneHomePage VodHomepage  ;
	LoginPage loginpage ;
	Cart cart;
	SearchProduct sp ;
	MainProduct mp ;
	
	@Given("user open the website and go to home page")
	public void user_open_the_website_and_go_to_home_page() 
	{   
		lanuchBrowser();
	    System.out.println("Given Step");
	}
	
	
	 
	@And("User clicks on close cookies settings and clicks on Take me back to homepage")
	public void Close_cookies_settings_and_Click_on_Take_me_back_to_homepage() throws InterruptedException 
	{   
		VodHomepage = new vodafoneHomePage();
		VodHomepage.OpenHomePage();
	    System.out.println("And Step");
	}
	
	@When("User is on home page")
	public void User_is_on_homepage() throws InterruptedException
	{   
		System.out.println("when Step");
		VodHomepage = new vodafoneHomePage();		
		VodHomepage.GetHomePage();
	}
	
	
	@Then("User Login with {string} and {string}")
	public void User_Login_with_MobilenUMBER_AND_Password(String mobilenum , String pass) throws InterruptedException
	{
		System.out.println("Then Step");
		loginpage = new LoginPage();	
		loginpage.Login( mobilenum, pass);
	}
	
	@Then("Get Cart num of products")
	public void  Get_Cart_num_of_products() throws InterruptedException
	{
		cart = new Cart();
		
		
	}
	
	
    @And("Check that items added to cart")
    public void Check_that_items_added_to_cart()
    {
    		
    }
    
    @And("User add 2 item to the cart")
    public void User_add_2_item_to_the_cart() throws InterruptedException
    {
    	mp = new MainProduct();
    	mp.add_item_to_cart();
    	}
    
    @And("User search for the last item as {string} and add to cart")
    public void User_search_for_the_last_item_as_itemname_and_add_to_cart(String itemname) throws InterruptedException
    {
    	sp = new SearchProduct ();
    	sp.addproductfromsearch(itemname);
    }
    
   

}
