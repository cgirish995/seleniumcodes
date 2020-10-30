package com.tripadvisor.login.windowswitching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowSwitching {
	WebDriver driver;

	public WindowSwitching(WebDriver driver) {
		super();
		this.driver = driver;
	}

	private By clickOnClubMahindra = By.xpath("//span[text()='Club Mahindra Madikeri, Coorg']");

	
	
	public void Switchwindows() {
		String parentHandle = driver.getWindowHandle();
		WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(clickOnClubMahindra)).click();
		// driver.findElement(clickOnClubMahindra).click();
		Set<String> childHandles = driver.getWindowHandles();
		for (String hand : childHandles) {
			if (!hand.equals(parentHandle)) {
				driver.switchTo().window(hand);
				System.out.println("Switched");
			} else {
				System.out.println("Both handles are equal");
			}
		}
	}

	
}
