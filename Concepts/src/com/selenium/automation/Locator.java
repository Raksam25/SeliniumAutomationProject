package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {


		// Set the System properties for Chrome Driver
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");

		// Create Object instance for Chrome driver
		WebDriver driver = new ChromeDriver();

		//Launch URL 
		String url = "https://demo.opencart.com/";
		driver.get(url);

		// Maximize browser window
		driver.manage().window().maximize();


		// linkText locator
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.navigate().refresh();

		// ID Locator
		driver.findElement(By.id("input-email")).sendKeys("test123@noaddress.com");


		// Name locator
		driver.findElement(By.name("password")).sendKeys("12345");

		// partialLinkText locator
		driver.findElement(By.partialLinkText("Forgotten")).click();

		// xpath Locator
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test123@noaddress.com");

		driver.navigate().back();

		// cssSelector locator
		driver.findElement(By.cssSelector("#form-login > button")).click();


		// Close the application
		// driver.close();

	}

}
