package com.xworkz.xpath.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static  WebDriver driver;

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/xworkz-selenium");
		
//		XpathTester.ClickOnRegister(driver);
//		XpathTester.EnterEmailText(driver);
//		XpathTester.EnterPsw(driver);
//		XpathTester.reEnterPsw(driver);
//		XpathTester.radioButtonSelect(driver);
		
		
		//XpathTester.LoginTest(driver);
	
		
		try {
			XpathTester.RegisterTest(driver);
		} catch (Exception e) {
			System.out.println("Exception is :"+  e);
		}
		
	

	}

	}




