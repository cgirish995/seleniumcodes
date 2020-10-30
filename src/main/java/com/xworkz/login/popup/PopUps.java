package com.xworkz.login.popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUps {
	
	WebDriver driver;
	
	public PopUps(WebDriver driver){
		super();
		this.driver=driver;
	}
	
	
	private By clickOnAlert = By.xpath("//button[text()='Alert']");
	private By clickOnPrompt = By.xpath("//button[text()='Prompt']");
	private By clickOnConfirm = By.xpath("//button[text()='Confirm']");
	
	
	
	public void selectAlert(){
		driver.findElement(clickOnAlert).click();
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(3000);
			alert.accept();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void selectPrompt(String value){
		driver.findElement(clickOnPrompt).click();
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(3000);
			alert.sendKeys(value);
			alert.accept();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	

}
	
	public void selectConfirm(){
		driver.findElement(clickOnConfirm).click();
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(3000);
			alert.dismiss();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		
	}
	
}
	
}

