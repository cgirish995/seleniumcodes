package com.xworkz.screenshot.inputpage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class InputPage {
	WebDriver driver;
	
	private By enterText = By.xpath("//input[@id='header_srch']");
	
	public InputPage(WebDriver driver){
		super();
		this.driver=driver;
		
	}
	
	public void enterSearchText(String text){
		driver.findElement(enterText).sendKeys(text);
	}
	
	public void screenshots2(){
		TakesScreenshot screenShots = (TakesScreenshot)driver;
		File screenshotAs = screenShots.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(screenshotAs,new File("E:\\screenshot\\Second.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	

}
