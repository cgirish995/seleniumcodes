package com.xworkz.xpath.excercise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathZoho {
 static WebDriver driver;
 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.zoho.com/");
//driver.findElement(By.xpath("//li[contains(@class,'zp-main-apps zp-main-mail zapp-show')]")).click();
//driver.findElement(By.xpath("//li[contains(@class,'zp-main-apps zp-main-books zapp-show')]//a[text()='Books']")).click();
		

	}

}
