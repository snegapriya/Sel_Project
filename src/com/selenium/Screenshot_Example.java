package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Example {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace_7AM_Batch\\Selenium_Concepts\\Driver\\chromedriver.exe");

		//large interface
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//TakesScreenshot - small interface
		TakesScreenshot ts = (TakesScreenshot) driver; //narrowing type casting
		
		//getScreenshotAs - used to take the screenshot
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//location
		File dest = new File("C:\\Users\\asus\\eclipse-workspace_7AM_Batch\\Selenium_Concepts\\Screenshots\\amazon.png");
		
		//copy the file to particular location
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
	}
}
