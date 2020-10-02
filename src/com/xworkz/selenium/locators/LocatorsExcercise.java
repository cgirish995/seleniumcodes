package com.xworkz.selenium.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsExcercise {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://localhost:8080/xworkz-selenium");
		chromeDriver.manage().window().maximize();
		
//		WebElement clickingOnRegister = chromeDriver.findElement(By.className("active"));
//		clickingOnRegister.click();
//		
//		WebElement entertext = chromeDriver.findElement(By.id("email"));
//		entertext.sendKeys("cgirish995@gmail.com");
//		
//		WebElement enterPsw = chromeDriver.findElement(By.id("psw"));
//		enterPsw.sendKeys("girish");
//		
//		WebElement reEnter = chromeDriver.findElement(By.id("psw-repeat"));
//		reEnter.sendKeys("girish");
//		
//		WebElement selectingDropDown= chromeDriver.findElement(By.id("courses"));
//		selectingDropDown.sendKeys("Selenium");
//		
//		WebElement radiobutton = chromeDriver.findElement(By.id("female"));
//		radiobutton.click();
		
	
		
		
//		WebElement clickingOnLogin = chromeDriver.findElement(By.linkText("Login"));
//		clickingOnLogin.click();
//	
//		WebElement entertext1 = chromeDriver.findElement(By.name("email"));
//		entertext1.sendKeys("girish");
//		
//		WebElement password = chromeDriver.findElement(By.name("psw"));
//		password.sendKeys("girish");
		
		
		
		
//		WebElement partialLink = chromeDriver.findElement(By.partialLinkText("ogin"));
//		partialLink.click();
		
//		List<WebElement> countingtags = chromeDriver.findElements(By.tagName("a"));
//		System.out.println(countingtags.size());
//		
//		
//		for(WebElement count : countingtags){
//			System.out.println(count.getText());
//		}
		
		

	}

}
