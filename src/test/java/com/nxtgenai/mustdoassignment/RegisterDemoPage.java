package com.nxtgenai.mustdoassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterDemoPage {

	public static void main(String[] args) {

		// Parameterized all Input Values
		String url = "https://vinothqaacademy.com/";
		String regFormLinkTextValue = "Registration Form";
		String expRegTitleTextValue = "Register For Demo";
		String firstNameValue = "Rohit";
		String lastNameValue = "Stark";
		String streetAddressInput = "Denece Colony";
		String apartmentNoInput = "DC-48";
		String cityNameValue = "Hyderabad";
		String stateNameValue = "Telangana";
		String postalCodeValue = "500018";
		String countryDrpDnValue = "India";
		String emailInput = "Stark@gmail.com";
		String dateOfDemoValue = "15/07/2023";
		String hourInput = "21";
		String minuteInput = "30";
		String mobileNumverValue = "9876543210";
		String enterYourQueryValue = "What will be the duration of the Course?";
		String successfulMessageText = "Registration Form is Successfully Submitted.";

		// Parameterized all the WebElement Path
		String demoSitesLocator = "(//a[contains(text(),'Demo Sites')])[2]";
		String practiceAutomationLocator = "(//a[text()='Practice Automation'])[2]";
		String registerTitleTextLocator = "//*[text()='Register For Demo']";
		String firstNameLocator = "//input[@id='vfb-5']";
		String lastNameLocator = "//input[@id='vfb-7']";
		String maleRadioBtnLocator = "//input[@id='vfb-31-1']";
		String strAddressNameLocator = "//input[@id='vfb-13-address']";
		String apartmentNoLocator = "//input[@id='vfb-13-address-2']";
		String cityLocator = "//input[@id='vfb-13-city']";
		String stateLocator = "//input[@id='vfb-13-state']";
		String postalCodeLocator = "//input[@id='vfb-13-zip']";
		String countryDrpDnLocator = "//select[@id='vfb-13-country']";
		String emailLocator = "//input[@id='vfb-14']";
		String dateOfDemoLocator = "//input[@id='vfb-18']";
		String hourLocator = "//select[@id='vfb-16-hour']";
		String minuteLocator = "//select[@id='vfb-16-min']";
		String mobileNoLocator = "//input[@id='vfb-19']";
		//String functionalTestingLocator = "//label[text()='Functional Testing']";
		String functionalTestingLocator = "//input[@value='Functional Testing']";
		//String seleniumWebDriverLocator = "//label[text()='Selenium WebDriver']";
		String seleniumWebDriverLocator = "//input[@value='Selenium WebDriver']";
		String enterYourQueryLocator = "//textarea[@id='vfb-23']";
		String enterTwoDigitsLocator = "//input[@id='vfb-3']";
		String submitButtonLocator = "//input[@id='vfb-4']";
		// String successfulMsgTextLocator = "//*[contains(text(),'Registration Form is
		// Successfully Submitted. The Transaction ID :')]";
		String successfulMsgTextLocator = "//div[@class='elementor-widget-container']";

		// Set the system property for chrome browser
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		// To create Driver Object in Driver Interface
		WebDriver driver = new ChromeDriver();

		// Step 2: Launch the Home URL "https://nxtgenaiacademy.com/"
		driver.get(url);

		// Maximize the window
		driver.manage().window().maximize();
		System.out.println("Application is launched");

		// Step 3: Click on Register for Demo page
		// Create an instance in Action class by passing webdriver instance
		Actions action = new Actions(driver);

		// Performing mouse hover action on Demo Sites
		WebElement demoSites = driver.findElement(By.xpath(demoSitesLocator));
		action.moveToElement(demoSites).perform();

		// Performing mouse hover action on Practice Automation
		WebElement practiceAutomation = driver.findElement(By.xpath(practiceAutomationLocator));
		action.moveToElement(practiceAutomation).perform();

		// Click on Demo Site - Registration Form
		driver.findElement(By.partialLinkText(regFormLinkTextValue)).click();
		System.out.println("Navigated to Register Demo Page");

		// Step 4: Validate the Title of the Form is displayed as "Register For Demo".
		// Positive Scenario
		WebElement regTitleText = driver.findElement(By.xpath(registerTitleTextLocator));
		// Verify Register Title is Displayed or Not
		if (regTitleText.isDisplayed()) {
			System.out.println("Register Title is Displayed");
		} else {
			System.out.println("Register Title is Not Displayed");
		}

		// Verify Register Title is Enabled or Not
		if (regTitleText.isEnabled()) {
			System.out.println("Register Title is Enabled");
		} else {
			System.out.println("Register Title is Not Enabled");
		}

		// Validating the Register Title Text
		String actRegTitleText = regTitleText.getText();
		String expectedTitleText = expRegTitleTextValue;

		if (actRegTitleText.equals(expectedTitleText)) {
			System.out.println("The Registration Title Text is: " + actRegTitleText);
		} else {
			System.out.println("Both Actual and Expected Register Title texts are not same");
			System.out.println("The Actual Registration Title is: " + actRegTitleText);
			System.out.println("The Expected Registration Title is: " + expectedTitleText);
		}

		// Step 5: Fill the Registration form by entering all fields

		// First Name
		WebElement firstName = driver.findElement(By.xpath(firstNameLocator));
		// Verify the First Name is Displayed or Not
		if (firstName.isDisplayed()) {
			System.out.println("First Name is Displayed");
		} else {
			System.out.println("First Name is Not Displayed");
		}

		// Verify the First Name is Enabled or Not
		if (firstName.isEnabled()) {
			System.out.println("First Name is Enabled");
			// Enter the First Name
			firstName.sendKeys(firstNameValue);
			System.out.println("The First Name entered is: " + firstNameValue);
		} else {
			System.out.println("First Name is Not Enabled");
		}

		// Last Name
		WebElement lastName = driver.findElement(By.xpath(lastNameLocator));
		// Verify the Last Name is Displayed or Not
		if (lastName.isDisplayed()) {
			System.out.println("last Name is Displayed");
		} else {
			System.out.println("Last Name is Not Displayed");
		}

		// Verify the Last Name is Enabled or Not
		if (lastName.isEnabled()) {
			System.out.println("Last Name is Enabled");
			// Enter the Last Name
			lastName.sendKeys(lastNameValue);
			System.out.println("The Last Name entered is: " + lastNameValue);
		} else {
			System.out.println("Last Name is Not Enabled");
		}

		// Gender
		// Male Radio Button
		WebElement maleRadioBtn = driver.findElement(By.xpath(maleRadioBtnLocator));
		// Verify Male Radio Button is Displayed or Not
		if (maleRadioBtn.isDisplayed()) {
			System.out.println("Male Radio Button is Displayed");
		} else {
			System.out.println("Male Radio Button is Not Displayed");
		}

		// Verify Male Radio Button is Enabled or Not
		if (maleRadioBtn.isEnabled()) {
			System.out.println("Male Radio Button is Enabled");
		} else {
			System.out.println("Male Radio Button is Not Enabled");
		}

		// Verify Male Radio Button is Selected or Not
		if (maleRadioBtn.isSelected()) {
			System.out.println("Male Radio Button is Selected");
		} else {
			System.out.println("Male Radio Button is Not Selected");
			// Click on Male Radio Button
			maleRadioBtn.click();
			System.out.println("Male Radio Button is Selected");
		}

		// Verify Male Radio Button is Selected
		if (maleRadioBtn.isSelected()) {
			System.out.println("Verified Male Radio Button is Selected");
		} else {
			System.out.println("Verified Male Radio Button is Not Selected");
		}

		// Address
		// Street Address
		WebElement strAddress = driver.findElement(By.xpath(strAddressNameLocator));
		// Verify the Street Address is Displayed or Not
		if (strAddress.isDisplayed()) {
			System.out.println("Street Address is Displayed");
		} else {
			System.out.println("Street Address is Not Displayed");
		}

		// Verify the Street Address is Enabled or Not
		if (strAddress.isEnabled()) {
			System.out.println("Street Address is Enabled");
			// Enter the Street Address
			strAddress.sendKeys(streetAddressInput);
			System.out.println("Street Address entered is: " + streetAddressInput);
		} else {
			System.out.println("Street Address is Not Enabled");
		}

		// Apartment Number
		WebElement apartmentNo = driver.findElement(By.xpath(apartmentNoLocator));
		// Verify the Apartment Number is Displayed or Not
		if (apartmentNo.isDisplayed()) {
			System.out.println("Apartment Number is Displayed");
		} else {
			System.out.println("Apartment Number is Not Displayed");
		}

		// Verify the Apartment Number is Enabled or Not
		if (apartmentNo.isEnabled()) {
			System.out.println("Apartment Number is Enabled");
			// Enter the Street Address
			apartmentNo.sendKeys(apartmentNoInput);
			System.out.println("Apartment Number entered is: " + apartmentNoInput);
		} else {
			System.out.println("Apartment Number is Not Enabled");
		}

		// City
		WebElement cityName = driver.findElement(By.xpath(cityLocator));
		// Verify the City Name is Displayed or Not
		if (cityName.isDisplayed()) {
			System.out.println("City Name is Displayed");
		} else {
			System.out.println("City Name is Not Displayed");
		}

		// Verify the City Name is Enabled or Not
		if (cityName.isEnabled()) {
			System.out.println("City Name is Enabled");
			// Enter City Name
			cityName.sendKeys(cityNameValue);
			System.out.println("City Name entered is: " + cityNameValue);
		} else {
			System.out.println("City Name is Not Enabled");
		}

		// State
		WebElement stateName = driver.findElement(By.xpath(stateLocator));
		// Verify the State is Displayed or Not
		if (stateName.isDisplayed()) {
			System.out.println("State is Displayed");
		} else {
			System.out.println("State is Not Displayed");
		}

		// Verify the State is Enabled or Not
		if (stateName.isEnabled()) {
			System.out.println("State is Enabled");
			// Enter State Name
			stateName.sendKeys(stateNameValue);
			System.out.println("State entered is: " + stateNameValue);
		} else {
			System.out.println("State is Not Enabled");
		}

		// Postal/Zip Code
		WebElement postalCode = driver.findElement(By.xpath(postalCodeLocator));
		// Verify the Postal Code is Displayed or Not
		if (postalCode.isDisplayed()) {
			System.out.println("Postal Code is Displayed");
		} else {
			System.out.println("Postal Code is Not Displayed");
		}

		// Verify the Postal Code is Enabled or Not
		if (postalCode.isEnabled()) {
			System.out.println("Postal Code is Enabled");
			// Enter Postal Code
			postalCode.sendKeys(postalCodeValue);
			System.out.println("Postal Code entered is: " + postalCodeValue);
		} else {
			System.out.println("Postal Code is Not Enabled");
		}

		// Country Drop Down
		WebElement countryDropDown = driver.findElement(By.xpath(countryDrpDnLocator));
		// Verify the Country Drop Down is Displayed or Not
		if (countryDropDown.isDisplayed()) {
			System.out.println("Verified Country Drop Down is Displayed");
		} else {
			System.out.println("Verified Country Drop Down is Not Displayed");
		}

		// Verify the Country Drop Down is Enabled or Not
		if (countryDropDown.isEnabled()) {
			System.out.println("Verified Country Drop Down is Enabled");
		} else {
			System.out.println("Verified Country Drop Down is Not Enabled");
		}

		// To Select the Item from Country Drop Down, Create the Select Object
		Select countryDrpDn = new Select(countryDropDown);
		// Select Using Visible Text
		countryDrpDn.selectByVisibleText(countryDrpDnValue);
		System.out.println("Country Drop Down Value selected is: " + countryDrpDnValue);

		// Email
		WebElement email = driver.findElement(By.xpath(emailLocator));
		// Verify the Email is Displayed or Not
		if (email.isDisplayed()) {
			System.out.println("Email is Displayed");
		} else {
			System.out.println("Email is Not Displayed");
		}

		// Verify the Email is Enabled or Not
		if (email.isEnabled()) {
			System.out.println("Email is Enabled");
			// Enter Email Id
			email.sendKeys(emailInput);
			System.out.println("Email Id entered is: " + emailInput);
		} else {
			System.out.println("Email is Not Enabled");
		}

		// Date of Demo
		WebElement dateOfDemo = driver.findElement(By.xpath(dateOfDemoLocator));
		// Verify the Date of Demo is Displayed or Not
		if (dateOfDemo.isDisplayed()) {
			System.out.println("Date of Demo is Displayed");
		} else {
			System.out.println("Date of Demo is Not Displayed");
		}

		// Verify the Date of Demo is Enabled or Not
		if (dateOfDemo.isEnabled()) {
			System.out.println("Date of Demo is Enabled");
			// Enter Date Of Demo value
			dateOfDemo.sendKeys(dateOfDemoValue);
			System.out.println("Date of Demo Value entered is: " + dateOfDemoValue);
		} else {
			System.out.println("Date of Demo is Not Enabled");
		}

		// Convenient Time
		// Hour Drop Down
		WebElement convenientTimeHrDrpDn = driver.findElement(By.xpath(hourLocator));
		// Verify Convenient Time Hour Drop Down is Displayed or Not
		if (convenientTimeHrDrpDn.isDisplayed()) {
			System.out.println("Verified Hour Drop Down is Displayed");
		} else {
			System.out.println("Verified Hour Drop Down is Not Displayed");
		}

		// Verify Convenient Time Hour Drop Down is Enabled or Not
		if (convenientTimeHrDrpDn.isEnabled()) {
			System.out.println("Verified Hour Drop Down is Enabled");

			// To select Item from Convenient Time Hour Drop Down, Create the Select Object
			Select hourDropDown = new Select(convenientTimeHrDrpDn);
			// Select using Visible Text
			hourDropDown.selectByVisibleText(hourInput);
			System.out.println("Hour Drop Down Value selected is: " + hourInput);

		} else {
			System.out.println("Verified Hour Drop Down is Not Enabled");
		}

		// Minute Drop Down
		WebElement convenientTimeMinDrpDn = driver.findElement(By.xpath(minuteLocator));
		// Verify Convenient Time Minute Drop Down is Displayed or Not
		if (convenientTimeMinDrpDn.isDisplayed()) {
			System.out.println("Verified Minute Drop Down is Displayed");
		} else {
			System.out.println("Verified Minute Drop Down is Not Displayed");
		}

		// Verify Convenient Time Minute Drop Down is Enabled or Not
		if (convenientTimeMinDrpDn.isEnabled()) {
			System.out.println("Verified Minute Drop Down is Enabled");

			// To select Item from Convenient Time Minute Drop Down, Create the Select
			// Object
			Select minuteDropDown = new Select(convenientTimeMinDrpDn);
			// Select using Visible Text
			minuteDropDown.selectByVisibleText(minuteInput);
			System.out.println("Minute Drop Down Value selected is: " + minuteInput);

		} else {
			System.out.println("Verified Minute Drop Down is Not Enabled");
		}

		// Mobile Number
		WebElement mobileNumber = driver.findElement(By.xpath(mobileNoLocator));
		// Verify the Mobile Number is Displayed or Not
		if (mobileNumber.isDisplayed()) {
			System.out.println("Mobile Number is Displayed");
		} else {
			System.out.println("Mobile Number is Not Displayed");
		}

		// Verify the Mobile Number is Enabled or Not
		if (mobileNumber.isEnabled()) {
			System.out.println("Mobile Number is Enabled");
			// Enter Mobile Number
			mobileNumber.sendKeys(mobileNumverValue);
			System.out.println("Mobile Number entered is: " + mobileNumverValue);
		} else {
			System.out.println("Mobile Number is Not Enabled");
		}

		// Course Interested
		// Functional Testing Check Box
		WebElement functionalTestingChkBox = driver.findElement(By.xpath(functionalTestingLocator));
		// Verify Functional Testing Check Box is Displayed or Not
		if (functionalTestingChkBox.isDisplayed()) {
			System.out.println("Verified Functional Testing Check Box is Displayed");
		} else {
			System.out.println("Verified Functional Testing Check Box is Not Displayed");
		}

		// Verify Functional Testing Check Box is Enabled or Not
		if (functionalTestingChkBox.isEnabled()) {
			System.out.println("Verified Functional Testing Check Box is Enabled");
		} else {
			System.out.println("Verified Functional Testing Check Box is Not Enabled");
		}

		// Verify Functional Testing Check Box Selected or Not - Initial State is
		// Not Selected
		if (functionalTestingChkBox.isSelected()) {
			System.out.println("Verified Functional Testing Check Box is Selected");
		} else {
			System.out.println("Verified Functional Testing Check Box is Not Selected");
			// Click on Functional Testing Check Box
			functionalTestingChkBox.click();
			System.out.println("Functional Testing Check Box is Checked");
		}

		// Verify Functional Testing Check Box Selected or Not
		if (functionalTestingChkBox.isSelected()) {
			System.out.println("Verified Functional Testing Check Box is Selected");
		} else {
			System.out.println("Verified Functional Testing Check Box is Not Selected");
		}

		// Selenium WebDriver Check Box
		WebElement seleniumWebDriverChkBox = driver.findElement(By.xpath(seleniumWebDriverLocator));
		// Verify Selenium WebDriver Check Box is Displayed or Not
		if (seleniumWebDriverChkBox.isDisplayed()) {
			System.out.println("Verified Selenium WebDriver Check Box is Displayed");
		} else {
			System.out.println("Verified Selenium WebDriver Check Box is Not Displayed");
		}

		// Verify Selenium WebDriver Check Box is Enabled or Not
		if (seleniumWebDriverChkBox.isEnabled()) {
			System.out.println("Verified Selenium WebDriver Check Box is Enabled");
		} else {
			System.out.println("Verified Selenium WebDriver Check Box is Not Enabled");
		}

		// Verify Selenium WebDriver Check Box Selected or Not - Initial State is
		// Not Selected
		if (seleniumWebDriverChkBox.isSelected()) {
			System.out.println("Verified Selenium WebDriver Check Box is Selected");
		} else {
			System.out.println("Verified Selenium WebDriver Check Box is Not Selected");
			// Click on Selenium WebDriver Check Box
			seleniumWebDriverChkBox.click();
			System.out.println("Selenium WebDriver Check Box is Checked");
		}

		// Verify the Selenium WebDriver Check Box Selected or Not
		if (seleniumWebDriverChkBox.isSelected()) {
			System.out.println("Verified Selenium WebDriver Check Box is Selected");
		} else {
			System.out.println("Verified Selenium WebDriver Check Box is Not Selected");
		}

		// Enter Your Query
		WebElement enterYourQuery = driver.findElement(By.xpath(enterYourQueryLocator));
		// Verify Enter Your Query is Displayed or Not
		if (enterYourQuery.isDisplayed()) {
			System.out.println("Enter Your Query is Displayed");
		} else {
			System.out.println("Enter Your Query is Not Displayed");
		}

		// Verify Enter Your Query is Enabled or Not
		if (enterYourQuery.isEnabled()) {
			System.out.println("Enter Your Query is Enabled");
			// Enter Your Query Value
			enterYourQuery.sendKeys(enterYourQueryValue);
			System.out.println("Enter Your Query Value entered is: " + enterYourQueryValue);
		} else {
			System.out.println("Enter Your Query is Not Enabled");
		}

		// Enter Two Digits
		WebElement enterTwoDigits = driver.findElement(By.xpath(enterTwoDigitsLocator));
		// Verify Enter Two Digits is Displayed or Not
		if (enterTwoDigits.isDisplayed()) {
			System.out.println("Enter Two Digits is Displayed");
		} else {
			System.out.println("Enter Two Digits is Not Displayed");
		}

		// Verify Enter Two Digits is Enabled or Not
		if (enterTwoDigits.isEnabled()) {
			System.out.println("Enter Two Digits is Enabled");

			// Retrieve the verification Number during Run Time and Enter Value
			String text = driver.findElement(By.xpath("//input[@id='vfb-3']//following::label[1]")).getText();
			String num[] = text.split(":");
			enterTwoDigits.sendKeys(num[1].trim());
			System.out.println("Enterd Two Digits value is: " + num[1].trim());
		} else {
			System.out.println("Enter Two Digits is Not Enabled");
		}

		// Submit Button
		WebElement submitButton = driver.findElement(By.xpath(submitButtonLocator));
		// Verify Submit Button is Displayed or Not
		if (submitButton.isDisplayed()) {
			System.out.println("Submit Button is Displayed");
		} else {
			System.out.println("Submit Button is Not Displayed");
		}

		// Verify Submit Button is Enabled or Not
		if (submitButton.isEnabled()) {
			System.out.println("Submit Button is Enabled");
			// Click on Submit Button
			submitButton.click();
			System.out.println("Submit Button is Clicked");
		} else {
			System.out.println("Submit Button is Not Enabled");
		}

		// Step 7: Submit the Form
		WebElement successfulMsgText = driver.findElement(By.xpath(successfulMsgTextLocator));
		// Verify the Successful Message Text is Displayed or Not
		if (successfulMsgText.isDisplayed()) {
			System.out.println("Successful Message Text is Displayed");
		} else {
			System.out.println("Successful Message Text is Not Displayed");
		}

		// Validating Successful Message Text
		// String actSuccessfulMsgText = successfulMsgText.getText();
		String fullSuccessfulMsgText = successfulMsgText.getText();
		String actSuccessfulMsgText = fullSuccessfulMsgText.substring(32).trim();

		String expSuccessfulMsgText = successfulMessageText;
		if (actSuccessfulMsgText.contains(expSuccessfulMsgText)) {
			System.out.println("The Successful Message Text is: " + actSuccessfulMsgText);
		} else {
			System.out.println("Actual and Expected Successful Message Texts are not same");
			System.out.println("Actual Text is: " + actSuccessfulMsgText);
			System.out.println("Expected Text is: " + expSuccessfulMsgText);
		}

		// Close the Application
		driver.close();
		System.out.println("Application is Closed");
	}

}
