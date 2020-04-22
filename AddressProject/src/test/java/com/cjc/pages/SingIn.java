package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SingIn 
{

WebDriver driver;
	
	public  SingIn( WebDriver driver) 
	{
	
		this.driver=driver;
	}
		
		
	
	// Basic Page Facrtory 
 	@FindBy(id = "session_email") WebElement username;
	
 	
 // Basic Page Facrtory 
  	@FindBy(xpath =   "//a[text()='Sign up']") WebElement signup;
 	
 	
 	
	//Dynamic 
	@FindBy(how=How.ID,using = "session_password") 
	@CacheLookup
	WebElement password;
	
	//
	@FindBy(how=How.XPATH,using = "//input[@type='submit']") 
	@CacheLookup
	WebElement loginbutton;
	
	
	public void logincheck(String uid,String pass)

	{
		
		username.sendKeys(uid);
		password.sendKeys(pass);
		loginbutton.click();
	}
	
	public void registeruser()

	{
		
		signup.click();
	}
	
	
		
	
	
}
