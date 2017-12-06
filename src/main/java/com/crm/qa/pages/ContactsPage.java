package com.crm.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{

	
	Logger log = Logger.getLogger(ContactsPage.class);
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	@FindBy(name="title")
	WebElement title;

	@FindBy(name="first_name")
	WebElement firstName;
	
	@FindBy(name="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	public ContactsPage(){
		PageFactory.initElements(driver,this);
	}
	
	
	
	public boolean verifyContactsLabel(){
		log.info("Verifying Contact Label is displaying");
		return contactsLabel.isDisplayed();	
	}
	
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']"
				+ "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		log.info("Selecting different Contacts by selecting names provided..");
	}
	
	public void createNewContact(String titl,String ftName, String ltName, String comp){
	 Select select = new Select(title);;
	 select.selectByVisibleText(titl);
	 firstName.sendKeys(ftName);
	 lastName.sendKeys(ltName);
	 company.sendKeys(comp);
	 saveBtn.click();
	 log.info("Creating new contact list by providing Title, Name and Company name of user**********************************************");
	}
}
