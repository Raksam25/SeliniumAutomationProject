package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayTw {
	static WebDriver driver;
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
	       
	        driver = new ChromeDriver();
	        driver.get("https://google.com");
	       
	        driver.navigate().to("https://demo.opencart.com/");
	        driver.manage().window().maximize();

	        driver.findElement(By.linkText("My Account")).click();
	        driver.findElement(By.linkText("Login")).click();
	        driver.findElement(By.id("input-email")).sendKeys("test123@noaddress.com");
	        driver.findElement(By.name("password")).sendKeys("Rak123");
	        driver.findElement(By.cssSelector("#form-login > button")).click();
	        //driver.close();
	        
	}

}
