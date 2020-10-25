package com.xworkz.xpath.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWebsiteTesting {
	
	private static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.in/");
		
		//https://www.tripadvisor.in/
		
		// driver.findElement(By.xpath("//a[contains(@title,'Restaurants')]")).click();
		//  driver.findElement(By.xpath("//a[contains(@title,'Hotels')]")).click();
		//  driver.findElement(By.xpath("//span[contains(@class, 'HLvj7Lh5 _9RPF_Kg6')]")).click();//sign in
		//driver.findElement(By.xpath("//a[contains(@title,'Holiday Homes')]")).click();//on holiday
		driver.findElement(By.xpath("//a[contains(@title,'Things to Do')]")).click();//on Things to Do
		
		
		
	}

}
