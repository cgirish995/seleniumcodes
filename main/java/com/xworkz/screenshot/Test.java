package com.xworkz.screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.xworkz.screenshot.inputpage.InputPage;
import com.xworkz.screenshot.utils.Utils;
import com.xworkz.screenshot.welcompage.WelcomePage;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.localhost:8080/selenium-app");
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		
		WelcomePage welcomePage = new WelcomePage(driver);
		Utils.screenshots(driver, "firstscreenshot.png");
		welcomePage.enterSearchText("selenium");
		welcomePage.search();
		Utils.screenshots(driver, "Secondscreenshot.png");
		
		
		
//		InputPage inputPage = new InputPage(driver);
//		inputPage.enterSearchText("Selenium");
//		inputPage.screenshots2();
//		
		
		
	

		
		

	}

}
