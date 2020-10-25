package com.xworkz.login.RegisterPage;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	WebDriver driver;
	
	
	public RegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
	}




	private By enterEmailText = By.name("email"); 
	private By enterPasswordText = By.name("psw"); 
	private By repeatPasswordText = By.name("pswrepeat"); 
	private By selectCourses=By.id("courses");
	private By selectGender =By.id("male");
	private By scrollDown = By.xpath("//button[contains(@class,'registerbtn')]");
	private By clickOnRegisterButton = By.xpath("//button[contains(@class,'registerbtn')]");
	private By clickOnNewTab = By.xpath("//a[@href='NewTab.jsp']");
	private By clickOnWelcome =By.xpath("//a[text()='Welcome']");
	private By clickOnFrame = By.xpath("//button[text()='Frame']");
	private By clickOnIframeRegister = By.xpath("//a[text()='Register']");
	private By iframe=By.xpath("//iframe[contains(@id,'framejsp')]");
	private By clickOnIframeBack = By.xpath("//a[contains(normalize-space(),'Back')]");

	
	private By clickOnAlert = By.xpath("//button[contains(text(),'Alert')]");
	private By clickOnPrompt = By.xpath("//button[text()='Prompt']");
	private By clickOnConfirm = By.xpath("//button[text()='Confirm']");
	
	public void enterEmail(String emailID){
		driver.findElement(enterEmailText).sendKeys(emailID);
	}
	
	public void enterPassword(String password){
		driver.findElement(enterPasswordText).sendKeys(password);
	}
	
	public void repeatPassword(String repeatpassword){
		driver.findElement(repeatPasswordText).sendKeys(repeatpassword);
	}
	
	
	public void selectDropDown(String options){
		
		Select selectCourse = new Select(driver.findElement(selectCourses));
		selectCourse.selectByVisibleText(options);

	}
	
	public void selectGender(){
		driver.findElement(selectGender).click();
	}
	
	
	public void scrollDown(String scrollDownTillPage){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(scrollDownTillPage,driver.findElement(scrollDown));
		
	}
	
	public void clickOnRegister(){
		driver.findElement(clickOnRegisterButton).click();
	}
	
	
	
//	public void parentHandle(){
//		String parentHandle = driver.getWindowHandle();
//		System.out.println(parentHandle);
//	}
	
//	public void childHandle(){
//		driver.findElement(clickOnNewTab).click();
//		String childHandle = driver.getWindowHandle();
//		System.out.println(childHandle);
//		
//	}
	
	
	
	public void switchingWindows(){
		String parentHandle=driver.getWindowHandle();
		//System.out.println(parentHandle);
		driver.findElement(clickOnNewTab).click();
		//String childHandle = driver.getWindowHandle();
		//System.out.println(childHandle);
		Set<String> handles = driver.getWindowHandles();
		for(String hand:handles){
			if(!hand.equals(parentHandle)){
				driver.switchTo().window(hand);
				driver.findElement(clickOnWelcome).click();
				System.out.println("Switched");
			}else{
				System.out.println("Both Handles are equal");
			}
			
		}
		
		try{
			Thread.sleep(2000);
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(parentHandle);
			driver.findElement(clickOnFrame).click();
			driver.switchTo().frame(0);
			//This is by Frame ID: driver.switchTo().frame("framejsp");
			//This is by WebElement :driver.switchTo().frame(driver.findElement(iframe));
			driver.findElement(clickOnIframeRegister).click();
			Thread.sleep(3000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(clickOnIframeBack).click();
			
			
			
			//driver.quit();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
	
//	public void switchingIframes(){
//	
//		String parentHandle=driver.getWindowHandle();
//		driver.findElement(clickOnFrame).click();
//			
//		Set<String> handlingIFrames= driver.getWindowHandles();
//		for(String frames :handlingIFrames){
//			System.out.println(frames);
//		}
		
		public void handlingPopUps(String keys){
			try{
			driver.findElement(clickOnAlert).click();
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			driver.findElement(clickOnPrompt).click();
			Thread.sleep(4000);
			//alert.accept();
			alert.sendKeys(keys);
			alert.accept();
			//alert.dismiss();
			
			driver.findElement(clickOnConfirm).click();
			Thread.sleep(4000);
			alert.dismiss();
		}catch(Exception e){
			e.printStackTrace();
		}
		 
		}
	}
