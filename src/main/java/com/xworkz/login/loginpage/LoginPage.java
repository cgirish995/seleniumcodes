package com.xworkz.login.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	private By clickOnLoginLink = By.xpath("//a[text()='Login']");
	private By enterEmailText = By.name("email");
	private By enterPasswordText = By.name("psw");
	private By clickOnRegister = By.xpath("//button[text()='Login']");

	public void clickOnLogin() {
		driver.findElement(clickOnLoginLink).click();
	}

	public void enterEmailID(String email) {
		driver.findElement(enterEmailText).sendKeys(email);

	}

	public void enterPassword(String password) {
		driver.findElement(enterPasswordText).sendKeys(password);
	}

	public void clickRegister() {
		driver.findElement(clickOnRegister).click();
	}

}