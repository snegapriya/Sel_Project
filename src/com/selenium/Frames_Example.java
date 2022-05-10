package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Example {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus\\eclipse-workspace_7AM_Batch\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		//single frame
		driver.switchTo().frame("singleframe");
		Thread.sleep(2000);
		WebElement textBox1 = driver.findElement(By.xpath("//input[@type='text']"));
		textBox1.sendKeys("Java");
		
		//defaultContent - from frame to webpage
		driver.switchTo().defaultContent();
		
		//multi frame
		WebElement iframeButton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframeButton.click();
		
		//outer frame
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);
		
		//inner frame
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);
		
		WebElement textBox2 = driver.findElement(By.xpath("//input[@type='text']"));
		textBox2.sendKeys("Selenium");
		
		//parent frame - from inner frame to outer frame
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
