package com.automationpractice.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_To_Checkout {
	
	public static WebDriver driver;

	
	public Proceed_To_Checkout(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}


	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement ptc;

	public WebElement getPtc() {
		return ptc;
	}
}
