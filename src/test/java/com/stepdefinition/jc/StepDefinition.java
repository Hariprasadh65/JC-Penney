package com.stepdefinition.jc;

import org.openqa.selenium.WebDriver;
import com.create.base.Base_Class;
import com.helper.jc.FileReadManager;
import com.helper.jc.Page_Object_Manager;
import com.pom.jcpenny.Home_Page;
import com.pom.jcpenny.MenSuit;
import com.testrunner.jc.Test_Runner_JC;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class{
	
	public static WebDriver driver = Test_Runner_JC.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	Home_Page hp = new Home_Page(driver);
	MenSuit ms = new MenSuit(driver);
	
	@Given("^User Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		//Base_Class.getpage("https://www.jcpenney.com/");
		String url = FileReadManager.getInstanceFile().getInstanceCR().getUrl();
		getpage(url);
		
	}

	@When("^User Scroll Down To The Outdoor Furniture$")
	public void user_Scroll_Down_To_The_Outdoor_Furniture() throws Throwable {
	
		//scroll(hp.getMensuit());
		
		scroll(pom.getHome().getMensuit());
	}

	@Then("^User click On The Outdoor Furniture$")
	public void user_click_On_The_Outdoor_Furniture() throws Throwable {
		
		//click(hp.getMensuit());
		click(pom.getHome().getMensuit());
		
		
	}

	@When("^User Scroll To Select The Dress$")
	public void user_Scroll_To_Select_The_Dress() throws Throwable {
		
		scroll(pom.getMen().getNavysuit());
		scroll(pom.getMen().getWhitesuit());
		//scroll(ms.getNavysuit());
		//scroll(ms.getWhitesuit());
		
	}

	@Then("^User Select The Dress And It Navigates To Shopping Page$")
	public void user_Select_The_Dress_And_It_Navigates_To_Shopping_Page() throws Throwable {
		
		click(pom.getMen().getWhitesuit());
		//click(ms.getWhitesuit());
		
	}
	
	@When("^User Select The Chest Size Of The Dress$")
	public void user_Select_The_Chest_Size_Of_The_Dress() throws Throwable {
		click(pom.getMensuit().getLeng());
		
	}

	@When("^User Select The Quantity Of The Dress$")
	public void user_Select_The_Quantity_Of_The_Dress() throws Throwable {
		click(pom.getMensuit().getChest());
		singledropdown(pom.getMensuit().getChart1(), "byvalue", "1");
	}

	@When("^User Select The Pant Size$")
	public void user_Select_The_Pant_Size() throws Throwable {

		singledropdown(pom.getMensuit().getSize(), "byvalue", "28W X 30L");
		
		
	}

	@When("^User Select The Quantity Of The Pant$")
	public void user_Select_The_Quantity_Of_The_Pant() throws Throwable {
		
		singledropdown(pom.getMensuit().getChart2(), "byvalue", "1");
	}

	@When("^User Select The Vest Size Of The Dress$")
	public void user_Select_The_Vest_Size_Of_The_Dress() throws Throwable {
		
		click(pom.getMensuit().getVest());
	}

	@When("^User Select The Quantity Of Vest$")
	public void user_Select_The_Quantity_Of_Vest() throws Throwable {
		
		singledropdown(pom.getMensuit().getChart3(), "byvalue", "1");
	}

	@Then("^User Click On the Add To Cart Button$")
	public void user_Click_On_the_Add_To_Cart_Button() throws Throwable {
		click(pom.getMensuit().getAddcart());
	}

	// proceed
	
	@Then("^User Proceed To Purchase$")
	public void user_Proceed_To_Purchase() throws Throwable {
		click(pom.getProceed().getProceed());
		
	}

	
	
//mensuit shopping	
	
	
	@When("^User Click The Coupon To Get Discount$")
	public void user_Click_The_Coupon_To_Get_Discount() throws Throwable {
		//Thread.sleep(2000);
		//click(pom.getCart().getBestCoupon());
		
	}

	@When("^User Enter The Coupon Code In the Coupon Text Box$")
	public void user_Enter_The_Coupon_Code_In_the_Coupon_Text_Box() throws Throwable {
		enterdata(pom.getCart().getCouponApply(), "1345");
		
	}

	@When("^User Check The Charity Checkbox$")
	public void user_Check_The_Charity_Checkbox() throws Throwable {
		click(pom.getCart().getCharityCheck());
	}

	@Then("^User Checkout To Payment Page$")
	public void user_Checkout_To_Payment_Page() throws Throwable {
		click(pom.getCart().getCheckout());
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
