package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {

		// property setting - key (driver name) , value(driver location)
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace_7AM_Batch\\Selenium_Concepts\\Driver\\chromedriver.exe");

		// browser launching syntax
		//Interface            Class
		WebDriver driver = new ChromeDriver();//upcasting
		//Parent               Child

		// get - url launch
		driver.get("https://www.flipkart.com/");

		// maximize
		driver.manage().window().maximize();

		// Navigation methods - to
		driver.navigate().to("https://www.amazon.in/");

		// back
		driver.navigate().back();//flipkart

		// getTitle
		String title = driver.getTitle();
		System.out.println("Title :" + title);

		// forward
		driver.navigate().forward();//amazon

		// getCurrentUrl
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url :" + currentUrl);

		Thread.sleep(2000);

		// refresh
		driver.navigate().refresh();

		// close
		driver.close();

	}

}
