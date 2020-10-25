package com.xworkz.screenshot.welcompage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class WelcomePage {
	
	WebDriver driver;
	
	

	
	private By enterText = By.xpath("//input[@id='header_srch']");
	private By clickOnSearch = By.xpath("//span[@class='search_icon input-search-icon']");
	
	
	
	
	public WelcomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	public void enterSearchText(String text){
		driver.findElement(enterText).sendKeys(text);
	}
	
	public void search(){
		driver.findElement(clickOnSearch).click();
	}
	
	
	


		
	}


