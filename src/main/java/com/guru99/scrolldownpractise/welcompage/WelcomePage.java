package com.guru99.scrolldownpractise.welcompage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
	
	
	WebDriver driver;
	
	public WelcomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	private By scrollDowntillSelenium = By.xpath("//a[contains(@href,'/software-testing.html')]//i[contains(@class,'fa fa-code')]");




//	public void scrollDown(String scrolldown){
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript(scrolldown, driver.findElement(scrollDowntillSelenium));
		
//	}

//	public void scrollDowmUsingPixel(String scroll){
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript(scroll);
//	
//	}
	
//	public void scrollUpUsingPixel(String scrollup){
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		try{
//			Thread.sleep(3000);
//			js.executeScript(scrollup);
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		
//	
//	}
	
	
	
	
	public void scrollBottomOfPage(String scrollbottom){
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript(scrollbottom);
	}
	
	
	
	
	
	
	
	
	

}
