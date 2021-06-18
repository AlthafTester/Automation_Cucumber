package com.automationpractice.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In {
	
	public static WebDriver driver;


	public Sign_In(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}


	@FindBy(id = "email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(id = "passwd")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement signin;

	public WebElement getSignin() {
		return signin;
	}

}
