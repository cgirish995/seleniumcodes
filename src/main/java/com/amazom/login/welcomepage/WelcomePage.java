package com.amazom.login.welcomepage;

import org.openqa.selenium.WebDriver;

public class WelcomePage {
	
	WebDriver driver;
	
	public WelcomePage(WebDriver driver){
		super();
		this.driver=driver;
	}
	
	
	public void navigate(){
		driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
	}
	
	
	
	
	

}
