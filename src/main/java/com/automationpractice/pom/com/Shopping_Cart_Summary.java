package com.automationpractice.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_Cart_Summary {
	
	private WebDriver driver;

	@FindBy(xpath = "(//i[@class='icon-plus'])[1]")
	private WebElement plus1;

	public Shopping_Cart_Summary(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public WebElement getPlus1() {
		return plus1;
	}

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement ptc1;

	public WebElement getPtc1() {
		return ptc1;
	}
}
