package com.xworkz.register.excercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowserUsingFireFoxDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\GeckoDriver\\geckodriver.exe");

		WebDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.manage().window().maximize();
		firefoxDriver.get("https://www.google.com");
		

	}

}
