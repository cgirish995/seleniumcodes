package com.hyr.xpathoperators.welcomepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WelcomePage {

	WebDriver driver;

	public WelcomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	private By getLabelText = By.xpath("//label[normalize-space(text())='First Name']");
	// input[@name='name']//preceding-sibling::label[text()='First Name ']
	// private By enterFirstName = By.xpath("//label[text()='First Name
	// ']/following-sibling::input[1]");//working
	private By enterFirstName = By.xpath("//label[text()='First Name ']/following::input[1]");
	// private By enterFirstName =
	// By.xpath("//div[@class='container']/child::input[1]");//working

	private By enterLastName = By.xpath("//label[text()='Last Name']/following-sibling::input[1]");

	private By enterEmail = By.xpath("//label[text()='Email']/following-sibling::input[1]");
	private By enterPsw = By.xpath("//label[text()='Password']/following::input[1]");
	private By repeatPsw = By.xpath("//label[text()='Repeat Password']/following::input[1]");
	private By clickOnRegister = By.xpath("//button[text()='Register']");

	public void enterFName(String name) {
		try {
			Thread.sleep(3000);
			driver.findElement(enterFirstName).sendKeys(name);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void scrollDown(String scroll) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(scroll, driver.findElement(enterFirstName));
	}

	public void enterLName(String lname) {
		driver.findElement(enterLastName).sendKeys(lname);
	}

	public void enterEmailID(String email) {
		driver.findElement(enterEmail).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(enterPsw).sendKeys(password);
	}

	public void repeatPassword(String repeat) {
		driver.findElement(repeatPsw).sendKeys(repeat);
	}

	public void register() {
		driver.findElement(clickOnRegister).click();
	}

}
