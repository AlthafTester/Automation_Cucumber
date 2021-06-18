package com.automationpractice.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {

	private WebDriver driver;
	
	@FindBy(xpath = "//a[@class='iframe']")
	private WebElement frame;

	public Shipping_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFrame() {
		return frame;
	}

	@FindBy(xpath = "//a[@title='Close']")
	private WebElement close;

	public WebElement getClose() {
		return close;
	}

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;

	public WebElement getCheckbox() {
		return checkbox;
	}

	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement ptc3;

	public WebElement getPtc3() {
		return ptc3;
	}
}
