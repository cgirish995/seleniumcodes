package com.xworkz.login.capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utlis {
	
	
	
	public static void screenshots(WebDriver driver, String file){
		TakesScreenshot	shots = (TakesScreenshot) driver;
		File images = shots.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(images,new File("E:\\screenshot\\xworkz\\"+file+ ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void scrollDown(WebDriver driver , String command){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(command);
		
	}
	
	
	 

}
