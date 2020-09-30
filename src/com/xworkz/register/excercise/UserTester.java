package com.xworkz.register.excercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserTester {

	public static void tester(String browser,WebDriver driver) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
		} else if(browser.equalsIgnoreCase("firefox")){
			WebDriver firefoxDriver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
		}else
			System.out.println("Invalid Browser Name");
}
}