package com.automationpractice.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Payment {

	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
	private WebElement scrpay;

	public Check_Payment(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getScrpay() {
		return scrpay;
	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement finsubmit;

	public WebElement getFinsubmit() {
		return finsubmit;
	}

	@FindBy(xpath = "//div[@class='box order-confirmation']")
	private WebElement confirm;

	public WebElement getConfirm() {
		return confirm;
	}

}
