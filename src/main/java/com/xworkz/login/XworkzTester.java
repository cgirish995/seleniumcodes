package com.xworkz.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.xworkz.login.capturescreen.Utlis;
import com.xworkz.login.popup.PopUps;
import com.xworkz.login.registerpage.RegisterPage;
import com.xworkz.login.switchframes.SwitchingFrames;
import com.xworkz.login.switchingwindows.SwitchingWindows;
import com.xworkz.login.welcomepage.WelcomePage;

public class XworkzTester {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/selenium-app/");
		driver.manage().window().maximize();

		WelcomePage welcomePage = new WelcomePage(driver);
		Utlis.screenshots(driver, "xworkz-welcomePage");
		welcomePage.clickRegister();
		Utlis.screenshots(driver, "xworkz-imgRegisterPage");

		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.enterEmailID("cgirish995@gmail.com");
		registerPage.enterPassword("intel123");
		registerPage.repeatPassword("intel123");
		Utlis.screenshots(driver, "xworkz-FillingRegisterPage1");
		registerPage.clickCourse("Angular");
		Utlis.scrollDown(driver, "window.scrollTo(0,document.body.scrollHeight)");
		registerPage.selectGender();
		// Utlis.screenshots(driver, "xworkz-FillingRegisterPage2");
		registerPage.clickRegisterbutton();

		SwitchingWindows switchingWindows = new SwitchingWindows(driver);
		switchingWindows.switchWindows();

		SwitchingFrames switchingFrames = new SwitchingFrames(driver);
		switchingFrames.switchFrames();
		switchingFrames.clickIframeRegister();
		switchingFrames.enterEmailID("girish@gmail.com");
		switchingFrames.enterPassword("intel123");
		switchingFrames.repeatPassword("intel123");
		switchingFrames.clickCourse("Hibernate");
		Utlis.scrollDown(driver, "window.scrollTo(0,document.body.scrollHeight)");
		switchingFrames.clickRegisterbutton();
		switchingFrames.goBack();
		switchingFrames.clickOnBack();
		
		
		PopUps popUps = new PopUps(driver);
		popUps.selectAlert();
		popUps.selectPrompt("application");
		popUps.selectConfirm();

	}

}
