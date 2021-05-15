package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase {

	@FindBy(xpath = "//h2[contains(text(),'Register')]")
	WebElement isDisplayRegister;
	
	//Initialization
	public SignUpPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//Action
	public String verifySignUpPageTitle() {
		return driver.getTitle();
	}
	
	public boolean displayRegister() {
		return isDisplayRegister.isDisplayed();
	}
	
	
	
	
}
