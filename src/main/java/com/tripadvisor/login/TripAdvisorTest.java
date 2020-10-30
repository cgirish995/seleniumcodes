package com.tripadvisor.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tripadvisor.login.WelcomePage.WelcomePage;
import com.tripadvisor.login.ratingspage.Ratings;
import com.tripadvisor.login.windowswitching.WindowSwitching;

public class TripAdvisorTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		
		
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.searchText("Club Mahindra");
		welcomePage.clickSearch();


		WindowSwitching windowSwitching = new WindowSwitching(driver);
		windowSwitching.Switchwindows();
		
		Ratings ratings = new Ratings(driver);
		ratings.clickReview("window.scrollBy(0,500)");
		ratings.hoverStars();
		ratings.enterTitle("I'he visited the Mysore last year");
		ratings.writeReview("Best place to visit");
		ratings.scrollDown("window.scrollBy(0,1500)");
		
		ratings.hoverServiceRatings();
		//ratings.hoverCleanliness();
		//ratings.hoverValueRatings();
		//ratings.hoverLocation();
		//ratings.hoverSleepquality();
		//ratings.hoverRoomsRatings();
		ratings.selectCheckBox();
		
		

		
		
		
		

	}

}
