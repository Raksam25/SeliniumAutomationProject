package com.selenium.automation.project.one;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ElementUtility {
	public WebDriver driver;

	public ElementUtility (WebDriver driver) {
		this.driver = driver;
	}

// WebElement methods
	public WebElement getElement(By locator) {
		return driver.findElement(locator);	
	}	

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}	

	public void doClick(By locator) {
		getElement(locator).click();
	}



	// WebElements methods
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);	
	}

	public List<String> getAttributeList (By locator, String attributeName) {
		List<WebElement> elemList = getElements(locator);
		List<String> attrList = new ArrayList <String> ();

		for(WebElement e : elemList) {
			String attrValue = e.getAttribute(attributeName);
			attrList.add(attrValue);
		}
		return attrList;
	}
	
	public List<String> getElementText (By locator) {
		List<WebElement> elemList = getElements(locator);
		List<String> elemText = new ArrayList <String> ();

		for(WebElement e : elemList) {
			String text = e.getText();
			elemText.add(text);
		}
		return elemText;
	}


	// WebElements print methods
	public void printElementValue (List<String> elemList) {
		for(String e : elemList) {
			System.out.println(e);
		}
	}
	
	public void printElementValue (By locator) {
		List<String> elemText = getElementText (locator);
		for(String e : elemText) {
			System.out.println(e);
		}
	}


	// Boolean methods to check text in page, Input box and button.
	public boolean textIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public boolean boxIsSelected(By locator) {
		return getElement(locator).isEnabled();
	}

	public boolean buttonIsSelected(By locator) {
		return getElement(locator).isSelected() ;
	}


}

