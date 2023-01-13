package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  To understand navigation command in Selenium
| Date     :  13-Jan-2023
 =============================================================================*/


/*
 *                 Navigation Commands
➢ navigate().to() - loads a new web page in the current browser window.
➢ navigate().forward() - it does the same operation as clicking on the forward button of any browser.
➢ navigate().back() - it does the same operation as clicking on the back button of any browser.
➢ navigate().refresh() - refresh the current page. 
 */

public class Navigation {

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
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();

		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();

		driver.close();

	}

}
