package com.tripadvisor.login.ratingspage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ratings {
	WebDriver driver;
	
	public Ratings(WebDriver driver) {
		super();
		this.driver = driver;
	}


	private By scrollDownAndClickOnWriteReview = By.xpath("//a[@href='/UserReview-g641714-d1156207']");
	private By hoverOnRatings = By.xpath("//span[@id='bubble_rating']");
	private By enterTitleOfReview = By.xpath("//input[@id='ReviewTitle']");
	private By enterReview = By.xpath("//textarea[@id='ReviewText']");
	
	
	private By hoverOnServiceRatings = By.xpath("//span[@id='qid12_bubbles']");
	private By hoverOnValueRatings = By.xpath("//span[@id='qid13_bubbles']");
	private By hoverOnRoomsRatings = By.xpath("//span[@id='qid11_bubbles']");
	private By hoverOnCleanliness = By.xpath("//span[@id='qid14_bubbles']");
	private By hoverOnLocation = By.xpath("//span[@id='qid47_bubbles']");
	private By hoverOnSleepQuality = By.xpath("//span[@id='qid190_bubbles']");

	
	private By clickCheckBox = By.xpath("//input[@name='noFraud']");



public void clickReview(String scroll) {
	WebDriverWait webDriverWait = new WebDriverWait(driver , 20);
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(scrollDownAndClickOnWriteReview));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript(scroll);
	driver.findElement(scrollDownAndClickOnWriteReview).click();

}

public void hoverStars() {
	
		WebDriverWait webDriverWait = new WebDriverWait(driver , 50);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(hoverOnRatings));
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[@id='bubble_rating']")), 50, 0)
		.click().build().perform();
		
		
		
		
		
	
//new Actions(driver).moveToElement(new WebDriverWait(driver, 20).
//until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='bubble_rating']"))), 50, 0).
//click().build().perform();

}


public void enterTitle(String  title){
	driver.findElement(enterTitleOfReview).sendKeys(title);
}

public void writeReview(String review){
	driver.findElement(enterReview).sendKeys(review);
}


public void scrollDown(String scroll){
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript(scroll);
}


public void hoverServiceRatings(){
	WebDriverWait webDriverWait = new WebDriverWait(driver ,20);
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(hoverOnServiceRatings));
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(By.xpath("//span[@id='qid12_bubbles']")), 50, 0).click()
	.build().perform();
}

public void hoverValueRatings(){
	WebDriverWait webDriverWait = new WebDriverWait(driver ,20);
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(hoverOnValueRatings));
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(By.xpath("//span[@id='qid13_bubbles']")), 50, 0)
	.click().build().perform();
}

public void hoverRoomsRatings(){
	WebDriverWait webDriverWait = new WebDriverWait(driver ,30);
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(hoverOnRoomsRatings));
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(By.xpath("//span[@id='qid11_bubbles']")), 50, 0)
	.click().build().perform();
	
}


public void hoverCleanliness(){
	WebDriverWait webDriverWait = new WebDriverWait(driver ,30);
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(hoverOnCleanliness));
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(By.xpath("//span[@id='qid14_bubbles']")), 50, 0)
	.click().build().perform();
}


public void hoverLocation(){
	WebDriverWait webDriverWait = new WebDriverWait(driver ,30);
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(hoverOnLocation));
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(By.xpath("//span[@id='qid47_bubbles']")), 50, 0)
	.click().build().perform();
	
}


public void hoverSleepquality(){
	WebDriverWait webDriverWait = new WebDriverWait(driver ,30);
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(hoverOnSleepQuality));
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(By.xpath("//span[@id=qid190_bubbles']")), 50, 0)
	.click().build().perform();
	
}

public void selectCheckBox(){
	WebDriverWait webDriverWait = new WebDriverWait(driver ,20);
	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(clickCheckBox)).click();
	
}

}