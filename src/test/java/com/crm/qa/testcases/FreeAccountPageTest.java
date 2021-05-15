package com.crm.qa.testcases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FreeAccountPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.InvoicesPage;
import com.crm.qa.pages.LoginPage;


public class FreeAccountPageTest extends TestBase {
	
	LoginPage loginPage; 
	HomePage homePage;
	FreeAccountPage freeAccountPage;
	InvoicesPage invoicesPage;
		
	public FreeAccountPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage = new HomePage();
		freeAccountPage = new FreeAccountPage();
		invoicesPage = new InvoicesPage();
		homePage.clickOnFreeAccountLink();
	}

	@Test
	public void freeAccountPageTitleTest() {
		String TitleTest = freeAccountPage.verifyTitle();
		Assert.assertEquals(TitleTest, "Cogmento CRM");
	}
	
	@Test
	public void upgradeToProTest() {
		Assert.assertTrue(freeAccountPage.UpgradeToPro());
	}
	
	@Test
	public void InvoicesLinkTest() throws IOException {
		invoicesPage = freeAccountPage.clickOnInvoicesLink();
	}
		
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
}
