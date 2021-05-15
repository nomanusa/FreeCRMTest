package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase {
	LoginPage loginPage;
	SignUpPage signUpPage;
	
	
	public SignUpPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		signUpPage = new SignUpPage();
		loginPage = new LoginPage();
		loginPage.signUpPage();
	}
	
	@Test
	public void verifyTitleTest() {
		String title = signUpPage.verifySignUpPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test
	public void displayRegisterTest() {
		Assert.assertTrue(signUpPage.displayRegister());
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
