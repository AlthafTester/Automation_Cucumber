package com.automationpractice.configurationreader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\JKS\\eclipse-workspace\\Automation_Practice\\src\\test\\java\\com\\automationpractice\\propertyfiles\\configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(fis);
	}

	public String get_browser() {

		String browser = p.getProperty("browser");
		return browser;
	}

	public String get_Url() {

		String url = p.getProperty("url");
		return url;
	}

}
