package com.xworkz.xpath.excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTester {
	
	public static void RegisterTest(WebDriver driver) {
	
		WebElement clickOnRegister = driver.findElement(By.xpath("//a[@class='active']"));
		clickOnRegister.click();
	
			WebElement enterEmailText= driver.findElement(By.xpath("//input[@type='text']"));
			enterEmailText.sendKeys("cgirish995@gmail.com");
		
			WebElement enterpsw= driver.findElement(By.xpath("//input[@name='psw']"));
			enterpsw.sendKeys("apple@123");
	
			WebElement reEnterPsw= driver.findElement(By.xpath("//input[@id='psw-repeat']"));
			reEnterPsw.sendKeys("apple@123");
	

			WebElement radioButtonSelect = driver.findElement(By.xpath("//input[@value='male']"));
			radioButtonSelect.click();
			
			WebElement clickOnRegisterButton= driver.findElement(By.xpath("//button[@type='submit']"));
			clickOnRegisterButton.click();	
		
	}

	public static void LoginTest(WebDriver driver) {

		WebElement clickOnLogin = driver.findElement(By.xpath("//a[@href='login.do']"));
		clickOnLogin.click();
		
		WebElement enterEmailText = driver.findElement(By.xpath("//input[@name='email']"));
		enterEmailText.sendKeys("cgirish995@gmail.com");
		
		WebElement enterPsw = driver.findElement(By.xpath("//input[@name='psw']"));
		enterPsw.sendKeys("girish");
	
		WebElement clickOnLoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		clickOnLoginButton.click();
	}



	
}
