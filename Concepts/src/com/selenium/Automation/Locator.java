package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set the System properties for Chrome Driver
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");

		// Create Object instance for Chrome driver
		WebDriver driver = new ChromeDriver();

		//Launch URL 
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);

		// Maximize browser window
		driver.manage().window().maximize();

		// ID Locator
		//First Name
		driver.findElement(By.id("vfb-5")).sendKeys("Rakesh");
		//Last Name
		driver.findElement(By.id("vfb-7")).sendKeys("Samant");

		// xpath Locator
		// Select Gender Radio button
		driver.findElement(By.xpath("//*[@value='Male']"));

		// Name locator
		// Address 1
		driver.findElement(By.name("vfb-13[address]")).sendKeys("Noida");
		// Address 2
		driver.findElement(By.name("vfb-13[address-2]")).sendKeys("Delta 1");

		// cssSelector locator
		// Enter email
		driver.findElement(By.cssSelector("#vfb-14")).sendKeys("noname@noaddress.com");

		// linkText locator
		//Click on About Me
		driver.findElement(By.linkText("ABOUT ME")).click();
		
		// partialLinkText locator
		// Click on Python Libraries Link
		driver.findElement(By.partialLinkText("LIBRARIES")).click();
	
		// Close the application
		driver.close();
	}

}
