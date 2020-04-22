package com.cjc.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Common {
	
static	WebDriver driver;
	
	public static WebDriver openBrowser(String browsername, String urlname)
	{
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\amit\\Desktop\\Testing Document\\chromedriver_win32\\chromedriver.exe"
					  );
			
			driver=new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\amit\\Desktop\\Testing Document\\Selenium Jar File\\Testing Document\\11092019\\geckodriver-v0.25.0-win64\\geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
	
		else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\amit\\Desktop\\Testing Document\\Selenium Jar File\\Testing Document\\11092019\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(urlname);
	
		return driver;
	}
	

}
