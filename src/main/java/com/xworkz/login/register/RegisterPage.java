package com.xworkz.login.register;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	private By enterEmailTextBox = By.xpath("//input[contains(@type,'text')]");
	private By enterPasswordTextBox = By.xpath("//input[contains(@placeholder,'Enter Password')]");
	private By renterPasswordTextBox = By.xpath("//input[contains(@name,'pswrepeat')]");
	private By selectingDropDown = By.xpath("//select[contains(@id,'courses')]");
	private By selectingRadioButton = By.id("male");
	private By clickRegisterButton = By.className("registerbtn");

	// By.xpath("//input[@id='male']");

	public void enterEmailId(String email) {
		driver.findElement(enterEmailTextBox).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(enterPasswordTextBox).sendKeys(password);
	}

	public void renterPasswordTextBox(String repeatpassword) {
		driver.findElement(renterPasswordTextBox).sendKeys(repeatpassword);
	}

	public void selectCoursesFromDropdown(String optionsIndex) {

		Select select = new Select(driver.findElement(selectingDropDown));
		select.selectByVisibleText(optionsIndex);
		// select.selectByValue(optionsIndex);
		// select.selectByIndex(optionsIndex);

	}

	public void radioButton() {
		driver.findElement(selectingRadioButton).click();
	}

	public void clickregister(String scrolldown) {
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript(scrolldown);
		driver.findElement(clickRegisterButton).click();
	}

	public void isEmailTextBoxEnabled() {
		boolean enabled = driver.findElement(enterEmailTextBox).isEnabled();

		if (enabled) {
			System.out.println("EmaiTextbox is Enabled");
		} else {
			System.out.println("EmaiTextbox is not Enabled");
		}
	}

}
