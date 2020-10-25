package com.xworkz.comparingprices.mobiles;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOfMobiles {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//amazonTest();
		//flipkartTest();
		compareTest();

	}



	public static void compareTest() throws InterruptedException, NumberFormatException {


		String amazonprice = amazonTest();
		String flipkartPrice = flipkartTest();

		int aP = Integer.parseInt(amazonprice);
		int fP =Integer.parseInt(flipkartPrice);


		if(aP > fP){
			System.out.println("The price of Apple Iphone in Amazon is higher than Flipkart:" + aP);
		}else if(aP < fP){
			System.out.println("The price of Apple Iphone in Flipkart is lesser than Amazon :" + fP);
		}else{
			System.out.println("Both Prices are equal");
		}


	}



	public static String amazonTest() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Apple iPhone 11 (128GB) - White");
		driver.findElement(By.xpath("//input[contains(@value,'Go')]")).click();Thread.sleep(3000);;
		String amazonprice=driver.findElement(By.xpath("//a[contains(@href, '/Apple-iPhone-11-128GB-White/')]//span[text()='71,600']")).getText().replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("The price Apple iPhone 11 (128GB) - White in Amazon is :" + amazonprice);

		return amazonprice;
	}


	public static String flipkartTest() throws InterruptedException {
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(@class,'_2AkmmA _29YdH8')]")).click();
		driver.findElement(By.xpath("//input[contains(@title,'Search for products, brands and more')]")).sendKeys("Apple iPhone 11 (128GB) - White");
		driver.findElement(By.xpath("//button[contains(@class,'vh79eN')]")).click();Thread.sleep(5000);
		String flipkartPrice=driver.findElement(By.xpath("//div[@class='_1vC4OE _2rQ-NK']")).getText().replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("The price of Apple iPhone 11 (128GB) - White in Flipkart is : " + flipkartPrice);
		driver.close();
		return flipkartPrice;

	}

}








