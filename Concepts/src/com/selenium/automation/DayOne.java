package com.selenium.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
       WebDriver driver;
       driver = new ChromeDriver();
       driver.get("https://google.com");
       /*
       driver.navigate().to("https://www.amazon.in/");
       

       
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
       */
       
       driver.navigate().to("https://demo.opencart.com/");
       
      // driver.navigate().back();
      // driver.navigate().forward();
       //driver.navigate().refresh();
       driver.manage().window().maximize();
      //String arr = driver.getPageSource();
      //System.out.println(arr);
       driver.findElement(By.linkText("My Account")).click();
       driver.findElement(By.linkText("Login")).click();
       driver.findElement(By.id("input-email")).sendKeys("test123@noaddress.com");
       driver.navigate().back();
       driver.navigate().refresh();
       driver.navigate().forward();
      
       //boolean flag =driver.findElement(By.name("password")).isDisplayed();
       //System.out.println(flag);
       //driver.findElement(By.name("password")).clear();
       driver.findElement(By.name("password")).sendKeys("Rak123");
       //driver.findElement(By.cssSelector("#form-login > button")).click();
       //driver.close();
       
    
       //driver.get("https://demo.opencart.com");
       //driver.navigate().to("https://demo.opencart.com/register");
      // driver.findElement(By.linkText("My Account")).click();
       //driver.findElement(By.linkText("Register")).click();
       
       
      // driver.close();
        
	}

}
