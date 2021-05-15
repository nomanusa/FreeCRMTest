package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ClassicCRM;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ClassicCRM classicCRM;
	SignUpPage signUpPage;
	
	
	public LoginPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		classicCRM = new ClassicCRM();
		signUpPage = new SignUpPage();
	}
	
	@Test
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test
	public void loginTest() throws IOException {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void classicCRMLinkTest() throws IOException {
		classicCRM = loginPage.ClassicCRMPageLink();
	}
	
	@Test
	public void signUpLinkTest() throws IOException {
		signUpPage = loginPage.signUpPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
