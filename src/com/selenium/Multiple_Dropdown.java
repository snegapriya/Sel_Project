package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\asus\\eclipse-workspace_7AM_Batch\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		driver.manage().window().maximize();

		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));

		// isMultiple
		Select s = new Select(multiple);
		boolean mul = s.isMultiple();
		System.out.println("Is Multiple :" + mul);

		s.selectByValue("1");

		s.selectByIndex(2);

		s.selectByVisibleText("Loadrunner");

	//	s.deselectByVisibleText("Loadrunner");

		System.out.println();

		// getOptions
		System.out.println("** Get Options **");
		List<WebElement> allOptions = s.getOptions();

		for (WebElement all : allOptions) {

			String text = all.getText();
			System.out.println(text);
		}

		System.out.println();

		// getAllSelectedOptions
		System.out.println("** All Selected Options **");

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		for (WebElement allSelected : allSelectedOptions) {

			String text = allSelected.getText();
			System.out.println(text);
			
		}
		System.out.println();

		// getFirstSelecteddOption
		System.out.println("** First Selected Option **");

		WebElement firstSelectedOption = s.getFirstSelectedOption();

		String text = firstSelectedOption.getText();
		System.out.println(text);

		// deselectAll
		s.deselectAll();

	}

}
