package com.xworkz.login.registerpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
WebDriver driver;
	
	public RegisterPage(WebDriver driver){
		super();
		this.driver=driver;
	}
	
	
	private By enterEmailText = By.name("email");
	private By enterPasswordText = By.name("psw");
	private By enterRepeatPasswordText = By.name("pswrepeat");
	private By selectDropDown = By.name("courses");
	private By clickOnGender = By.id("male");
	private By clickOnRegisterButton = By.xpath("//button[text()='Register']");
	

	
	public void enterEmailID(String email){
		driver.findElement(enterEmailText).sendKeys(email);
	}
	
	
	public void enterPassword(String psw){
		driver.findElement(enterPasswordText).sendKeys(psw);
	}
	
	public void repeatPassword(String repeatpsw){
		driver.findElement(enterRepeatPasswordText).sendKeys(repeatpsw);
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
	
}
