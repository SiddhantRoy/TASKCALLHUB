package com.Callhub.qa.TestCases;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Callhub.qa.TestBase.TestBaseClass;
import com.Callhub.qa.pages.SearchApple;

public class SearchAppleTC extends TestBaseClass{
	
	//create SearchApple object
	SearchApple searchapple;
	
	//create constructor of SearchAppleTC
	public SearchAppleTC()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp() 
	{	
		initialization();
		
		searchapple=new SearchApple();
	}
	
	@Test(priority=1)
	public void close()
	{
		
		
		searchapple.EnterIphone();
		System.out.println("TestScript 1 ");
		
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
}
