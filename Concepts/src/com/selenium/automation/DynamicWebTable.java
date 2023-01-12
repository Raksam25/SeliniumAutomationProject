package com.selenium.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		// Setting chrome driver and launch the url 
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://money.rediff.com/gainers/bsc/daily/groupa";
		String company = "Tejas Networks";

		//Launch the application
		driver.get(url);

		// Maximize the application
		driver.manage().window().maximize();

		// Identify the Table
		String tableXpath = "//*[@id=\"leftcontainer\"]/table";
		WebElement empTable = driver.findElement(By.xpath(tableXpath));

		// Locating the rows of the table
		List<WebElement> rowsTable = empTable.findElements(By.tagName("tr"));

		// Total number of rows
		int rowCount = rowsTable.size();


		// Loop will read all the rows of the table
		outerloop:
			for(int row = 0; row < rowCount; row++) {
				// Locate the column
				List<WebElement> columnsRow = rowsTable.get(row).findElements(By.tagName("td"));
				// calculate the total number of columns
				int colCount = columnsRow.size();
				// For Loop will be executed till the last cell of the specified column of the table
				for(int col = 0 ; col < colCount; col++) {
					// Retrieve cell text
					String cellText = columnsRow.get(col).getText();
					String startXpath = "//*[@id=\"leftcontainer\"]/table/tbody/tr[";
					// Retrieve column values of company
					if(cellText.equals(company)) {
						// Company Name
						String companyName = driver.findElement(By.xpath(startXpath+row+"]/td[1]/a")).getText();
						System.out.println("Company Name is "+ companyName);
						// Group
						String group = driver.findElement(By.xpath(startXpath+row+"]/td[2]")).getText();
						System.out.println("Share Market Group is "+ group);
						// Previous Day Close Price
						String prevDay = driver.findElement(By.xpath(startXpath+row+"]/td[3]")).getText();
						System.out.println("Previous Day Close price is "+ prevDay);
						// Current Price
						String currentPrice = driver.findElement(By.xpath(startXpath+row+"]/td[4]")).getText();
						System.out.println("Current Price is "+ currentPrice);
						// % Change
						String change = driver.findElement(By.xpath(startXpath+row+"]/td[5]/font")).getText();
						System.out.println("% Change is "+ change);
						break outerloop;
					}
				}
			}
		// Close the Application
		driver.close();


	}

}
