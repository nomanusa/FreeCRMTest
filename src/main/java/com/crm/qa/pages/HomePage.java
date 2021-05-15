package com.crm.qa.pages;

import java.io.IOException;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//span[contains(text(),'noman siddiki')]")
	WebElement userNameLevel;
	
	@FindBy(xpath = "//a[contains(text(), 'Free account')]")
	WebElement freeAccountLink;
	
	@FindBy(xpath = "//div[contains(text(), 'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath = "//div[contains(text(), 'Contacts activity stream')]")
	WebElement contactsActivityStreamLink;
	
	//Initializing the page objects:
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this); // interview question
	}
	
	//Actions
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyUserCorrectName() {
		return userNameLevel.isDisplayed();
	}
	
	public FreeAccountPage clickOnFreeAccountLink() throws IOException {
		freeAccountLink.click();
		return new FreeAccountPage();
	}
	
	public boolean displayOnDealsLink() {
		return dealsLink.isDisplayed();
	}
	
	public boolean displayContactsActivityStreamLink() {
		return contactsActivityStreamLink.isDisplayed();
	}

	
		
	
	
}
