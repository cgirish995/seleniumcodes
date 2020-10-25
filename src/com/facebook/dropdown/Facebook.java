package com.facebook.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromeDriver\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.facebook.com/");
		
		try {
			WebElement clickOnCreateNewACcount = chromeDriver.findElement(By.xpath("//a[contains(@id,'u_0_2')]"));
			clickOnCreateNewACcount.click();
			Thread.sleep(3000);
			
			WebElement enterFirstName = chromeDriver.findElement(By.xpath("//input[@name='firstname']"));
			enterFirstName.sendKeys("Girish");
			
			WebElement enterMobileNo = chromeDriver.findElement(By.xpath("//input[@name='reg_email__']"));
			enterMobileNo.sendKeys("cgirish995@gmail.com");
			
			WebElement enterPassword= chromeDriver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			enterPassword.sendKeys("girish");


			WebElement selectDateOfBirth = chromeDriver.findElement(By.xpath("//select[@title='Day']"));
			Select select = new Select(selectDateOfBirth);
			select.selectByVisibleText("3");
			Thread.sleep(3000);
			
			WebElement selectMonth = chromeDriver.findElement(By.xpath("//select[@title='Month']"));
			Select select2 = new Select(selectMonth);
			select2.selectByValue("4");
			
			WebElement selectYear = chromeDriver.findElement(By.xpath("//select[@title='Year']"));
			Select select3 = new Select(selectYear);
			select3.selectByVisibleText("1995");
			
			WebElement selectingGender= chromeDriver.findElement(By.xpath("//input[@value='2']"));
			selectingGender.click();
			
			WebElement selectPronoun = chromeDriver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
			Select select4 = new Select(selectPronoun);
			select4.selectByVisibleText("He: Wish him a happy birthday!");
			
			
			
		} catch (Exception e) {
			
		}
		
//		
//		WebElement enterLastName = chromeDriver.findElement(By.xpath("//input[@name='lastname']"));
//		enterLastName.sendKeys("girish");
//		
//		WebElement enterMobileNo = chromeDriver.findElement(By.xpath("//input[@name='reg_email__']"));
//		enterMobileNo.sendKeys("cgirish995@gmail.com");
//		
//		WebElement enterPassword= chromeDriver.findElement(By.xpath("//input[@name='reg_passwd__']"));
//		enterPassword.sendKeys("girish");

//		WebElement selectDateOfBirth = chromeDriver.findElement(By.xpath("//select[contains(@name, 'birthday_day')]"));

		
//		Select select = new Select(selectDateOfBirth);
		//select.selectByValue("0");
		//select.selectByIndex(1);
//		select.selectByVisibleText("1");
		
	}

}
