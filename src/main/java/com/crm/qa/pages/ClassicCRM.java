package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class ClassicCRM extends TestBase {
	
	@FindBy(xpath = "//p[contains(text(),'1-415-200-2844')]")
	WebElement displayContractNumber;
	
	//initializing the page object:
	public ClassicCRM() throws IOException{
		PageFactory.initElements(driver, this); //Interview Question
	}
	
	//Action
	public String verifyClassicCRMTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyDisplayContractNumber() {
		return displayContractNumber.isDisplayed();
	}

}
