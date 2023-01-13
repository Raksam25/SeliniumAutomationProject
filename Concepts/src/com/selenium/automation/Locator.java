package com.selenium.automation;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  To understand locators in Selenium
| Date     :  12-Jan-2023
 =============================================================================*/

/*
 * Locator : It is an address that identifies a web element uniquely within the web page. 
 *           Locating the elements based on the provided locator values.
 * Many locators will match multiple elements on the page:
 *           find element method will return a reference to the first element found within a given context.
 *           find elements methods return a collection of element references. If there are no matches, an empty list is returned.
 * Types of Locators:
    1. id
    2. name
    3. linkText
    4. partialLinkText
    5. xpath
    6. cssSelector
    7. tagName
    8. className
 */
 
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
		
		// class name
		driver.findElement(By.className("btn-primary")).click();

		driver.navigate().back();

		// cssSelector locator
		driver.findElement(By.cssSelector("#form-login > button")).click();
        
		// tagName
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);

		
		// Close the application
		driver.close();

	}

}
