package com.automationpractice.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sub_Categories {

	public static WebDriver driver;

	
	public Sub_Categories(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);	}

	public static WebDriver getDriver() {
		return driver;
	}


	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement imgscr;

	public WebElement getImgscr() {
		return imgscr;
	}

	@FindBy(xpath = "//img[@alt='Faded Short Sleeve T-shirts']")
	private WebElement image;

	public WebElement getImage() {
		return image;
	}

	@FindBy(xpath = "//span[text()='Quick view']")
	private WebElement quickview;

	public WebElement getQuickview() {
		return quickview;
	}

}
