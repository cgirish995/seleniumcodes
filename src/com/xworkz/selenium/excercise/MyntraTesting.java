package com.xworkz.selenium.excercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://www.myntra.com/");
		
//		WebElement enteringText = chromeDriver.findElement(By.className("desktop-searchBar"));
//		enteringText.sendKeys("Dresses");
//		
//		WebElement clickOnSearch = chromeDriver.findElement(By.className("desktop-submit"));
//		clickOnSearch.click();
		

		
//		WebElement clickOnMen = chromeDriver.findElement(By.linkText("Men"));
//		clickOnMen.click();
		
//		WebElement clickOnMen = chromeDriver.findElement(By.linkText("Women"));
//		clickOnMen.click();
		
//		WebElement clickOnMen = chromeDriver.findElement(By.linkText("Offers"));
//		clickOnMen.click();
		
		
//	WebElement clickOnWhishList = chromeDriver.findElement(By.className("myntraweb-sprite desktop-iconWishlist sprites-headerWishlist"));
//		clickOnWhishList.click();not working
		

		List<WebElement> countingImgs = chromeDriver.findElements(By.tagName("img"));
		System.out.println(countingImgs.size());
		
		List<WebElement> countingTags = chromeDriver.findElements(By.tagName("a"));
		
		for(WebElement tags:countingTags){
			System.out.println(tags.getText());
		}
		
		
		
	}

}
