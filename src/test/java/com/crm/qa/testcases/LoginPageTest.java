package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage= new LoginPage();
	}
	
	
	/**
	 * @Test level if we wanted to reexecute failed test again then in test method after priority lever we have to put this code 
	 * ---------------------------------"retryAnalyzer = com.crm.qa.Analyzer.RetryAnalyzer.class"-----------------------------------
	 * So that it will check multiple times if it works or not.Some times page not loading properly or AJAX components not coming properly
	 * or text is not displaying , dropdown not coming, time out issue. To over come these situations we can use this script to re excute
	 *  failed test cases as many times we want.
	 *  
	 *  But this is not a good approach to run the code as we have to manually write above scripts for each and every test method, so 
	 *  we will use run time retry logic. For that we will be create one more package under Analyzer package and import from 
	 */
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "1 Free CRM for Any Business: Online Customer Relationship Software");
	}
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean logo = loginPage.validateCRMImage();
		Assert.assertTrue(logo);
	}
	 
	@Test(priority=3)
	public void loginTest() throws InterruptedException{
		homePage =loginPage.login(property.getProperty("username"), property.getProperty("password"));	
	}
	
	@AfterMethod
	public void tearDown(){
	driver.quit();
	}
}
