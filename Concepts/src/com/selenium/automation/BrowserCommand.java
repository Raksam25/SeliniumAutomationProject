package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  To understand browser command in Selenium
| Date     :  13-Jan-2023
 =============================================================================*/

/*               Browser Commands
➢ get () - load a new web page in the current browser window
➢ getTitle() - fetches the title of the current page
➢ getCurrentUrl() - fetches the string representing the current url which is opened in the browser
➢ getPageSource() - returns the source code of the page.
➢ close() - close only the current window the webdriver is currently controlling
➢ quit() - closes all windows opened by the webdriver
 */

public class BrowserCommand {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");

		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());

		driver.close();


	}

}
