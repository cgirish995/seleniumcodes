package com.xworkz.login.welcomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
	
	WebDriver driver;
	
	
	public WelcomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	private By clickOnRegisterLink = By.partialLinkText("Register");
	
	public void registerlink(){
		driver.findElement(clickOnRegisterLink).click();
	}
	
	
	
	

}
