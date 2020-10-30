package com.xworkz.login.switchingwindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchingWindows {
	
	WebDriver driver;

	public SwitchingWindows(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	private By clickOnNewTab = By.xpath("//a[@href='NewTab.jsp']");
	private By clickOnWelcome = By.xpath("//a[text()='Welcome']");
	
	
	public  void switchWindows(){
		String parentHandle = driver.getWindowHandle();
//		System.out.println(parentHandle);
//		String childHandle = driver.getWindowHandle();
//		System.out.println(childHandle);
		
		driver.findElement(clickOnNewTab).click();
		Set<String> childHandles = driver.getWindowHandles();
		for(String handles: childHandles){
			if(!handles.equals(parentHandle)){
				driver.switchTo().window(handles);
				driver.findElement(clickOnWelcome).click();
				System.out.println("Switched");
			}else{
				System.out.println("Both Handles are equal");
			}
		}
		
		 
		try {
			Thread.sleep(2000);
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(parentHandle);
			
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	

}
