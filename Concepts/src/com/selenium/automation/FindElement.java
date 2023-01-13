package com.selenium.automation;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  To understand findElement() in Selenium
| Date     :  13-Jan-2023
 =============================================================================*/


/*  
 *  Web Element : represents an HTML element.
 *  Hypertext Markup Language is the standard markup language for creating web pages and web applications.
 *  An HTML element usually consists of a start tag and end tag, with the content inserted in between:
 *                   Syntax : <tagname> content </tagname>
 *                   
 *  HTML attributes provide additional information about HTML elements.
 *  Attributes are always specified in the start tag.
 *  Attributes usually come in name/value pairs like: name="value"
 */

//--------------------------------------------------------------------------------------------------------

/*
 *  Syntax: findElement(By.Locator())
 *      OR, WebElement elementName = driver.findElement(By.Locator("LocatorValue"));
 *  findelement : is the method to locate element on the webpage.
 *  By : is the mechanism used to locate elements within a document with the help of locator value. 
 *  locator : It is an address that identifies a web element uniquely within the web page.  
 *  findElement takes By object as the parameter and returns an object of type WebElement.      
 */

//------------------------------------------------------------------------------------------------------

/*
 * isDisplayed() - determines if an element is displayed or not.
 * isEnabled() - determines if an element is enabled or not.
 *  isSelected() - determines if an element is selected or not.
 *  sendKeys() - to enter the user input value.
 *  clear() - clear the values present in the text box.
 *  click() - to do click action/ select the element.
 *  submit() - to click the button
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://google.com");

		driver.navigate().to("https://demo.opencart.com/");

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		String arr = driver.getPageSource();
		System.out.println(arr);
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("test123@noaddress.com");
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();

		boolean flag =driver.findElement(By.name("password")).isDisplayed();
		System.out.println(flag);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Rak123");
		driver.findElement(By.cssSelector("#form-login > button")).click();
		
		driver.close();

	}

}
