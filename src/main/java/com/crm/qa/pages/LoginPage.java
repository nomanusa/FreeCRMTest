package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	// Page Factory or object repository(OR)
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath="//*[text() = 'Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[text() = 'Sign Up']")
	WebElement signupbtn;
	
	@FindBy(xpath="//*[text() = 'Classic CRM']")
	WebElement classiccrmbtn;
	
	@FindBy(xpath="//a[contains(text(),'Classic CRM')]")
	WebElement classicCRM;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUp;
	
	//Initializing the page objects:
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this); // interview question
	}
	
	//Action
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
//	public HomePage login(String un, String pwd) {
//		username.sendKeys(un);
//		password.sendKeys(pwd);
//		loginbtn.click();
//		
//		return new HomePage(); //landing page is HomePage
//	}
	
	public HomePage login(String un, String pwd) throws IOException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		 return new HomePage();
	}
	
	public ClassicCRM ClassicCRMPageLink() throws IOException {
		classicCRM.click();
		return new ClassicCRM();
	}
	
	public SignUpPage signUpPage() throws IOException {
		signUp.click();
		return new SignUpPage();
	}
	
	
}
