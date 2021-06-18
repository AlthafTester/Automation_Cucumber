package com.automationpractice.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customize_Page {
	
	public static WebDriver driver;

	public Customize_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//input[@name='qty']")
	private WebElement quantity;

	public WebElement getQuantity() {
		return quantity;
	}

	@FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement plus;

	public WebElement getPlus() {
		return plus;
	}

	@FindBy(id = "group_1")
	private WebElement size;

	public WebElement getSize() {
		return size;
	}

	@FindBy(xpath = "//a[@title='Blue']")
	private WebElement colour;

	public WebElement getColour() {
		return colour;
	}

	@FindBy(xpath = "//img[@id='thumb_4']")
	private WebElement thumb;

	public WebElement getThumb() {
		return thumb;
	}

	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement addtocart;

	public WebElement getAddtocart() {
		return addtocart;
	}
}
