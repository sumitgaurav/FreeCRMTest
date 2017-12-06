package com.crm.qa.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	String sheetName ="contacts";
	
	public ContactsPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(property.getProperty("username"),property.getProperty("password"));
		homePage.clickOnContactsLink();
	}
	
	//Added git comment	
	@Test(priority=1)
	public void verifyContactspageLabel(){
		Assert.assertTrue(contactsPage.verifyContactsLabel(),"Contacts label is missing on the page");
	}
	
	@Test(priority=2)
	public void selectContactsTest() throws InterruptedException{
		contactsPage.selectContactsByName("Bill Russell");
		Thread.sleep(5000);
	}
	
	@DataProvider
	public Object[][] getCRMTestData() throws InvalidFormatException, IOException{
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=3, dataProvider ="getCRMTestData")
	public void validateCreateNewContactTest(String title, String firstName, String lastName, String company	){
		homePage.clickOnNewContactLink();
		contactsPage.createNewContact(title, firstName, lastName, company);
	}
	
	@AfterMethod
	public void tearDown(){
	driver.quit();
	}
	
}
