package com.guru99.scrolldownpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.guru99.scrolldownpractise.welcompage.WelcomePage;

public class Tester {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		
		WelcomePage welcomePage = new WelcomePage(driver);
		//welcomePage.scrollDown("arguments[0].scrollIntoView(true)");
		//welcomePage.scrollDowmUsingPixel("window.scrollBy(0,2000)");
		//welcomePage.scrollUpUsingPixel("window.scrollBy(0,-2000)");
		welcomePage.scrollBottomOfPage("window.scrollTo(0, document.body.scrollHeight)");
		
		

		
	}

}
