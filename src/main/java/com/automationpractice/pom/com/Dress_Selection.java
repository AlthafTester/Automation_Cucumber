package com.automationpractice.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Selection {
	
	
	public static WebDriver driver;



	public Dress_Selection(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;

	public WebElement getWomen() {
		return women;
	}

	@FindBy(xpath = "(//a[@title='T-shirts'])[1]")
	private WebElement tshirts;

	public WebElement getTshirts() {
		return tshirts;
	}


}
