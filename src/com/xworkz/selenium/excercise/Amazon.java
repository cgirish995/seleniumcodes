package com.xworkz.selenium.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.amazon.in");
		chromeDriver.manage().window().maximize();

//		WebElement enteringtext = chromeDriver.findElement(By.id("twotabsearchtextbox"));
//		enteringtext.sendKeys("computers");
//		
//		WebElement clickOnSearch = chromeDriver.findElement(By.className("nav-input"));
//		clickOnSearch.submit();
		
//		WebElement  click = chromeDriver.findElement(By.id("searchDropdownBox"));
//		click.click();
		
//		WebElement clickOnMenu= chromeDriver.findElement(By.id("nav-hamburger-menu"));
//		clickOnMenu.click();
		
		
//		WebElement clickOnArrow = chromeDriver.findElement(By.className("nav-icon nav-arrow"));
//		clickOnArrow.click();not working
		
		
//		WebElement cart = chromeDriver.findElement(By.id("nav-cart-text-container"));
//		cart.click();
		
		
//		WebElement  clickOnMobile = chromeDriver.findElement(By.linkText("Mobiles"));
//		clickOnMobile.click();
		
		
//			WebElement clickOnSelect= chromeDriver.findElement(By.id("glow-ingress-line2"));
//			clickOnSelect.click();
			
//			WebElement clickOnAmazonApp= chromeDriver.findElement(By.className("nav-imageHref"));
//			clickOnAmazonApp.click();
//		
		
		
//	WebElement clickOnImageDishwasher = chromeDriver.findElement(By.className("landscape-image"));
//	clickOnImageDishwasher.click();
	
	
		WebElement clickOnMobiles= chromeDriver.findElement(By.linkText("Mobiles"));
		clickOnMobiles.click();
		
		WebElement checkboxclicking = chromeDriver.findElement(By.name("s-ref-checkbox-16184648031"));
		checkboxclicking.click();
		
		
		
		
		
			
		
	}

}
