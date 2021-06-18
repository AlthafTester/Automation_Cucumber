package com.automationpractice.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Choose_Payment_Page {

	public WebDriver driver;
	
	public Choose_Payment_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bankwirescroll;

	public WebElement getBankwirescroll() {
		return bankwirescroll;
	}

	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement cheque;

	public WebElement getCheque() {
		return cheque;
	}
}
