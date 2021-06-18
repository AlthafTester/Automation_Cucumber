package com.automationpractice.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.automationpractice.filereadermanager.File_Reader_Manager;
import com.automationpractice.filereadermanager.Page_Object_Manager;
import com.automationpractice.testrunner.Test_Runner;
import com.baseclass.com.Base_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public WebDriver driver = Test_Runner.driver;
	
	public Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	@Given("^: user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		String url = File_Reader_Manager.getInstance().getInstanceCR().get_Url();
		geturl(url);
	}

	@Then("^: user Click On The Signin Button And It Navigate To The Signin Page$")
	public void user_Click_On_The_Signin_Button_And_It_Navigate_To_The_Signin_Page() throws Throwable {

		clickOnElement(pom.getInstance_homepage().getLogin());
	}

	@When("^: user Enter The \"([^\"]*)\" In Email Address Field$")
	public void user_Enter_The_In_Email_Address_Field(String emailid) throws Throwable {
		implicitwait();
		sendValues(pom.getInstance_signin().getEmail(), emailid);
	}

	@When("^: user Enter The \"([^\"]*)\" in Password Field$")
	public void user_Enter_The_in_Password_Field(String password) throws Throwable {

		sendValues(pom.getInstance_signin().getPassword(), password);
	}

	@Then("^: user Click On The SignIn Button And It Navigate To The Dress Selection Field$")
	public void user_Click_On_The_SignIn_Button_And_It_Navigate_To_The_Dress_Selection_Field() throws Throwable {

		clickOnElement(pom.getInstance_signin().getSignin());
	}

	@When("^: user Use The Mouse And Mouseover To The Women Section$")
	public void user_Use_The_Mouse_And_Mouseover_To_The_Women_Section() throws Throwable {

		implicitwait();
		moveToElement(pom.getInstance_Dressselection().getWomen());
	}

	@Then("^: user Click On the Tshirt Icon And It Navigate TO The Sub Categories Page$")
	public void user_Click_On_the_Tshirt_Icon_And_It_Navigate_TO_The_Sub_Categories_Page() throws Throwable {

		actionsclick(pom.getInstance_Dressselection().getTshirts());
	}

	@When("^: user Scroll Down To See Varieties Of Dress$")
	public void user_Scroll_Down_To_See_Varieties_Of_Dress() throws Throwable {

		Thread.sleep(5000);
		scroll(pom.getInstance_Subcategories().getImgscr());
	}

	@Then("^: user Click On The Quick View Options On the Dress That User Liked and It Navigate To The Customize Page$")
	public void user_Click_On_The_Quick_View_Options_On_the_Dress_That_User_Liked_and_It_Navigate_To_The_Customize_Page()
			throws Throwable {
		
		moveToElement(pom.getInstance_Subcategories().getImgscr());
		actionsclick(pom.getInstance_Subcategories().getQuickview());

	}

	@When("^: user Enter The Quantity Of Dress In Quantity Field$")
	public void user_Enter_The_Quantity_Of_Dress_In_Quantity_Field() throws Throwable {

		implicitwait();
		FrameByInt(0);
		delete(pom.getInstance_Customize().getQuantity());
		sendValues(pom.getInstance_Customize().getQuantity(), "1");
		
	}

	@When("^: user On The Plus Button To Increase Quantity Of Dress$")
	public void user_On_The_Plus_Button_To_Increase_Quantity_Of_Dress() throws Throwable {

		clickOnElement(pom.getInstance_Customize().getPlus());
		
	}

	@When("^: user Select The Size Of The Dress In Size Dropdown$")
	public void user_Select_The_Size_Of_The_Dress_In_Size_Dropdown() throws Throwable {

		singleDropDownValue(pom.getInstance_Customize().getSize(), "2");
	}

	@When("^: user Click On The Blue Colour Button For Choosing Colour$")
	public void user_Click_On_The_Blue_Colour_Button_For_Choosing_Colour() throws Throwable {

		clickOnElement(pom.getInstance_Customize().getColour());
		
	}

	@When("^: user Click On The Thumb Icon To See Complete Image Of Dress$")
	public void user_Click_On_The_Thumb_Icon_To_See_Complete_Image_Of_Dress() throws Throwable {

		clickOnElement(pom.getInstance_Customize().getThumb());
	}

	@Then("^: User Click On The Add To Cart Button And It Navigate To The Proceed To Check Out PopUp$")
	public void user_Click_On_The_Add_To_Cart_Button_And_It_Navigate_To_The_Proceed_To_Check_Out_PopUp()
			throws Throwable {

		clickOnElement(pom.getInstance_Customize().getAddtocart());
	}

	@Then("^: user Click On The Proceed To Checkout And It Navigate To The Shopping Cart Summary Page$")
	public void user_Click_On_The_Proceed_To_Checkout_And_It_Navigate_To_The_Shopping_Cart_Summary_Page()
			throws Throwable {

		Thread.sleep(5000);
		clickOnElement(pom.getInstance_proccedtocheckout().getPtc());
	}

	@When("^: user Click On The Plus Button To Increase Quantity Of Dress$")
	public void user_Click_On_The_Plus_Button_To_Increase_Quantity_Of_Dress() throws Throwable {

		sleep(4000);
		clickOnElement(pom.getInstance_ShoppingCartSummary().getPlus1());
	}

	@When("^: user Scroll Down To The Bottom Of The Page$")
	public void user_Scroll_Down_To_The_Bottom_Of_The_Page() throws Throwable {

		scrollDown();
	}

	@Then("^: user Click On The Proceed To Checkout Button And It Move To The Delivery Address Page$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_And_It_Move_To_The_Delivery_Address_Page()
			throws Throwable {

		clickOnElement(pom.getInstance_ShoppingCartSummary().getPtc1());
	}

	@When("^: User Click On The Proceed To Checkout Button And It Navigate To The Shipping Page$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_And_It_Navigate_To_The_Shipping_Page() throws Throwable {

	sleep(4000);
	scrollDown();
	clickOnElement(pom.getInstance_Address().getSubmit2());
	}

	@When("^: user Click On The Read The Terms Of Service Icon And It Open Small Popup$")
	public void user_Click_On_The_Read_The_Terms_Of_Service_Icon_And_It_Open_Small_Popup() throws Throwable {

		sleep(7000);
		clickOnElement(pom.getInstance_Shipping().getFrame());
		
	}

	@When("^: user Click On The Cross Icon To Close That Window$")
	public void user_Click_On_The_Cross_Icon_To_Close_That_Window() throws Throwable {

		clickOnElement(pom.getInstance_Shipping().getClose());
	}

	@When("^: user Click On The Radio Button To Accept Condition$")
	public void user_Click_On_The_Radio_Button_To_Accept_Condition() throws Throwable {

		clickOnElement(pom.getInstance_Shipping().getCheckbox());
	}

	@When("^: user Scroll Down To The Bottom Of Page$")
	public void user_Scroll_Down_To_The_Bottom_Of_Page() throws Throwable {

	scrollDown();
	}

	@Then("^: user Click On Proceed To Checkout Button And It Navigate To The Choose Payment Page$")
	public void user_Click_On_Proceed_To_Checkout_Button_And_It_Navigate_To_The_Choose_Payment_Page() throws Throwable {

		clickOnElement(pom.getInstance_Shipping().getPtc3());
		
	}

	@Then("^: user Click On The Pay By Check Button And It Navigate To The Check Payment Page$")
	public void user_Click_On_The_Pay_By_Check_Button_And_It_Navigate_To_The_Check_Payment_Page() throws Throwable {

		sleep(7000);
		scrollDown();
		clickOnElement(pom.getInstance_choosepayment().getCheque());
	}

	@Then("^: user Click On I Confirm My Order Button And It Navigates To The Order Confirmation Page$")
	public void user_Click_On_I_Confirm_My_Order_Button_And_It_Navigates_To_The_Order_Confirmation_Page()
			throws Throwable {

		sleep(7000);
		clickOnElement(pom.getInstance_Checkpayment().getFinsubmit());
	}

	@When("^: user Scroll Down To The See Details Of Order$")
	public void user_Scroll_Down_To_The_See_Details_Of_Order() throws Throwable {

	 sleep(7000);
	 
	
	}

	@Then("^: user Take Screenshot Of That Page$")
	public void user_Take_Screenshot_Of_That_Page() throws Throwable {

		sleep(4000);
		}

}
