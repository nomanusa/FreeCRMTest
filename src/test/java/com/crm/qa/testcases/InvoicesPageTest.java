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

public class InvoicesPageTest extends TestBase {
	
	InvoicesPage invoicesPage;
	FreeAccountPage freeAccountPage;
	HomePage homePage;
	LoginPage loginPage;
	
	public InvoicesPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void InvoicesPagesetUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
		freeAccountPage = new FreeAccountPage();
		homePage = new HomePage();
		invoicesPage = new InvoicesPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickOnFreeAccountLink();
		freeAccountPage.clickOnInvoicesLink();
	}
	
	@Test
	public void invoicesPageTitelTest() {
		String invtit = invoicesPage.verifyTitle();
		Assert.assertEquals(invtit, "Cogmento CRM");
	}
	
	@Test
	public void verifyDisplayDateTest() {
		Assert.assertTrue(invoicesPage.displayDate());
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
