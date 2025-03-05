package com.nxtgenai.mustdoassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterForDemoNewModified {

	public static void main(String[] args) {

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

		// Step 1: Create object instance for chrome driver
		WebDriver driver = new ChromeDriver();

		// Step 2: Launch the Home URL
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Application is launched");

		// Step 3: Click on Register for Demo page
		Actions act = new Actions(driver);
		WebElement demoSites = driver.findElement(By.xpath(demoSitesLocator));
		act.moveToElement(demoSites).perform();

		WebElement practiceAutomation = driver.findElement(By.xpath(pracAutomationLocator));
		act.moveToElement(practiceAutomation).perform();

		WebElement registerForDemo = driver.findElement(By.xpath(registractionFormLocator));
		registerForDemo.click();
		System.out.println("Navigated to register demo page");

		// Step 4: Validate the Title of the Form is displayed as "Register For Demo".
		// Positive Scenario
		WebElement registerForDemoTitle = driver.findElement(By.xpath(registerForDemoLocator));
		// Verify Register For Demo Title is Displayed or Not
		if (registerForDemoTitle.isDisplayed()) {
			System.out.println("Register for demo title is displayed");
		} else {
			System.out.println("Register for demo title is not displayed");
		}

		// Verify Register Title is Enabled or Not
		if (registerForDemoTitle.isEnabled()) {
			System.out.println("Register for demo title is enabled");
		} else {
			System.out.println("Register for demo title is not enabled");
		}

		// Validating the Register For Demo Title Text
		String actRegisterForDemoText = registerForDemoTitle.getText();
		String expRegisterForDemoText = expRegisterForDemoTextValue;

		if (actRegisterForDemoText.equals(expRegisterForDemoText)) {
			System.out.println("Actual and expected register for demo titles are same");
			System.out.println("Actual title is :" + actRegisterForDemoText);
			System.out.println("Expected title is :" + expRegisterForDemoText);
		} else {
			System.out.println("Actal and expected register for demo titles are not same");
			System.out.println("Actual title is :" + actRegisterForDemoText);
			System.out.println("Expected title is :" + expRegisterForDemoText);
		}

		// Step 5: Fill the Registration form by entering all fields
		// First name
		WebElement firstName = driver.findElement(By.xpath(firstNameLocator));
		// Verify the First Name is Displayed or Not
		if (firstName.isDisplayed()) {
			System.out.println("First name is displayed");
		} else {
			System.out.println("First name is not displayed");
		}

		// Verify the First Name is Enabled or Not
		if (firstName.isEnabled()) {
			System.out.println("First name is enabled");
			// Enter first name
			firstName.sendKeys(firstNameValue);
			System.out.println("First name entered is " + firstNameValue);
		} else {
			System.out.println("First name is not enabled");
		}

		// Last name
		WebElement lastName = driver.findElement(By.xpath(lastNameLocator));
		// Verify the Last Name is Displayed or Not
		if (lastName.isDisplayed()) {
			System.out.println("Last name is displayed");
		} else {
			System.out.println("Last name is not displayed");
		}

		// Verify the Last Name is Enabled or Not
		if (lastName.isEnabled()) {
			System.out.println("Last name is enabled");
			// Enter Last name
			lastName.sendKeys(lastnameValue);
			System.out.println("Last name entered is " + lastnameValue);
		} else {
			System.out.println("Last name is not enabled");
		}

		// Gender
		WebElement maleRadioBtn = driver.findElement(By.xpath(maleRadioBtnLocator));
		// Verify Male Radio Button is Displayed or Not
		if (maleRadioBtn.isDisplayed()) {
			System.out.println("Male radio button is displayed");
		} else {
			System.out.println("Male radio button is displayed");
		}

		// Verify Male Radio Button is Enabled or Not
		if (maleRadioBtn.isEnabled()) {
			System.out.println("Male radio button is enabled");
		} else {
			System.out.println("Male radio button is not enabled");
		}

		// Verify Male Radio Button is Selected or Not
		if (maleRadioBtn.isSelected()) {
			System.out.println("Male radio button is selected");
		} else {
			System.out.println("Male radio button is not selected");
			// Click on male radio button
			maleRadioBtn.click();
			System.out.println("Male radio button is selected");
		}

		// Verify Male Radio Button is Selected
		if (maleRadioBtn.isSelected()) {
			System.out.println("Verified Male radio button is selected");
		} else {
			System.out.println("Verified Male radio button is not selected");
		}

		// Course interested
		// Selenium WebDriver Check Box
		WebElement seleniumWebdriverChkBox = driver.findElement(By.xpath(seleniumWebdriverChkBoxLocator));
		// Verify Selenium Webdriver Check Box is Displayed or Not
		if (seleniumWebdriverChkBox.isDisplayed()) {
			System.out.println("Selenium webdriver check box is displayed");
		} else {
			System.out.println("Selenium webdriver check box is not displayed");
		}

		// Verify Selenium Webdriver Check Box is Enabled or Not
		if (seleniumWebdriverChkBox.isEnabled()) {
			System.out.println("Selenium webdriver check box is enabled");
		} else {
			System.out.println("Selenium webdriver check box is not enabled");
		}

		// Verify Selenium Webdriver Check Box Selected or Not - Initial State is
		// Not Selected
		if (seleniumWebdriverChkBox.isSelected()) {
			System.out.println("Selenium webdriver check box is selected");
		} else {
			System.out.println("Selenium webdriver check box is not selected");
			// Click on Selenium Webdriver Check Box
			seleniumWebdriverChkBox.click();
			System.out.println("Selenium webdriver check box is checked");
		}

		// Verify Selenium Webdriver Check Box Selected or Not
		if (seleniumWebdriverChkBox.isSelected()) {
			System.out.println("Selenium webdriver check box is selected");
		} else {
			System.out.println("Selenium webdriver check box is not selected");
		}

		// Functional Testing Check Box
		WebElement functionalTestingChkBox = driver.findElement(By.xpath(functionalTestingChkBoxLocator));
		// Verify Functional Testing Check Box is Displayed or Not
		if (functionalTestingChkBox.isDisplayed()) {
			System.out.println("Functional testing check box is displayed");
		} else {
			System.out.println("Functional testing check box is displayed");
		}

		// Verify Functional Testing Check Box is Enabled or Not
		if (functionalTestingChkBox.isEnabled()) {
			System.out.println("Functional testing check box is enabled");
		} else {
			System.out.println("Functional testing check box is not enabled");
		}

		// Verify Functional Testing Check Box Selected or Not - Initial State is
		// Not Selected
		if (functionalTestingChkBox.isSelected()) {
			System.out.println("Functional testing check box is selected");
		} else {
			System.out.println("Functional testing check box is not selected");
			// Click on Functional Testing Check Box
			functionalTestingChkBox.click();
			System.out.println("Functional testing check box is checked");
		}

		// Verify Functional Testing Check Box Selected or Not
		if (functionalTestingChkBox.isSelected()) {
			System.out.println("Functional testing check box is selected");
		} else {
			System.out.println("Functional testing check box is not selected");
		}

		// Address
		// Street Address
		WebElement streetAddress = driver.findElement(By.xpath(streetAddressLocator));
		// Verify the Street Address is Displayed or Not
		if (streetAddress.isDisplayed()) {
			System.out.println("Street address is displayed");
		} else {
			System.out.println("Street address is not displayed");
		}

		// Verify the Street Address is Enabled or Not
		if (streetAddress.isEnabled()) {
			System.out.println("Street address is enabled");
			// Enter the Street Address
			streetAddress.sendKeys(streetAddressValue);
			System.out.println("Street address entered is :" + streetAddressValue);
		} else {
			System.out.println("Street address is not enabled");
		}

		// Apartment Number
		WebElement apartmentNumber = driver.findElement(By.xpath(apartmentNumLocator));
		// Verify the Apartment Number is Displayed or Not
		if (apartmentNumber.isDisplayed()) {
			System.out.println("Apartment number is displayed");
		} else {
			System.out.println("Apartment number is not displayed");
		}

		// Verify the Apartment Number is Enabled or Not
		if (apartmentNumber.isEnabled()) {
			System.out.println("Apartment number is enabled");
			// Enter the Apartment Number
			apartmentNumber.sendKeys(apartmentNumberValue);
			System.out.println("Apartment number entered is :" + apartmentNumberValue);
		} else {
			System.out.println("Apartment number is not enabled");
		}

		// City
		WebElement cityName = driver.findElement(By.xpath(cityLocator));
		// Verify city name is Displayed or Not
		if (cityName.isDisplayed()) {
			System.out.println("City name is displayed");
		} else {
			System.out.println("City name is not displayed");
		}

		// Verify the city name is Enabled or Not
		if (cityName.isEnabled()) {
			System.out.println("City name is enabled");
			// Enter the city
			cityName.sendKeys(cityValue);
			System.out.println("City name entered is :" + cityValue);
		} else {
			System.out.println("City name is not enabled");
		}

		// State
		WebElement stateName = driver.findElement(By.xpath(stateLocator));
		// Verify state name is Displayed or Not
		if (stateName.isDisplayed()) {
			System.out.println("State name is displayed");
		} else {
			System.out.println("State name is not displayed");
		}

		// Verify the state name is Enabled or Not
		if (stateName.isEnabled()) {
			System.out.println("State name is enabled");
			// Enter the state
			stateName.sendKeys(stateValue);
			System.out.println("State name entered is :" + stateValue);
		} else {
			System.out.println("State name is not enabled");
		}

		// Postal code
		WebElement postalCode = driver.findElement(By.xpath(postalCodeLocator));
		// Verify postal code is Displayed or Not
		if (postalCode.isDisplayed()) {
			System.out.println("Postal code is displayed");
		} else {
			System.out.println("Postal code is not displayed");
		}

		// Verify the Postal code is Enabled or Not
		if (postalCode.isEnabled()) {
			System.out.println("Postal code is enabled");
			// Enter the Postal code
			postalCode.sendKeys(postalCodeValue);
			System.out.println("Postal code entered is :" + postalCodeValue);
		} else {
			System.out.println("Postal code is not enabled");
		}

		// Country Drop Down
		WebElement countryDrpDwn = driver.findElement(By.xpath(countryDrpDwnLocator));
		// Verify the Country Drop Down is Displayed or Not
		if (countryDrpDwn.isDisplayed()) {
			System.out.println("Country dropdown is displayed");
		} else {
			System.out.println("Country dropdown is not displayed");
		}

		// Verify the country dropdown is Enabled or Not
		if (countryDrpDwn.isEnabled()) {
			System.out.println("Country dropdown is enabled");
		} else {
			System.out.println("Country dropdown is not enabled");
		}

		// To Select the Item from Country Drop Down, Create the Select Object
		Select countryDrpDwnSel = new Select(countryDrpDwn);
		// Select Using Visible Text
		countryDrpDwnSel.selectByVisibleText(countryDrpDwnValue);
		System.out.println("Country dropdown value selected is " + countryDrpDwnValue);

		// Email
		WebElement email = driver.findElement(By.xpath(emailLocator));
		// Verify email is Displayed or Not
		if (email.isDisplayed()) {
			System.out.println("Email is displayed");
		} else {
			System.out.println("Email is not displayed");
		}

		// Verify email is Enabled or Not
		if (email.isEnabled()) {
			System.out.println("Email is enabled");
			// Enter email id
			email.sendKeys(emailValue);
			System.out.println("Email entered is :" + emailValue);
		} else {
			System.out.println("Email is not enabled");
		}

		// Date of Demo
		WebElement dateOfDemo = driver.findElement(By.xpath(dateOfDemoLocator));
		// Verify date of demo is Displayed or Not
		if (dateOfDemo.isDisplayed()) {
			System.out.println("Date of demo is displayed");
		} else {
			System.out.println("Date of demo is not displayed");
		}

		// Verify Date of demo is Enabled or Not
		if (dateOfDemo.isEnabled()) {
			System.out.println("Date of demo is enabled");
			// Enter Date of demo
			dateOfDemo.sendKeys(dateOfDemoValue);
			System.out.println("Date of demo entered is :" + dateOfDemoValue);
		} else {
			System.out.println("Date of demo is not enabled");
		}

		// Convenient Time
		// Hour Drop Down
		WebElement convenientTimeHrDrpDwn = driver.findElement(By.xpath(hourDrpDwnLocator));
		// Verify Convenient Time Hour Drop Down is Displayed or Not
		if (convenientTimeHrDrpDwn.isDisplayed()) {
			System.out.println("Convenient time hour dropdown is displayed");
		} else {
			System.out.println("Convenient time hour dropdown is not displayed");
		}

		// Verify Convenient Time Hour Drop Down is Enabled or Not
		if (convenientTimeHrDrpDwn.isEnabled()) {
			System.out.println("Convenient time hour dropdown is enabled");
			// To select Item from Convenient Time Hour Drop Down, Create the Select Object
			Select hourDropdown = new Select(convenientTimeHrDrpDwn);
			// Select using Visible Text
			hourDropdown.selectByVisibleText(hourDrpDwnValue);
			System.out.println("Hour dropdown value selected is :" + hourDrpDwnValue);

		} else {
			System.out.println("Convenient time hour dropdown is not enabled");
		}

		// Minute Drop Down
		WebElement convenientTimeMinDrpDwn = driver.findElement(By.xpath(minDrpDwnLocator));
		// Verify Convenient Time Minute Drop Down is Displayed or Not
		if (convenientTimeMinDrpDwn.isDisplayed()) {
			System.out.println("Convenient time minute dropdown is displayed");
		} else {
			System.out.println("Convenient time minute dropdown is not displayed");
		}

		// Verify Convenient Time Minute Drop Down is Enabled or Not
		if (convenientTimeMinDrpDwn.isEnabled()) {
			System.out.println("Convenient time minute dropdown is enabled");
			// To select Item from Convenient Time Minute Drop Down, Create the Select
			// Object
			Select minDropdown = new Select(convenientTimeMinDrpDwn);
			// Select using Visible Text
			minDropdown.selectByVisibleText(minDrpDwnValue);
			System.out.println("Minute dropdown value selected is :" + minDrpDwnValue);

		} else {
			System.out.println("Convenient time minute dropdown is not enabled");
		}

		// Mobile Number
		WebElement mobileNumber = driver.findElement(By.xpath(mobileNumberLocator));
		// Verify mobile number is displayed or not
		if (mobileNumber.isDisplayed()) {
			System.out.println("Mobile number is displayed");
		} else {
			System.out.println("Mobile number is not displayed");
		}

		// Verify mobile number is enabled or not
		if (mobileNumber.isEnabled()) {
			System.out.println("Mobile number is enabled");
			// Enter mobile number
			mobileNumber.sendKeys(mobileNumberValue);
			System.out.println("Mobile number entered is :" + mobileNumberValue);
		} else {
			System.out.println("Mobile number is not enabled");
		}

		// Enter Your Query
		WebElement enterYourQuery = driver.findElement(By.xpath(enterYourQueryLocator));
		// Verify Enter Your Query is displayed or not
		if (enterYourQuery.isDisplayed()) {
			System.out.println("Enter your query is displayed");
		} else {
			System.out.println("Enter your query is not displayed");
		}

		// Verify Enter Your Query is enabled or not
		if (enterYourQuery.isEnabled()) {
			System.out.println("Enter your query is enabled");
			// Enter your query
			enterYourQuery.sendKeys(enterYourQueryValue);
			System.out.println("Query entered is :" + enterYourQueryValue);
		} else {
			System.out.println("Enter your query is not enabled");
		}

		// Enter two digits
		WebElement enterTwoDigits = driver.findElement(By.xpath(enterTwoDigitsLocator));
		// Verify enter two digits is displayed or not
		if (enterTwoDigits.isDisplayed()) {
			System.out.println("Enter two digits is dispalyed");
		} else {
			System.out.println("Enter two digits is not dispalyed");
		}

		// Verify enter two digits is enabled or not
		if (enterTwoDigits.isEnabled()) {
			System.out.println("Enter two digits is enabled");
			// Retrieve verification number during runtime and enter the value
			String verNum = driver.findElement(By.xpath(verificationNumberLocator)).getText();
			String num[] = verNum.split(":");
			enterTwoDigits.sendKeys(num[1].trim());
			System.out.println("Two digits number entered is :" + num[1].trim());
		} else {
			System.out.println("Enter two digits is not enabled");
		}

		// Submit Button
		WebElement submitButton = driver.findElement(By.xpath(submitButtonLocator));
		// Verify submit button is displayed or not
		if (submitButton.isDisplayed()) {
			System.out.println("Submit button is dispalyed");
		} else {
			System.out.println("Submit button is not dispalyed");
		}

		// Verify submit button is enabled or not
		if (submitButton.isEnabled()) {
			System.out.println("Submit button is enabled");
			// Click on submit button
			submitButton.sendKeys(Keys.ENTER);
			System.out.println("Submit button is clicked");
		} else {
			System.out.println("Submit button is not enabled");
		}

		// Step 6: Submit the form
		WebElement successfulMessageText = driver.findElement(By.xpath(successfulMsgLocator));
		// Verify the Successful Message Text is Displayed or Not
		if (successfulMessageText.isDisplayed()) {
			System.out.println("Successful Message Text is Displayed");
		} else {
			System.out.println("Successful Message Text is Not Displayed");
		}

		// Validating successful message text
		String fullSuccessfulMsgText = successfulMessageText.getText();
		String actSuccessfulMsgText = fullSuccessfulMsgText.substring(0, 44).trim();

		String expSuccessfulMsgText = successfulMsgText;
		if (actSuccessfulMsgText.contains(expSuccessfulMsgText)) {
			System.out.println("Actual and expected successful text messages are same");
			System.out.println("Transaction ID is :" + fullSuccessfulMsgText.substring(65).trim());
		} else {
			System.out.println("Actual and expected successful text messages are not same");
			System.out.println("Actual successful message text is " + fullSuccessfulMsgText);
			System.out.println("Expected successful message text is " + expSuccessfulMsgText);
		}

		// Close the application
		driver.quit();
		System.out.println("Application is closed");
	}

}
