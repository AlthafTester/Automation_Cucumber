package com.automationpractice.filereadermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.pom.com.Check_Payment;
import com.automationpractice.pom.com.Choose_Payment_Page;
import com.automationpractice.pom.com.Customize_Page;
import com.automationpractice.pom.com.Delivery_Address;
import com.automationpractice.pom.com.Dress_Selection;
import com.automationpractice.pom.com.Home_Page;
import com.automationpractice.pom.com.Proceed_To_Checkout;
import com.automationpractice.pom.com.Shipping_Page;
import com.automationpractice.pom.com.Shopping_Cart_Summary;
import com.automationpractice.pom.com.Sign_In;
import com.automationpractice.pom.com.Sub_Categories;

public class Page_Object_Manager {

	public WebDriver driver;

	private Home_Page home;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public Home_Page getInstance_homepage() {

		home = new Home_Page(driver);
		return home;
	}

	private Check_Payment checkpayment;

	public Check_Payment getInstance_Checkpayment() {

		checkpayment = new Check_Payment(driver);
		return checkpayment;
	}

	

	private Customize_Page customize;

	public Customize_Page getInstance_Customize() {

		customize = new Customize_Page(driver);
		return customize;
	}

	private Delivery_Address address;

	public Delivery_Address getInstance_Address() {

		address = new Delivery_Address(driver);
		return address;
	}

	private Dress_Selection dressselection;

	public Dress_Selection getInstance_Dressselection() {

		dressselection = new Dress_Selection(driver);
		return dressselection;
	}

	private Proceed_To_Checkout ptc;

	public Proceed_To_Checkout getInstance_proccedtocheckout() {

		ptc = new Proceed_To_Checkout(driver);
		return ptc;

	}

	private Shipping_Page shipping;

	public Shipping_Page getInstance_Shipping() {

		shipping = new Shipping_Page(driver);
		return shipping;

	}

	private Shopping_Cart_Summary scm;

	public Shopping_Cart_Summary getInstance_ShoppingCartSummary() {

		scm = new Shopping_Cart_Summary(driver);
		return scm;
	}

	private Sign_In signin;

	public Sign_In getInstance_signin() {

		signin = new Sign_In(driver);
		return signin;

	}

	private Sub_Categories subcategories;

	public Sub_Categories getInstance_Subcategories() {

		subcategories = new Sub_Categories(driver);
		return subcategories;
	}
	
	private Choose_Payment_Page cp;
	
	public Choose_Payment_Page getInstance_choosepayment() {

		cp = new Choose_Payment_Page(driver);
        return cp;
	}
	
	
	
	
	
	
	
	
	
	

}
