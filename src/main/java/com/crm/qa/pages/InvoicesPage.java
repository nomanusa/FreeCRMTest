package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class InvoicesPage extends TestBase {

	
	
	@FindBy(xpath = "//th[contains(text(),'Date')]")
	WebElement DisplayDate;
	
	
	
	//initializing the page object:
	public InvoicesPage() throws IOException {
		PageFactory.initElements(driver, this); //Interview Question
	}
	
	//Actions
	public String verifyTitle() {
		return driver.getTitle();
	}
		
	public boolean displayDate() {
		return DisplayDate.isDisplayed();
	}
	
	
	
	
	
}
