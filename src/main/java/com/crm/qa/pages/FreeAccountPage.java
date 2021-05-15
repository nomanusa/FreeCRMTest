package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class FreeAccountPage extends TestBase {
	
		
	@FindBy(xpath = "//a[contains(text(), 'Free account')]")
	WebElement freeAccountLink;
	
	@FindBy(xpath = "//h4[contains(text(),'Upgrade to Pro')]")
	WebElement displayUpgradeToPro;
	
	@FindBy(xpath = "//a[contains(text(),'Invoices')]")
	WebElement displayInvoicesPage;
	
	//initializing the page object:
	public FreeAccountPage() throws IOException {
		PageFactory.initElements(driver, this); //Interview Question
	}
	
	//Actions
	public String verifyTitle() {
		return driver.getTitle();
	}
			
	public boolean UpgradeToPro() {
		return displayUpgradeToPro.isDisplayed();
	}
	
	public InvoicesPage clickOnInvoicesLink() throws IOException {
		displayInvoicesPage.click();
		return new InvoicesPage();
	}
}
