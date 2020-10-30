package com.xworkz.login.welcomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
	
	WebDriver driver;
	
	public WelcomePage(WebDriver driver){
		super();
		this.driver=driver;
	}
	
	private By clickOnRegister = By.xpath("//a[text()='Register']");
	private By clickOnLogin = By.xpath("//a[text()='Login']");
	
	
	public void clickRegister(){
		driver.findElement(clickOnRegister).click();
		
	}
	
	public void clickLogin(){
		driver.findElement(clickOnLogin).click();
	}
	

}
