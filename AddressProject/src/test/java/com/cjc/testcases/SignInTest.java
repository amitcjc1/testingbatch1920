package com.cjc.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cjc.pages.AddressPage;
import com.cjc.pages.SingIn;
import com.cjc.utility.Common;
public class SignInTest 
{

	@Test
	public void logincheckMt()
	{
		
		WebDriver driver=Common.openBrowser("chrome", "http://a.testaddressbook.com/sign_in");
		
    	SingIn login=PageFactory.initElements(driver, SingIn.class);
		
    	System.out.println("Hello SignIN PAge");
    	
		login.logincheck("aaa@gmail.com", "aaa");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.equalsIgnoreCase("http://a.testaddressbook.com/"))
		{
		
			AddressPage addressPage =PageFactory.initElements(driver, AddressPage.class);
			addressPage.clickadd();
			
		}
		else if (url.equalsIgnoreCase("http://a.testaddressbook.com/session")) {
			
		} 
		{
			/*
			 * WebDriver driver1=Common.openBrowser("chrome",
			 * "http://a.testaddressbook.com/session"); SingIn
			 * login1=PageFactory.initElements(driver1, SingIn.class);
			 */
			login.registeruser();
			
		}
		
	}
}
