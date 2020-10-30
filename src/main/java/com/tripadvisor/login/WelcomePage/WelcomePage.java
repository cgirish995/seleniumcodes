package com.tripadvisor.login.WelcomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WelcomePage {
	
	WebDriver driver;
	
	
	
	public WelcomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	private By enterSearchText = By.xpath("//input[@placeholder='Where to?']");
	private By clickOnSearch = By.xpath("//div[@class='i3bZ_gBa _2RTs3_Ee _3TPJs5_m']//button[@class='_3mLX8jwB _2a_Ua4Qv']");
	
	
	
	
	public void searchText(String text){
		driver.findElement(enterSearchText).sendKeys(text);
	}
	
	public void clickSearch(){
		driver.findElement(clickOnSearch).click();
	}
	

	
}


