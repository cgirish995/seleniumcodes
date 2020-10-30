package com.xworkz.login.switchframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class SwitchingFrames {
	
		WebDriver driver;

		public SwitchingFrames(WebDriver driver) {
			super();
			this.driver = driver;
		}
		
		private By clickOnFrame = By.xpath("//button[text()='Frame']");
		private By clickOnIframeRegister = By.xpath("//a[text()='Register']");
		private By enterEmailText = By.name("email");
		private By enterPasswordText = By.name("psw");
		private By repeatPassword = By.name("pswrepeat");
		private By selectDropDown = By.name("courses");
		private By clickOnGender = By.id("male");
		private By clickOnRegisterButton = By.xpath("//button[text()='Register']");
		private By clickOnGoBack = By.xpath("//a[text()='GoBack']");
		private By clickOnBack = By.xpath("//a[text()='Back']");
		
		
		
		public void switchFrames(){
			driver.findElement(clickOnFrame).click();
			driver.switchTo().frame(0);
			
		}
		
		public void clickIframeRegister(){
			driver.findElement(clickOnIframeRegister).click();
		}
		
		public void enterEmailID(String email){
			driver.findElement(enterEmailText).sendKeys(email);
		}
		
		
		public void enterPassword(String psw){
			driver.findElement(enterPasswordText).sendKeys(psw);
		}
		
		public void repeatPassword(String repeatpsw){
			driver.findElement(repeatPassword).sendKeys(repeatpsw);
		}

		public void clickCourse(String options){
			Select select = new Select(driver.findElement(selectDropDown));
			select.selectByVisibleText(options);
		}
		
		
		public void selectGender(){
			driver.findElement(clickOnGender).click();
		}
		
		
		public void clickRegisterbutton(){
			driver.findElement(clickOnRegisterButton).click();
		}
		
		public void goBack(){
			driver.findElement(clickOnGoBack).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			driver.switchTo().defaultContent();
		}
		
		public void clickOnBack(){
			driver.findElement(clickOnBack).click();
		}
		
		
		
		
			
		
}
