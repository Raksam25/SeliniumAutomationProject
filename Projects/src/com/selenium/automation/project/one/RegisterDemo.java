package com.selenium.automation.project.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterDemo {

	public static void main(String[] args) {

		BrowserUtility brUtil = new BrowserUtility( );
		
		//brUtil.launchBrowser("CHROME");
		//brUtil.enterUrl("https://google.com");
		
		
		WebDriver driver = brUtil.enterUrl("CHROME", "https://demo.opencart.com/");
		
		ElementUtility elemUtil= new ElementUtility(driver);
		
		By accountLocator = By.linkText("My Account");
		elemUtil.doClick(accountLocator);
		
		By loginLocator = By.linkText("Login");
		elemUtil.doClick(loginLocator);
		
		By emailLocator = By.id("input-email");
		
		if(elemUtil.boxIsSelected(emailLocator)){
		elemUtil.doSendKeys(emailLocator, "test123@noaddress.com");
		System.out.println("Email is entered successfully");
		}
		else {
			System.out.println("Email box is disabled");
		}
			
		
		
		
	}

}
