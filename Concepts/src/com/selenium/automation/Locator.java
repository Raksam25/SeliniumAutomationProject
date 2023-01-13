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
           
              Types of Locators:
1- class name:	Locates elements whose class name contains the search value (compound class names are not permitted)
2- css selector:	Locates elements matching a CSS selector
3- id:	Locates elements whose ID attribute matches the search value
4- name:	Locates elements whose NAME attribute matches the search value
5- link text:	Locates anchor elements whose visible text matches the search value
6- partial link text:	Locates anchor elements whose visible text contains the search value. If multiple elements are matching, only the first one will be selected.
7- tag name:	Locates elements whose tag name matches the search value
8- xpath:	Locates elements matching an XPath expression
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
