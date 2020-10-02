package com.xworkz.selenium.excercise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromeDriver\\chromedriver.exe");
		
	 ChromeDriver chromeDriver = new ChromeDriver();
	 chromeDriver.get("https://www.google.com");
	 
//	 WebElement enterText = chromeDriver.findElement(By.name("q"));
//	 enterText.sendKeys("cars");
	 
//	 WebElement clickOnSearch = chromeDriver.findElement(By.className("gLFyf"));
//	 clickOnSearch.submit();
	
	 
//	 WebElement clickOnGoogleSearch = chromeDriver.findElement(By.name("btnK"));
//	 clickOnGoogleSearch.click();
	 
//	 WebElement clickOnFeelingLucky = chromeDriver.findElement(By.name("btnI"));
//	 clickOnFeelingLucky.click();
		
	 
	 
//	 WebElement clickOnGmailLink = chromeDriver.findElement(By.linkText("Gmail"));
//	 clickOnGmailLink.click();
		
	 
//	 WebElement clickOnImages = chromeDriver.findElement(By.linkText("Images"));
//	 clickOnImages.click();
	 
//	 WebElement clickOnDots = chromeDriver.findElement(By.linkText("Google apps"));
//	 clickOnDots.click();//not working 
	 
/*	 WebElement clickOnSignIn = chromeDriver.findElement(By.partialLinkText("Sign in"));
	 clickOnSignIn.click();
	 
	 WebElement enterTextInSignIn = chromeDriver.findElement(By.id("identifierId"));
	 enterTextInSignIn.sendKeys("cgirish995@gmail.com");
	 
	 WebElement clickOnNext= chromeDriver.findElement(By.className("VfPpkd-RLmnJb"));
	 clickOnNext.click();*/
	 
//	 WebElement clickOnVoiceSearch = chromeDriver.findElement(By.className("VfPpkd-RLmnJb"));
//	 clickOnVoiceSearch.click();not working
	 
//	 WebElement clickOnKannada = chromeDriver.findElement(By.linkText("ಕನ್ನಡ"));
//	 clickOnKannada.click();
	 
	 
//	 WebElement clickOnHindi = chromeDriver.findElement(By.linkText("हिन्दी"));
//	 clickOnHindi.click();
	 
//	 WebElement clickOnHowSearchworks = chromeDriver.findElement(By.linkText("How Search works"));
//	 clickOnHowSearchworks.click();
	 
	 WebElement clickOnSettings = chromeDriver.findElement(By.linkText("Settings"));
	 clickOnSettings.click();
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
		

	}

}
