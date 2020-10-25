package com.amazom.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.amazom.login.welcomepage.WelcomePage;

public class AmazonTester {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.navigate();
		
		
		

	}

}
