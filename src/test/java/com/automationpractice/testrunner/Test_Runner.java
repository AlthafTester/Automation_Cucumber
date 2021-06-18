package com.automationpractice.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.automationpractice.filereadermanager.File_Reader_Manager;
import com.baseclass.com.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//automationpractice//feature",
glue = "com.automationpractice.stepdefinition")


public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {

		String browser = File_Reader_Manager.getInstanceCR().get_browser();
		driver = Base_Class.browserlaunch(browser);
	}

	@AfterClass
	public static void tear_Down() {

		//driver.close();
	}
	
}
