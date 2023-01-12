package com.telus.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterDemoFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring Variable
		String firstNameValue = "Rakesh";
		String lastNameValue = "Samant";
		String country = "India";
		String emailID = "ratest@noaddress.com";
		String mobileNumber = "9876543201";
		String zipCode = "564321";
		String state = "Uttar Pradesh";
		String city = "Noida";
		String streetAddress = "Near Metro Station";
		String apt = "24-A";
		String queries = "What is the duration of Courses ?";
		String demoDate = "10/20/2022";
		String hour = "10";
		String minute = "45";

		// Set the System properties for Chrome Driver
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");

		// Create Object instance for Chrome driver
		WebDriver driver = new ChromeDriver();

		// Launch the URL
		String url = "https://nxtgenaiacademy.com/";
		driver.get(url);

		// Maximize browser window
		driver.manage().window().maximize();
		Actions action = new Actions(driver);

		//Perform mouse hover above QA Automation
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();

		//Perform mouse hover above Practice Automation
		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(practiceAutomation).perform();

		//Registration page
		WebElement registerForm= driver.findElement(By.partialLinkText("Registration Form"));
		registerForm.click();

		//Validating the Title
		String actTitle = driver.getTitle();
		String expTitle = "Demo Site – Registration Form – NxtGen A.I Academy";
		if(actTitle.equals(expTitle)) {
			System.out.println("Actual and Expected titles are same");
			System.out.println("Title of the Page : "+actTitle);
		}
		else {
			System.out.println("Actual and Expected titles are not same");
			System.out.println("Actual title of page : "+actTitle);
			System.out.println("Expected titles of page : "+expTitle);
		}
		System.out.println();

		//Validating the Registration page
		WebElement registerTitle = driver.findElement(By.xpath("//*[normalize-space()='Register For Demo']"));

		if(registerTitle.isDisplayed()) {
			System.out.println("Registration form title is displayed");
			String exptTitle = "Register For Demo";
			String actualTitle = registerTitle.getText();
			if(actualTitle.equals(exptTitle)) {
				System.out.println("Actual and Expected Registration form titles are same");
				System.out.println("Title of the Page : "+actualTitle);		
			}
			else {
				System.out.println("Actual and Expected Registration form titles are not same");
				System.out.println("Actual Registration title of the Page : "+actualTitle);
				System.out.println("Expected Registration title of the Page : "+exptTitle);
			}			
		}
		else {
			System.out.println("Registration form title is not displayed");
		}
		System.out.println();

		//Enter First Name
		WebElement firstName = driver.findElement(By.id("vfb-5"));
		if(firstName.isDisplayed()) {
			System.out.println("First Name is Displayed");
			// Enter First Name
			firstName.sendKeys(firstNameValue);
			System.out.println("First Name is: "+firstNameValue);
		}
		else {
			System.out.println("First Name is not Displayed");
		}

		//Enter Last Name
		WebElement lastName = driver.findElement(By.id("vfb-7"));
		if(lastName.isDisplayed()) {
			System.out.println("Last Name is Displayed");
			// Enter Last Name
			lastName.sendKeys(lastNameValue);
			System.out.println("First Name is: "+lastNameValue);
		}
		else {
			System.out.println("Last Name is not Displayed");
		}

		System.out.println();

		// Select Gender Radio button
		WebElement maleRadioBtn = driver.findElement(By.xpath("//*[@value='Male']"));

		if(maleRadioBtn.isSelected()) {
			System.out.println("Male  is Selected");
		}
		else {
			System.out.println("Male is not Selected");
		}

		//Female Radio button
		WebElement femaleRadioBtn = driver.findElement(By.xpath("//*[@value='Female']"));
		if(femaleRadioBtn.isSelected()) {
			System.out.println("Female  is Selected");
		}
		else {
			System.out.println("Female is not Selected");
			femaleRadioBtn.click();
			System.out.println("Gender is selected as : Female");
		}
		System.out.println();

		//Street Address
		WebElement streetAdd = driver.findElement(By.id("vfb-13-address"));
		if(streetAdd.isDisplayed()) {
			System.out.println("Street Address is Displayed");
			// Enter Street Address
			streetAdd.sendKeys(streetAddress);
			System.out.println("Street Address is: "+streetAddress);
		}
		else {
			System.out.println("Street Address is not Displayed");
		}

		// Apt/Suite/Bldg
		WebElement apartment = driver.findElement(By.id("vfb-13-address-2"));
		if(apartment.isDisplayed()) {
			System.out.println("Apartment is Displayed");
			// Enter Street Address
			apartment.sendKeys(apt);
			System.out.println("Apartment is: "+apt);
		}
		else {
			System.out.println("Apartment is not Displayed");
		}

		//City
		WebElement cty = driver.findElement(By.id("vfb-13-city"));
		if(cty.isDisplayed()) {
			System.out.println("City is Displayed");
			// Enter State Address
			cty.sendKeys(city);
			System.out.println("City is: "+city);
		}
		else {
			System.out.println("City is not Displayed");
		}

		//State
		WebElement stat = driver.findElement(By.id("vfb-13-state"));
		if(stat.isDisplayed()) {
			System.out.println("State is Displayed");
			// Enter State Address
			stat.sendKeys(state);
			System.out.println("State is: "+state);
		}
		else {
			System.out.println("State is not Displayed");
		}

		//Postal/ Zip Code
		WebElement postal = driver.findElement(By.id("vfb-13-zip"));
		if(postal.isDisplayed()) {
			System.out.println("Zip Code is Displayed");
			// Enter State Address
			postal.sendKeys(zipCode);
			System.out.println("Zip Code is: "+zipCode);
		}
		else {
			System.out.println("Zip Code is not Displayed");
		}

		System.out.println(); 

		//Select country from Drop Down
		WebElement countryDropDown = driver.findElement(By.id("vfb-13-country"));
		if(countryDropDown.isDisplayed()) {
			System.out.println("Country drop down is Displayed");
			Select countryDD = new Select(countryDropDown);
			countryDD.selectByVisibleText(country);
			System.out.println("Country selected is : "+country);
		}
		else {
			System.out.println("Country drop down is not Displayed");
		}
		System.out.println();

		// Email
		WebElement email = driver.findElement(By.id("vfb-14"));
		if(email.isDisplayed()) {
			System.out.println("Email is Displayed");
			// Enter State Address
			email.sendKeys(emailID);
			System.out.println("Email is: "+emailID);
		}
		else {
			System.out.println("Email is not Displayed");
		}

		System.out.println();

		// Date of Demo
		WebElement date = driver.findElement(By.id("vfb-18"));
		if(date.isDisplayed()) {
			System.out.println("Demo Date is Displayed");
			// Enter State Address
			date.sendKeys(demoDate);
			System.out.println("Demo Date is: "+demoDate);
		}
		else {
			System.out.println("Email is not Displayed");
		}
		System.out.println();

		// Convenient Time
		WebElement time = driver.findElement(By.id("vfb-16-hour"));
		if(time.isDisplayed()) {
			System.out.println("Convenient Time in HR is Displayed");
			Select timeDD = new Select(time);
			timeDD.selectByVisibleText(hour);
			System.out.println("Convenient Time in HR is : "+hour);
		}
		else {
			System.out.println("Convenient Time in HR is not Displayed");
		}
		System.out.println();

		// Convenient Time
		WebElement timeMn = driver.findElement(By.id("vfb-16-min"));
		if(timeMn.isDisplayed()) {
			System.out.println("Convenient Time Min is Displayed");
			Select timeMnDD = new Select(timeMn);
			timeMnDD.selectByVisibleText(minute);
			System.out.println("Convenient Time Min is : "+minute);
		}
		else {
			System.out.println("Convenient Time Min is not Displayed");
		}
		System.out.println();

		//Mobile Number
		WebElement mobile = driver.findElement(By.id("vfb-19"));
		if(mobile.isDisplayed()) {
			System.out.println("Mobile Number is Displayed");
			// Enter State Address
			mobile.sendKeys(mobileNumber);
			System.out.println("State is: "+mobileNumber);
		}
		else {
			System.out.println("Mobile Number is not Displayed");
		}
		System.out.println();

		// Check Box
		// Selenium WebDriver Checkbox
		WebElement webDriverCheckbox = driver.findElement(By.id("vfb-20-0"));


		// Confirm if Check box is already selected or not
		if(webDriverCheckbox.isSelected()) {
			System.out.println("Selenium WebDriver CheckBox is Selected");
		}
		else {
			System.out.println("Selenium WebDriver CheckBox is not Selected");
		}

		// UFT Check box
		WebElement uftCheckbox = driver.findElement(By.id("vfb-20-1"));

		// Confirm if Check box is already selected or not
		if(uftCheckbox.isSelected()) {
			System.out.println("UFTCheckBox is Selected");
		}
		else {
			System.out.println("UFT CheckBox is not Selected");
		}

		//TestNG Check box
		WebElement testNgCheckbox = driver.findElement(By.id("vfb-20-2"));

		// Confirm if Check box is already selected or not
		if(testNgCheckbox.isSelected()) {
			System.out.println("TestNG CheckBox is Selected");
		}
		else {
			System.out.println("TestNG CheckBox is not Selected");
		}

		// Core Java Check box
		WebElement coreJaveCheckbox = driver.findElement(By.id("vfb-20-3"));

		// Confirm if Check box is already selected or not
		if(coreJaveCheckbox.isSelected()) {
			System.out.println("Core Jave CheckBox is Selected");
		}
		else {
			System.out.println("Core Jave CheckBox is not Selected");
		}

		//Functional Testing Check box
		WebElement functionalTestCheckbox = driver.findElement(By.id("vfb-20-3"));

		// Confirm if Check box is already selected or not
		if(functionalTestCheckbox.isSelected()) {
			System.out.println("Functional Test CheckBox is Selected");
		}
		else {
			System.out.println("Functional Test CheckBox is not Selected");
		}

		// Others Check box
		WebElement othersCheckbox = driver.findElement(By.id("vfb-20-5"));

		// Confirm if Check box is already selected or not
		if(othersCheckbox.isSelected()) {
			System.out.println("Others CheckBox is Selected");
		}
		else {
			System.out.println("Others CheckBox is not Selected");

			// Select one of the check box. I am selecting Others check box.
			othersCheckbox.click();
			System.out.println("\n"+"User Intrested in : Others Course ");
		}

		// Enter your query
		WebElement query = driver.findElement(By.id("vfb-23"));
		if(query.isDisplayed()) {
			System.out.println("Query is Displayed");
			// Enter State Address
			query.sendKeys(queries);
			System.out.println("Query is: "+queries);
		}
		else {
			System.out.println("Query is not Displayed");
		}

		System.out.println();

		// Verification
		WebElement verification = driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label"));
		String verif[]= verification.getText().split(":");
		String ver = verif[1].trim();
		WebElement verify = driver.findElement(By.id("vfb-3"));
		verify.sendKeys(ver);
		System.out.println("Verification number: " +ver);
		System.out.println();		

		//Submit Button
		WebElement submitButton = driver.findElement(By.id("vfb-4"));

		if(submitButton.isEnabled()) {
			System.out.println("Submit Button is Enabled");

		// Click on submit
			submitButton.click();
			System.out.println("Submit Button is Clicked");
		}
		else {
			System.out.println("Submit Button is not Enabled");
		}
		System.out.println();

		//Capture Transaction ID
		WebElement succMessage = driver.findElement(By.xpath("//*[@class= 'elementor-shortcode']"));
		String actulTxtMsg = succMessage.getText();
		String exptTxtMsg = "Registration Form is Successfully Submitted";
		
		if(actulTxtMsg.contains(exptTxtMsg)) {
			System.out.println("Actual and Expected Successful Text Message are same");
			System.out.println("Successful Test Message is: "+actulTxtMsg);
		}
		else {
			System.out.println("Actual and Expected Successful Text Message are not same");
			System.out.println("Actual successful Test Message is: "+actulTxtMsg);
			System.out.println("Expected successful Test Message is: "+exptTxtMsg);
		}


		// Close the driver
		driver.quit();
		System.out.println("Application is Closed");

	}

}
