package com.xworkz.xpath.excercise;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExcercise {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
			chromeDriver.get("http://localhost:8080/xworkz-selenium");
			
				//By Xpath=By.xpath("//a[@class='active']");
			
//			try{
//			WebElement clickOnRegister= chromeDriver.findElement(By.xpath("//a[@class='active']"));
//			clickOnRegister.click();
//		
//
//			WebElement enterEmailText= chromeDriver.findElement(By.xpath("//input[@type='text']"));
//			enterEmailText.sendKeys("cgirish995@gmail.com");
//
//			WebElement enterpsw= chromeDriver.findElement(By.xpath("//input[@name='psw']"));
//			enterpsw.sendKeys("apple@123");
//			
//			WebElement reEnterPsw= chromeDriver.findElement(By.xpath("//input[@id='psw-repeat']"));
//			reEnterPsw.sendKeys("apple@123");
//		
//			WebElement radioButtonSelect = chromeDriver.findElement(By.xpath("//input[@value='male']"));
//			radioButtonSelect.click();
//			
//			
//			WebElement clickOnRegisterButton = chromeDriver.findElement(By.xpath("//button[@type='submit]"));
//			clickOnRegisterButton.click();
//					
//		} catch(RuntimeException e) {
//				System.out.println("Exception is :"+  "ElementClickInterceptedException");
//		} catch(Exception e) {
//			System.out.println("Element not found");
//		}
//		
		
			
//		WebElement clickOnLogin = chromeDriver.findElement(By.xpath("//a[@href='login.do']"));
//		clickOnLogin.click();
//		
//		WebElement enterEmailText = chromeDriver.findElement(By.xpath("//input[@name='email']"));
//		enterEmailText.sendKeys("cgirish995@gmail.com");
//		
//		WebElement enterPsw = chromeDriver.findElement(By.xpath("//input[@name='psw']"));
//		enterPsw.sendKeys("girish");
//		
//		WebElement clickOnLoginButton = chromeDriver.findElement(By.xpath("//button[@type='submit']"));
//		clickOnLoginButton.click();
			
			
	}
	
}


