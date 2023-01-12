package com.telus.selenium.assignment;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMultipleBrowser {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		
		// Set system property for the chrome driver
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		//Creating instance of Chrome driver and launching
		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/multiplewindows/";
		driver.get(url);
		
		// Maximize the application
		driver.manage().window().maximize();
		System.out.println("Parent Browser is opened");
		
		// Open new browser
		driver.findElement(By.xpath("//button[contains(@name,'newbrowser')]")).click();     
		System.out.println("Child Browser is opened");
		driver.manage().window().maximize();

		
		//Get window ID 
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator = windowId.iterator();
		
		// Storing the window id
		String homePage = iterator.next();
		System.out.println("First Browser ID:  " + homePage);
		String newPage = iterator.next(); 
		System.out.println("Second Browser ID: " + newPage);
		
		
		
		
		// Switching the control to new window and performing all the operations in New Page Window
		driver.switchTo().window(newPage);

		// Maximize the child browser
		driver.manage().window().maximize();

		
		//Click on Python Libraries 
		driver.findElement(By.linkText("PYTHON LIBRARIES")).click();
		System.out.println("Python Libraries is loaded in Child Browser");
		
		//Close the browser
		driver.close();

		// Switching to the parent window 
		driver.switchTo().window(homePage);
		System.out.println("Parent Browser is Active");
		
		// Click on QA Automation link
		driver.findElement(By.linkText("QA AUTOMATION")).click();
		System.out.println("QA Automation Page is loaded in Parent Browser");
		
		// Close the application
		driver.close();
		System.out.println("Parent Browser is closed");
		
		
	}

}
