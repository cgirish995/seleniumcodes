package com.xworkz.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.xworkz.login.welcomepage.WelcomePage;
import com.xworkz.login.RegisterPage.RegisterPage;

public class Tester {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/selenium-app");
		driver.manage().window().maximize();
		
		
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.registerlink();
		
		
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.enterEmail("cgirish995@gmail.com");
		registerPage.enterPassword("intel123");
		registerPage.repeatPassword("intel123");
		registerPage.selectDropDown("Selenium");
		registerPage.selectGender();
		registerPage.scrollDown("arguments[0].scrollIntoView(true)");
		registerPage.clickOnRegister();
		//registerPage.parentHandle();
		//registerPage.childHandle();
		registerPage.switchingWindows();
		//registerPage.switchingIframes();
		registerPage.handlingPopUps("xworkz-app");

	}

}
