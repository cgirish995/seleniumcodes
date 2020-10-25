package com.xworkz.login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.xworkz.login.loginpage.LoginPage;
import com.xworkz.login.register.RegisterPage;
import com.xworkz.login.welcome.WelcomePage;

public class Tester {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/selenium-app");

		//
		// WelcomePage welcomePage = new WelcomePage(driver);
		// welcomePage.isRegisterLinkDisplayed();
		// welcomePage.isLoginLinkDisplayed();
		// welcomePage.clickOnRegisterLink();
		// welcomePage.clickOnLoginLink();

		// RegisterPage registerPage = new RegisterPage(driver);
		// registerPage.isEmailTextBoxEnabled();
		// registerPage.enterEmailId("cgirish995@gmail.com");
		// registerPage.enterPassword("girish123");
		// registerPage.renterPasswordTextBox("girish123");
		// registerPage.selectCoursesFromDropdown("Selenium");
		// registerPage.radioButton();
		//// JavascriptExecutor js = (JavascriptExecutor)(driver);
		//// String script= "scrollBy(457,1440)";
		//// js.executeScript(script);
		// registerPage.clickregister("457,1440");

		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnLogin();
		loginPage.enterEmailID("cgirish995@gmail.com");
		loginPage.enterPassword("girish123");
		loginPage.clickRegister();

	}

}
