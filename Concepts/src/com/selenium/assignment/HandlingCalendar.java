package com.telus.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendar {

	
	public static void selectDate(WebElement calendar,String year,String monthName,String day,WebDriver driver) {
		// Click on Calendar
		calendar.click();
		// Retrieve the current year and month
		WebElement date = driver.findElement(By.className("DayPicker-Caption"));
		String currentYear = date.getText();
		// Next Button 
		WebElement next = driver.findElement(By.xpath("//*[@aria-label='Next Month']"));
		// Click on next arrow till we get the desired year
		if(!currentYear.contains(year)) {
		do {
		next.click();
		}while(!date.getText().contains(year));
		}
		// Select the month
		String currentMonth = date.getText();
		if(!currentMonth.contains(monthName)) {
		do {
		next.click();
		}while(!date.getText().contains(monthName));
		}
		// Select the Date
		WebElement selectDay = 
		driver.findElement(By.xpath("//p[contains(text(),"+day+")]"));
		selectDay.click();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//Launch URL
				driver.get("https://www.makemytrip.com/");
				driver.manage().window().maximize();
				// Click on Calendar
				WebElement departure = driver.findElement(By.xpath("//*[contains(text(),'departure')]"));
				WebElement returning = driver.findElement(By.xpath("//*[contains(text(),'return')]"));
				// Selecting the Departure 
				AssignmentHandlingDate.selectDate(departure, "2022", "Nov", "29", driver);
				// Selecting the Return Date
				AssignmentHandlingDate.selectDate(returning, "2022", "Nov", "30", driver);
				
	}	
	
}
