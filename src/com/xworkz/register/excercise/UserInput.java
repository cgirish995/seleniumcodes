package com.xworkz.register.excercise;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


	

public class UserInput {
	
		private static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\GeckoDriver\\geckodriver.exe");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the  name of the Browser: ");
		String browser = scan.next();
		scan.close();
		
		UserTester.tester(browser,driver);
		
		}

	
	}
		




