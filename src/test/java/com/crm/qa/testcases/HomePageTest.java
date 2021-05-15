package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FreeAccountPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;


import junit.framework.Assert;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage; 
	HomePage homePage;
	FreeAccountPage freeAccountPage;
	
	public HomePageTest() throws IOException {
		super();
	}
	
	//Test case should be separated --- independent with each other
	//before each test case --- launch the browser and login
	//@Test --- execute test case
	//After each test case --- close the browser
		
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		freeAccountPage = new FreeAccountPage();
	}
	
	@Test
	public void homePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM");
		//Assert.assertEquals(homePageTitle, "Cogmento CRM", "Home page title not match");
	}
	
	@Test
	public void verifyUsernameTest() {
		Assert.assertTrue(homePage.verifyUserCorrectName());
	}
	
	@Test
	public void freeAccountLinkTest() throws IOException {
		freeAccountPage = homePage.clickOnFreeAccountLink();
	}
	
	@Test
	public void dealsLinkTest() {
		Assert.assertTrue(homePage.displayOnDealsLink());
	}
	
	@Test
	public void ContactsActivityStreamLinkTest() {
		Assert.assertTrue(homePage.displayContactsActivityStreamLink());
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
