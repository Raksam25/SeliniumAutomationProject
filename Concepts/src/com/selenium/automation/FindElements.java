package com.selenium.automation;

/*=============================================================================
| Author   :  Rakesh Samant
| LinkedIn :  rakesh-samant-2505
| Project  :  Automation Testing
| Purpose  :  To understand findElements() in Selenium
| Date     :  13-Jan-2023
 =============================================================================*/

/*
 * Syntax: driver.findElements(By.Locator())
 *         List<WebElement> elementName = driver.findElements(By.Locator("LocatorValue")); 
 * findElements takes in By object as the parameter and returns a list of web elements.        
 * returns an empty list if there are no elements found using the given locator.
 * 
 */

//---------------------------------------------------------------------------------------------------------
/*
 * getAttribute() - get the value of an element.
 * getText() - get the value of the element.
 * isEmpty() - method checks whether a string is empty or not. This method returns true if the string is empty (length() is 0), and false if not.
 */


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://google.com");

		driver.navigate().to("https://www.amazon.in/");
		

		// To fetch the text of links
		
		List <WebElement> lnkList =  driver.findElements(By.tagName("a"));	
		System.out.println(lnkList.size());
		for(int i=0; i<lnkList.size(); i++) {
			String text = lnkList.get(i).getText();
			System.out.println(text);
		}


		for (WebElement e : lnkList) {    
			String txt = e.getText();
			if(!txt.isEmpty()) {
				System.out.println(txt);   
			}
		}


		// To fetch the link

		List <WebElement> lnkImage =  driver.findElements(By.tagName("img"));	
		System.out.println(lnkImage.size());
		for(int i=0; i<lnkImage.size(); i++) {
			String text = lnkImage.get(i).getAttribute("src");
			System.out.println(text);
		}


		for (WebElement e : lnkList) {
			String txt = e.getText();
			if(!txt.isEmpty()) {
				System.out.println(txt);
			}
		}


		driver.close();
	}

}
