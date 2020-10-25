package com.hyr.xpathoperators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hyr.xpathoperators.utils.UtilPage;
import com.hyr.xpathoperators.welcomepage.WelcomePage;

public class HYRTester {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();

		WelcomePage welcomePage = new WelcomePage(driver);
		// welcomePage.getLabel();
		welcomePage.scrollDown("arguments[0].scrollIntoView(true)");
		UtilPage.captureImage(driver, "img-1");
		welcomePage.enterFName("girish");
		UtilPage.captureImage(driver, "img-2");
		welcomePage.enterLName("chandrashekar");
		UtilPage.captureImage(driver, "img-3");

		welcomePage.enterEmailID("cgirish995@gmail.com");
		UtilPage.captureImage(driver, "img-4");
		welcomePage.enterPassword("intel123");
		UtilPage.captureImage(driver, "img-5");
		welcomePage.repeatPassword("inter123");
		UtilPage.captureImage(driver, "img-6");
		welcomePage.register();
		UtilPage.captureImage(driver, "img-7");

	}

}
