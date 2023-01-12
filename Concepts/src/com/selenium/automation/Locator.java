package com.selenium.automation;

/*=============================================================================
| author   :  rakesh samant
| linkedin :  rakesh-samant-2505
| project  :  automation testing
| purpose  :  To understand locators in selenium
| date     :  12-jan-2023
 =============================================================================*/
 
 /*
Type of locators in selenium:
1. id
2. name
3. linktext
4. partiallinktext
5. xpath
6. cssselector
7. tagname
8. classname
*/

import org.openqa.selenium.by;
import org.openqa.selenium.webdriver;
import org.openqa.selenium.chrome.chromedriver;

public class Locator {

	public static void main(string[] args) {


		// set the system properties for chrome driver
		system.setproperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");

		// create object instance for chrome driver
		webdriver driver = new chromedriver();

		//launch url 
		string url = "https://demo.opencart.com/";
		driver.get(url);

		// maximize browser window
		driver.manage().window().maximize();


		// linktext locator
		driver.findelement(by.linktext("my account")).click();
		driver.findelement(by.linktext("login")).click();
		
		driver.navigate().refresh();

		// id locator
		driver.findelement(by.id("input-email")).sendkeys("test123@noaddress.com");


		// name locator
		driver.findelement(by.name("password")).sendkeys("12345");

		// partiallinktext locator
		driver.findelement(by.partiallinktext("forgotten")).click();

		// xpath locator
		driver.findelement(by.xpath("//*[@id=\"input-email\"]")).sendkeys("test123@noaddress.com");
		
		// class name
		driver.findelement(by.classname("btn-primary")).click();

		driver.navigate().back();

		// cssselector locator
		driver.findelement(by.cssselector("#form-login > button")).click();
        
		// tagname
		string text = driver.findelement(by.tagname("h2")).gettext();
		system.out.println(text);

		
		// close the application
		driver.close();

	}

}
