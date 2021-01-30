package stepDefi;

import org.openqa.selenium.WebDriver;

import BaseLib.BaseFile;
import DemoBlaze_Shop.OnlineShop_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cart_Check_Step extends BaseFile {
	
	WebDriver driver;
	private OnlineShop_Page ol;
	
	@Given("^Demo Blaze page is launched showing all products$")
	public void demo_Blaze_page_is_launched_showing_all_products() throws Throwable {
		driver = BaseFile.getDriver();
		OnlineShop_Page ol = new OnlineShop_Page(driver);
		ol.ShoppingPage();
	}

	@When("^Navigate to Laptop and add to cart$")
	public void navigate_to_Laptop_and_add_to_cart() throws Throwable {
	   
	  new OnlineShop_Page(driver).viaoSelect();
	  
	}

	@When("^Repeat above step for another product$")
	public void repeat_above_step_for_another_product() throws Throwable {
		new OnlineShop_Page(driver).dellSelect();
	}

	@When("^Navigate to cart and delete second item$")
	public void navigate_to_cart_and_delete_second_item() throws Throwable {
		new OnlineShop_Page(driver).cart();
	    
	}

	@When("^Click on Place order$")
	public void click_on_Place_order() throws Throwable {
		new OnlineShop_Page(driver).Order();
	}

	@When("^Fill in all details and click Purchase$")
	public void fill_in_all_details_and_click_Purchase() throws Throwable {
		new OnlineShop_Page(driver).enterDetails();
	}

	@Then("^Capture logs \\(purchase ID and amount\\) and assert purchase amount$")
	public void capture_logs_purchase_ID_and_amount_and_assert_purchase_amount() throws Throwable {
		new OnlineShop_Page(driver).DataCheck();
	}
}
