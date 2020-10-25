package com.xworkz.login.welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
	WebDriver driver;

	public WelcomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	private By registerLink = By.linkText("Register");
	private By loginLink = By.xpath("//a[text()='Login']");

	public void clickOnRegisterLink() {
		driver.findElement(registerLink).click();
	}

	public void clickOnLoginLink() {
		driver.findElement(loginLink).click();
	}

	public void isRegisterLinkDisplayed() {
		boolean flag = driver.findElement(registerLink).isDisplayed();

		if (flag) {
			System.out.println("RegisterLink is displayed");
		} else {
			System.out.println("RegisterLink is not displayed");
		}
	}

	public void isLoginLinkDisplayed() {
		boolean flag = driver.findElement(loginLink).isDisplayed();

		if (flag) {
			System.out.println("LoginLink is displayed");
		} else {
			System.out.println("LoginLink is not displayed");
		}

	}

}
