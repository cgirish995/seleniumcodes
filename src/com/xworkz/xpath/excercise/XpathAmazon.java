package com.xworkz.xpath.excercise;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAmazon {
	
	static WebDriver driver;
	
	
	public static void launchingBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
	}
	
	public static void clickOnMenuBar(){
		driver.findElement(By.xpath("//i[contains(@class,'hm-icon nav-sprite')]")).click();
	}
	
	public static void clickOnSearchIn(){
		driver.findElement(By.xpath("//select[contains(@class,'nav-search-dropdown searchSelect')]")).click();
	}
	
	public static void textAndClickOnSearch(){
		driver.findElement(By.xpath("//input[contains(@name,'field-keywords') and //input[contains(@type,'text')]]")).sendKeys("dresses");
		driver.findElement(By.xpath("//input[contains(@value,'Go')] ")).click();
	}
	
	public static void clickOnReturnsAndOrders(){
		driver.findElement(By.xpath("//span[contains(text(),'& Orders')] ")).click();
	}
	
	
	public static void clickOnCart(){
		driver.findElement(By.xpath("//span[contains(@class,'nav-cart-icon nav-sprite')]")).click();
	}
	public static void main(String[] args) {
		XpathAmazon xpathAmazon = new XpathAmazon();
		xpathAmazon.launchingBrowser();
		//xpathAmazon.clickOnMenuBar();
		//xpathAmazon.clickOnSearchIn();
		//xpathAmazon.textAndClickOnSearch();
		//xpathAmazon.clickOnReturnsAndOrders();
		xpathAmazon.clickOnCart();
		

		

	}

}
