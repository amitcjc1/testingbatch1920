package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressPage
{

	
	
WebDriver driver;
	
	public   AddressPage(WebDriver driver) 
	{
	
		this.driver=driver;
	}
		
		
	
	// Basic Page Facrtory 
 	@FindBy(xpath ="//*[@id=\"navbar\"]/div[1]/a[2]") WebElement addresslink;
	
	/*
	 * //Dynamic
	 * 
	 * @FindBy(how=How.ID,using = "session_password")
	 * 
	 * @CacheLookup WebElement password;
	 * 
	 * //
	 * 
	 * @FindBy(how=How.XPATH,using = "//input[@type='submit']")
	 * 
	 * @CacheLookup WebElement loginbutton;
	 */
	
	public void clickadd()
	{
		addresslink.click();
	}
	
	
	
	
	
}
