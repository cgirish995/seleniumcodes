package com.xworkz.register.excercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowserUsingChromeDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");

		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.amazon.in");
		chromeDriver.manage().window().maximize();
		chromeDriver.close();

	}

}
