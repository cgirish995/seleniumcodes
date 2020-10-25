package com.hyr.xpathoperators.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilPage {
	
	public static void captureImage(WebDriver driver, String filename){
		TakesScreenshot screenshots = (TakesScreenshot)driver;
		File images = screenshots.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(images, new File("E:\\screenshot\\"+filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
