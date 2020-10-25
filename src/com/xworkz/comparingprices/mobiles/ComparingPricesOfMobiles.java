package com.xworkz.comparingprices.mobiles;


 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComparingPricesOfMobiles {

	static WebDriver driver;

	public static void launchingAmazonBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");

	}

	public static String amazonTest() throws InterruptedException {
	

		WebElement searchForAppleIphone = driver.findElement(By.xpath("//input[contains(@name,'field-keywords')]"));
		searchForAppleIphone.sendKeys("Apple iPhone 11 (128GB) - White");

		WebElement clickOnSearchButton = driver.findElement(By.xpath("//input[contains(@value,'Go')]"));
		clickOnSearchButton.click();
		Thread.sleep(3000);
		

		WebElement getPrice = driver.findElement(By.xpath("//a[contains(@href, '/Apple-iPhone-11-128GB-White/')]//span[text()='71,600']"));

		String price = getPrice.getText().replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("The price of Apple iPhone 11 (128GB) - White  in Amazon is : " + price);

		return price;

	}

	public static void launchingFlipKartBrowser() {
		driver.get("https://www.flipkart.com/");

	}

	public static String flipKartTest() throws InterruptedException {

		WebElement clickOnCross = driver.findElement(By.xpath("//button[contains(@class,'_2AkmmA _29YdH8')]"));
		clickOnCross.click();

		WebElement enterAppleIphone = driver
				.findElement(By.xpath("//input[contains(@title,'Search for products, brands and more')]"));
		enterAppleIphone.sendKeys("Apple iPhone 11 (128GB) - White");

		WebElement clickOnSearch = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		clickOnSearch.click();
		Thread.sleep(5000);

		WebElement getPrice2 = driver.findElement(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));

		String flipkart = getPrice2.getText().replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("The price of Amazon Apple iPhone 11 (128GB) - White in flipkart is  : " + flipkart);

		return flipkart;
				
		

	}

	
	
public static void comparePrices() throws InterruptedException  {
		

		String price = amazonTest();
		String flipkart = flipKartTest();

		
		
		double aPrice = Integer.parseInt(price);
		double fPrice = Integer.parseInt(flipkart);

		if (aPrice > fPrice) {
			System.out.println("The price of Amazon is greater than flipkart :" + aPrice);
		} else if (fPrice < aPrice) {
			System.out.println("The price of FlipKart is greater than Amazon:" + fPrice);
		} else {
			System.out.println("Both the prices are equal");
		}
		
		
		
		
}

	public static void main(String[] args) throws InterruptedException  {
	

		ComparingPricesOfMobiles.launchingAmazonBrowser();		
		//ComparingPricesOfMobiles.amazonTest();	
		
		//ComparingPricesOfMobiles.launchingFlipKartBrowser();
		//ComparingPricesOfMobiles.flipKartTest();
		ComparingPricesOfMobiles.comparePrices();
		
		
		
	
		
		
		
	}

} 
