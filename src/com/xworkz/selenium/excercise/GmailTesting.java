package com.xworkz.selenium.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTesting {

	public static void main(String[] args) {
		

System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.gmail.com");
//		chromeDriver.manage().window().maximize();
		
//		WebElement fillingText = chromeDriver.findElement(By.id("identifierId"));
//		fillingText.sendKeys("cgirish995@gmail.com");
		
//		WebElement clickOnNext = chromeDriver.findElement(By.className("VfPpkd-RLmnJb"));
//		clickOnNext.click();
		
//		WebElement clickOnLearnNext = chromeDriver.findElement(By.linkText("Learn more"));
//		clickOnLearnNext.click();
		
		
//		WebElement clickOnCreateAccount = chromeDriver.findElement(By.className("firstName"));
//		clickOnCreateAccount.click();//not working
		
		WebElement clickOnDownArrow = chromeDriver.findElement(By.className("TquXA"));
		clickOnDownArrow.click();
		
		
		
	}

}
