package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ClassicCRM;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ClassicCRMTest extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	ClassicCRM classicCRM;
	
	public ClassicCRMTest() throws IOException {
		super();
	}
		
	@BeforeMethod
	public void setUp() throws IOException {
	initialization();
	loginPage = new LoginPage();
	homePage = new HomePage();
	classicCRM = new ClassicCRM();
	loginPage.ClassicCRMPageLink();
	}
	
	@Test
	public void verifyClassicCRMTitleTest() {
		String title = classicCRM.verifyClassicCRMTitle();
		Assert.assertEquals(title, "CRMPRO Log In Screen");
	}
	
	@Test
	public void displayCRMPROLogoTest() {
		boolean flag = classicCRM.verifyDisplayContractNumber();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
