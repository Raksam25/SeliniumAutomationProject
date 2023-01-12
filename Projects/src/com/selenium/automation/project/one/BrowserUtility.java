package com.selenium.automation.project.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility {
	public WebDriver driver;


	// Launch Browser.
	public WebDriver launchBrowser (String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome launch successfully");
		}

		else if (browser.equalsIgnoreCase("fiorefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Driver\\geckoriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox launch successfully");
		}
		return driver;
	}


	// Launch Browser + URL
	public WebDriver launchBrowser (String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome launch successfully");
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Driver\\geckoriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox launch successfully");
		}

		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}


	// Launch URL.
	public void enterUrl(String url) {
		if(url==null) {
			System.out.println("URL is null");
			return;
		}

		if (url.indexOf("http")==-1) {
			System.out.println("HTTP is missing");	
			return;
		}

		driver.get(url);
		driver.manage().window().maximize();
	}


	// Launch Browser + URL
	public WebDriver enterUrl(String browser, String url) {
		launchBrowser (browser);
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

}
