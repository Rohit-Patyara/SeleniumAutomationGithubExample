package com.nxtgenai.mustdoassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegsiterDemoTestNG {

	// Code added by stark March 5 2025
	public WebDriver driver;

	// Parameterized all Input Values
	String url = "https://vinothqaacademy.com/";
	String expRegisterForDemoTextValue = "Register For Demo";
	String firstNameValue = "Rohit";
	String lastnameValue = "Patyara";
	String streetAddressValue = "Denece Colony";
	String apartmentNumberValue = "DC-48";
	String cityValue = "Hyderabad";
	String stateValue = "Telangana";
	String postalCodeValue = "500012";
	String countryDrpDwnValue = "India";
	String emailValue = "tonystark@gmail.com";
	String dateOfDemoValue = "02/06/2025";
	String hourDrpDwnValue = "20";
	String minDrpDwnValue = "15";
	String mobileNumberValue = "8143283179";
	String enterYourQueryValue = "What is the duration of the course";
	String successfulMsgText = "Registration Form is Successfully Submitted.";

	// Parameterized all the WebElement Path
	String demoSitesLocator = "(//a[text()='Demo Sites'])[2]";
	String pracAutomationLocator = "(//a[text()='Practice Automation'])[2]";
	String registractionFormLocator = "(//a[text()='Registration Form'])[2]";
	String registerForDemoLocator = "//*[text()='Register For Demo']";
	String firstNameLocator = "//input[@id='vfb-5']";
	String lastNameLocator = "//input[@id='vfb-7']";
	String maleRadioBtnLocator = "//input[@id='vfb-31-1']";
	String functionalTestingChkBoxLocator = "//input[@id='vfb-20-4']";
	String seleniumWebdriverChkBoxLocator = "//input[@id='vfb-20-0']";
	String streetAddressLocator = "//input[@id='vfb-13-address']";
	String apartmentNumLocator = "//input[@id='vfb-13-address-2']";
	String cityLocator = "//input[@id='vfb-13-city']";
	String stateLocator = "//input[@id='vfb-13-state']";
	String postalCodeLocator = "//input[@id='vfb-13-zip']";
	String countryDrpDwnLocator = "//select[@id='vfb-13-country']";
	String emailLocator = "//input[@id='vfb-14']";
	String dateOfDemoLocator = "//input[@id='vfb-18']";
	String hourDrpDwnLocator = "//select[@id='vfb-16-hour']";
	String minDrpDwnLocator = "//select[@id='vfb-16-min']";
	String mobileNumberLocator = "//input[@id='vfb-19']";
	String enterYourQueryLocator = "//textarea[@id='vfb-23']";
	String enterTwoDigitsLocator = "//input[@id='vfb-3']";
	String verificationNumberLocator = "//input[@id='vfb-3']/following::label[1]";
	String submitButtonLocator = "//input[@id='vfb-4']";
	String successfulMsgLocator = "//div[@id='messageContainer']";

	@BeforeClass
	public void launchApplication() {
		// Step 1: Create object instance for chrome driver
		driver = new ChromeDriver();

		// Step 2: Launch the Home URL
		driver.get(url);
		// Maximize the window
		driver.manage().window().maximize();
		Reporter.log("Application is launched");
	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
		Reporter.log("Application is closed");
	}

	@Test(priority = 1)
	public void navigateToRegistrationForDemoPage() {
		// Step 3: Click on Registration form
		Actions act = new Actions(driver);
		WebElement demoSites = driver.findElement(By.xpath(demoSitesLocator));
		act.moveToElement(demoSites).perform();

		WebElement practiceAutomation = driver.findElement(By.xpath(pracAutomationLocator));
		act.moveToElement(practiceAutomation).perform();

		WebElement registerForDemo = driver.findElement(By.xpath(registractionFormLocator));
		registerForDemo.click();
		Reporter.log("Navigated to register demo page");
	}

	@Test(priority = 2)
	public void registerUser() {
		// Step 4: Validate the Title of the Form is displayed as "Register For Demo".
		// Positive Scenario
		WebElement registerForDemoTitle = driver.findElement(By.xpath(registerForDemoLocator));
		// Verify Register For Demo Title is Displayed or Not
		if (registerForDemoTitle.isDisplayed()) {
			Reporter.log("Register for demo title is displayed");
		} else {
			Reporter.log("Register for demo title is not displayed");
		}

		// Verify Register Title is Enabled or Not
		if (registerForDemoTitle.isEnabled()) {
			Reporter.log("Register for demo title is enabled");
		} else {
			Reporter.log("Register for demo title is not enabled");
		}

		// Validating the Register For Demo Title Text
		String actRegisterForDemoText = registerForDemoTitle.getText();
		String expRegisterForDemoText = expRegisterForDemoTextValue;

		if (actRegisterForDemoText.equals(expRegisterForDemoText)) {
			Reporter.log("Actual and expected register for demo titles are same");
			Reporter.log("Actual title is :" + actRegisterForDemoText);
			Reporter.log("Expected title is :" + expRegisterForDemoText);
		} else {
			Reporter.log("Actal and expected register for demo titles are not same");
			Reporter.log("Actual title is :" + actRegisterForDemoText);
			Reporter.log("Expected title is :" + expRegisterForDemoText);
		}

		// Step 5: Fill the Registration form by entering all fields
		// First name
		WebElement firstName = driver.findElement(By.xpath(firstNameLocator));
		// Verify the First Name is Displayed or Not
		if (firstName.isDisplayed()) {
			Reporter.log("First name is displayed");
		} else {
			Reporter.log("First name is not displayed");
		}

		// Verify the First Name is Enabled or Not
		if (firstName.isEnabled()) {
			Reporter.log("First name is enabled");
			// Enter first name
			firstName.sendKeys(firstNameValue);
			Reporter.log("First name entered is " + firstNameValue);
		} else {
			Reporter.log("First name is not enabled");
		}

		// Last name
		WebElement lastName = driver.findElement(By.xpath(lastNameLocator));
		// Verify the Last Name is Displayed or Not
		if (lastName.isDisplayed()) {
			Reporter.log("Last name is displayed");
		} else {
			Reporter.log("Last name is not displayed");
		}

		// Verify the Last Name is Enabled or Not
		if (lastName.isEnabled()) {
			Reporter.log("Last name is enabled");
			// Enter Last name
			lastName.sendKeys(lastnameValue);
			Reporter.log("Last name entered is " + lastnameValue);
		} else {
			Reporter.log("Last name is not enabled");
		}

		// Gender
		WebElement maleRadioBtn = driver.findElement(By.xpath(maleRadioBtnLocator));
		// Verify Male Radio Button is Displayed or Not
		if (maleRadioBtn.isDisplayed()) {
			Reporter.log("Male radio button is displayed");
		} else {
			Reporter.log("Male radio button is displayed");
		}

		// Verify Male Radio Button is Enabled or Not
		if (maleRadioBtn.isEnabled()) {
			Reporter.log("Male radio button is enabled");
		} else {
			Reporter.log("Male radio button is not enabled");
		}

		// Verify Male Radio Button is Selected or Not
		if (maleRadioBtn.isSelected()) {
			Reporter.log("Male radio button is selected");
		} else {
			Reporter.log("Male radio button is not selected");
			// Click on male radio button
			maleRadioBtn.click();
			Reporter.log("Male radio button is selected");
		}

		// Verify Male Radio Button is Selected
		if (maleRadioBtn.isSelected()) {
			Reporter.log("Verified Male radio button is selected");
		} else {
			Reporter.log("Verified Male radio button is not selected");
		}

		// Course interested
		// Selenium WebDriver Check Box
		WebElement seleniumWebdriverChkBox = driver.findElement(By.xpath(seleniumWebdriverChkBoxLocator));
		// Verify Selenium Webdriver Check Box is Displayed or Not
		if (seleniumWebdriverChkBox.isDisplayed()) {
			Reporter.log("Selenium webdriver check box is displayed");
		} else {
			Reporter.log("Selenium webdriver check box is not displayed");
		}

		// Verify Selenium Webdriver Check Box is Enabled or Not
		if (seleniumWebdriverChkBox.isEnabled()) {
			Reporter.log("Selenium webdriver check box is enabled");
		} else {
			Reporter.log("Selenium webdriver check box is not enabled");
		}

		// Verify Selenium Webdriver Check Box Selected or Not - Initial State is
		// Not Selected
		if (seleniumWebdriverChkBox.isSelected()) {
			Reporter.log("Selenium webdriver check box is selected");
		} else {
			Reporter.log("Selenium webdriver check box is not selected");
			// Click on Selenium Webdriver Check Box
			seleniumWebdriverChkBox.click();
			Reporter.log("Selenium webdriver check box is checked");
		}

		// Verify Selenium Webdriver Check Box Selected or Not
		if (seleniumWebdriverChkBox.isSelected()) {
			Reporter.log("Selenium webdriver check box is selected");
		} else {
			Reporter.log("Selenium webdriver check box is not selected");
		}

		// Functional Testing Check Box
		WebElement functionalTestingChkBox = driver.findElement(By.xpath(functionalTestingChkBoxLocator));
		// Verify Functional Testing Check Box is Displayed or Not
		if (functionalTestingChkBox.isDisplayed()) {
			Reporter.log("Functional testing check box is displayed");
		} else {
			Reporter.log("Functional testing check box is displayed");
		}

		// Verify Functional Testing Check Box is Enabled or Not
		if (functionalTestingChkBox.isEnabled()) {
			Reporter.log("Functional testing check box is enabled");
		} else {
			Reporter.log("Functional testing check box is not enabled");
		}

		// Verify Functional Testing Check Box Selected or Not - Initial State is
		// Not Selected
		if (functionalTestingChkBox.isSelected()) {
			Reporter.log("Functional testing check box is selected");
		} else {
			Reporter.log("Functional testing check box is not selected");
			// Click on Functional Testing Check Box
			functionalTestingChkBox.click();
			Reporter.log("Functional testing check box is checked");
		}

		// Verify Functional Testing Check Box Selected or Not
		if (functionalTestingChkBox.isSelected()) {
			Reporter.log("Functional testing check box is selected");
		} else {
			Reporter.log("Functional testing check box is not selected");
		}

		// Address
		// Street Address
		WebElement streetAddress = driver.findElement(By.xpath(streetAddressLocator));
		// Verify the Street Address is Displayed or Not
		if (streetAddress.isDisplayed()) {
			Reporter.log("Street address is displayed");
		} else {
			Reporter.log("Street address is not displayed");
		}

		// Verify the Street Address is Enabled or Not
		if (streetAddress.isEnabled()) {
			Reporter.log("Street address is enabled");
			// Enter the Street Address
			streetAddress.sendKeys(streetAddressValue);
			Reporter.log("Street address entered is :" + streetAddressValue);
		} else {
			Reporter.log("Street address is not enabled");
		}

		// Apartment Number
		WebElement apartmentNumber = driver.findElement(By.xpath(apartmentNumLocator));
		// Verify the Apartment Number is Displayed or Not
		if (apartmentNumber.isDisplayed()) {
			Reporter.log("Apartment number is displayed");
		} else {
			Reporter.log("Apartment number is not displayed");
		}

		// Verify the Apartment Number is Enabled or Not
		if (apartmentNumber.isEnabled()) {
			Reporter.log("Apartment number is enabled");
			// Enter the Apartment Number
			apartmentNumber.sendKeys(apartmentNumberValue);
			Reporter.log("Apartment number entered is :" + apartmentNumberValue);
		} else {
			Reporter.log("Apartment number is not enabled");
		}

		// City
		WebElement cityName = driver.findElement(By.xpath(cityLocator));
		// Verify city name is Displayed or Not
		if (cityName.isDisplayed()) {
			Reporter.log("City name is displayed");
		} else {
			Reporter.log("City name is not displayed");
		}

		// Verify the city name is Enabled or Not
		if (cityName.isEnabled()) {
			Reporter.log("City name is enabled");
			// Enter the city
			cityName.sendKeys(cityValue);
			Reporter.log("City name entered is :" + cityValue);
		} else {
			Reporter.log("City name is not enabled");
		}

		// State
		WebElement stateName = driver.findElement(By.xpath(stateLocator));
		// Verify state name is Displayed or Not
		if (stateName.isDisplayed()) {
			Reporter.log("State name is displayed");
		} else {
			Reporter.log("State name is not displayed");
		}

		// Verify the state name is Enabled or Not
		if (stateName.isEnabled()) {
			Reporter.log("State name is enabled");
			// Enter the state
			stateName.sendKeys(stateValue);
			Reporter.log("State name entered is :" + stateValue);
		} else {
			Reporter.log("State name is not enabled");
		}

		// Postal code
		WebElement postalCode = driver.findElement(By.xpath(postalCodeLocator));
		// Verify postal code is Displayed or Not
		if (postalCode.isDisplayed()) {
			Reporter.log("Postal code is displayed");
		} else {
			Reporter.log("Postal code is not displayed");
		}

		// Verify the Postal code is Enabled or Not
		if (postalCode.isEnabled()) {
			Reporter.log("Postal code is enabled");
			// Enter the Postal code
			postalCode.sendKeys(postalCodeValue);
			Reporter.log("Postal code entered is :" + postalCodeValue);
		} else {
			Reporter.log("Postal code is not enabled");
		}

		// Country Drop Down
		WebElement countryDrpDwn = driver.findElement(By.xpath(countryDrpDwnLocator));
		// Verify the Country Drop Down is Displayed or Not
		if (countryDrpDwn.isDisplayed()) {
			Reporter.log("Country dropdown is displayed");
		} else {
			Reporter.log("Country dropdown is not displayed");
		}

		// Verify the country dropdown is Enabled or Not
		if (countryDrpDwn.isEnabled()) {
			Reporter.log("Country dropdown is enabled");
		} else {
			Reporter.log("Country dropdown is not enabled");
		}

		// To Select the Item from Country Drop Down, Create the Select Object
		Select countryDrpDwnSel = new Select(countryDrpDwn);
		// Select Using Visible Text
		countryDrpDwnSel.selectByVisibleText(countryDrpDwnValue);
		Reporter.log("Country dropdown value selected is " + countryDrpDwnValue);

		// Email
		WebElement email = driver.findElement(By.xpath(emailLocator));
		// Verify email is Displayed or Not
		if (email.isDisplayed()) {
			Reporter.log("Email is displayed");
		} else {
			Reporter.log("Email is not displayed");
		}

		// Verify email is Enabled or Not
		if (email.isEnabled()) {
			Reporter.log("Email is enabled");
			// Enter email id
			email.sendKeys(emailValue);
			Reporter.log("Email entered is :" + emailValue);
		} else {
			Reporter.log("Email is not enabled");
		}

		// Date of Demo
		WebElement dateOfDemo = driver.findElement(By.xpath(dateOfDemoLocator));
		// Verify date of demo is Displayed or Not
		if (dateOfDemo.isDisplayed()) {
			Reporter.log("Date of demo is displayed");
		} else {
			Reporter.log("Date of demo is not displayed");
		}

		// Verify Date of demo is Enabled or Not
		if (dateOfDemo.isEnabled()) {
			Reporter.log("Date of demo is enabled");
			// Enter Date of demo
			dateOfDemo.sendKeys(dateOfDemoValue);
			Reporter.log("Date of demo entered is :" + dateOfDemoValue);
		} else {
			Reporter.log("Date of demo is not enabled");
		}

		// Convenient Time
		// Hour Drop Down
		WebElement convenientTimeHrDrpDwn = driver.findElement(By.xpath(hourDrpDwnLocator));
		// Verify Convenient Time Hour Drop Down is Displayed or Not
		if (convenientTimeHrDrpDwn.isDisplayed()) {
			Reporter.log("Convenient time hour dropdown is displayed");
		} else {
			Reporter.log("Convenient time hour dropdown is not displayed");
		}

		// Verify Convenient Time Hour Drop Down is Enabled or Not
		if (convenientTimeHrDrpDwn.isEnabled()) {
			Reporter.log("Convenient time hour dropdown is enabled");
			// To select Item from Convenient Time Hour Drop Down, Create the Select Object
			Select hourDropdown = new Select(convenientTimeHrDrpDwn);
			// Select using Visible Text
			hourDropdown.selectByVisibleText(hourDrpDwnValue);
			Reporter.log("Hour dropdown value selected is :" + hourDrpDwnValue);

		} else {
			Reporter.log("Convenient time hour dropdown is not enabled");
		}

		// Minute Drop Down
		WebElement convenientTimeMinDrpDwn = driver.findElement(By.xpath(minDrpDwnLocator));
		// Verify Convenient Time Minute Drop Down is Displayed or Not
		if (convenientTimeMinDrpDwn.isDisplayed()) {
			Reporter.log("Convenient time minute dropdown is displayed");
		} else {
			Reporter.log("Convenient time minute dropdown is not displayed");
		}

		// Verify Convenient Time Minute Drop Down is Enabled or Not
		if (convenientTimeMinDrpDwn.isEnabled()) {
			Reporter.log("Convenient time minute dropdown is enabled");
			// To select Item from Convenient Time Minute Drop Down, Create the Select
			// Object
			Select minDropdown = new Select(convenientTimeMinDrpDwn);
			// Select using Visible Text
			minDropdown.selectByVisibleText(minDrpDwnValue);
			Reporter.log("Minute dropdown value selected is :" + minDrpDwnValue);

		} else {
			Reporter.log("Convenient time minute dropdown is not enabled");
		}

		// Mobile Number
		WebElement mobileNumber = driver.findElement(By.xpath(mobileNumberLocator));
		// Verify mobile number is displayed or not
		if (mobileNumber.isDisplayed()) {
			Reporter.log("Mobile number is displayed");
		} else {
			Reporter.log("Mobile number is not displayed");
		}

		// Verify mobile number is enabled or not
		if (mobileNumber.isEnabled()) {
			Reporter.log("Mobile number is enabled");
			// Enter mobile number
			mobileNumber.sendKeys(mobileNumberValue);
			Reporter.log("Mobile number entered is :" + mobileNumberValue);
		} else {
			Reporter.log("Mobile number is not enabled");
		}

		// Enter Your Query
		WebElement enterYourQuery = driver.findElement(By.xpath(enterYourQueryLocator));
		// Verify Enter Your Query is displayed or not
		if (enterYourQuery.isDisplayed()) {
			Reporter.log("Enter your query is displayed");
		} else {
			Reporter.log("Enter your query is not displayed");
		}

		// Verify Enter Your Query is enabled or not
		if (enterYourQuery.isEnabled()) {
			Reporter.log("Enter your query is enabled");
			// Enter your query
			enterYourQuery.sendKeys(enterYourQueryValue);
			Reporter.log("Query entered is :" + enterYourQueryValue);
		} else {
			Reporter.log("Enter your query is not enabled");
		}

		// Enter two digits
		WebElement enterTwoDigits = driver.findElement(By.xpath(enterTwoDigitsLocator));
		// Verify enter two digits is displayed or not
		if (enterTwoDigits.isDisplayed()) {
			Reporter.log("Enter two digits is dispalyed");
		} else {
			Reporter.log("Enter two digits is not dispalyed");
		}

		// Verify enter two digits is enabled or not
		if (enterTwoDigits.isEnabled()) {
			Reporter.log("Enter two digits is enabled");
			// Retrieve verification number during runtime and enter the value
			String verNum = driver.findElement(By.xpath(verificationNumberLocator)).getText();
			String num[] = verNum.split(":");
			enterTwoDigits.sendKeys(num[1].trim());
			Reporter.log("Two digits number entered is :" + num[1].trim());
		} else {
			Reporter.log("Enter two digits is not enabled");
		}

		// Submit Button
		WebElement submitButton = driver.findElement(By.xpath(submitButtonLocator));
		// Verify submit button is displayed or not
		if (submitButton.isDisplayed()) {
			Reporter.log("Submit button is dispalyed");
		} else {
			Reporter.log("Submit button is not dispalyed");
		}

		// Verify submit button is enabled or not
		if (submitButton.isEnabled()) {
			Reporter.log("Submit button is enabled");
			// Click on submit button
			submitButton.sendKeys(Keys.ENTER);
			Reporter.log("Submit button is clicked");
		} else {
			Reporter.log("Submit button is not enabled");
		}

	}

	@Test(priority = 3)
	public void validatingSuccessfulMessage() {
		// Step 6: Submit the form
		WebElement successfulMessageText = driver.findElement(By.xpath(successfulMsgLocator));
		// Verify the Successful Message Text is Displayed or Not
		if (successfulMessageText.isDisplayed()) {
			Reporter.log("Successful Message Text is Displayed");
		} else {
			Reporter.log("Successful Message Text is Not Displayed");
		}

		// Validating successful message text
		String fullSuccessfulMsgText = successfulMessageText.getText();
		String actSuccessfulMsgText = fullSuccessfulMsgText.substring(0, 44).trim();

		String expSuccessfulMsgText = successfulMsgText;
		if (actSuccessfulMsgText.contains(expSuccessfulMsgText)) {
			Reporter.log("Actual and expected successful text messages are same");
			Reporter.log("Transaction ID is :" + fullSuccessfulMsgText.substring(65).trim());
		} else {
			Reporter.log("Actual and expected successful text messages are not same");
			Reporter.log("Actual successful message text is " + fullSuccessfulMsgText);
			Reporter.log("Expected successful message text is " + expSuccessfulMsgText);
		}
	}
	
}
