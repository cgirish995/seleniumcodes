package com.xworkz.xpath.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromeDriver\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.amazon.in");
		
//		WebElement clickOnMenuBar = chromeDriver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
//		clickOnMenuBar.click();
		
//		WebElement clickOnMenuBar = chromeDriver.findElement(By.xpath("//i[contains(@class,'hm-icon nav-sprite')]"));
//		clickOnMenuBar.click();
		
//		WebElement clickOnAmazon = chromeDriver.findElement(By.xpath("//span[contains(@class,'nav-sprite nav-logo-base')]"));
//		clickOnAmazon.click();
		
//		WebElement clickOnAll= chromeDriver.findElement(By.xpath("//select[contains(@class,'nav')]"));
//		clickOnAll.click();
		
//		WebElement enterText= chromeDriver.findElement(By.xpath("//input[contains(@dir ,'auto')]"));
//		enterText.sendKeys("dresses");
//		
//		WebElement clickOnSearch = chromeDriver.findElement(By.xpath("//input[contains(@value ,'Go')]"));
//		clickOnSearch.click();
		
		
//		WebElement clickOnMobiles = chromeDriver.findElement(By.xpath(//a[text()='Mobiles']"));
//		clickOnMobiles.click();
		
//		WebElement clickOnMobiles = chromeDriver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
//		clickOnMobiles.click();
		
		
//		WebElement clickOnMobiles = chromeDriver.findElement(By.xpath("//a[contains(@class,'nav-a')]"));
//		clickOnMobiles.click();
		
		
//		WebElement clickOnBestSellers = chromeDriver.findElement(By.xpath("//a[text()='Best Sellers']"));
//		clickOnBestSellers.click();
		
		
		
//		WebElement enterText= chromeDriver.findElement(By.xpath("//input[starts-with(@name,'field-keywords')]"));
//		enterText.sendKeys("cups");
		
//		WebElement clickOnMenuBar = chromeDriver.findElement(By.xpath("//i[starts-with(@class,'hm-icon nav-sprite')]"));
//		clickOnMenuBar.click();
		
		WebElement enterText = chromeDriver.findElement(By.xpath("//input[starts-with(@id, 'twotab')]"));
		enterText.sendKeys("washing machine");
		
		
		
		
		
		
		
	}

}
