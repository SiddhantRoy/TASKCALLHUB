package com.Callhub.qa.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Callhub.qa.TestBase.TestBaseClass;
import com.Callhub.qa.pages.Listphonepage;
import com.Callhub.qa.pages.SearchApple;

public class ListPhoneTC extends TestBaseClass{
	
	SearchApple searchapple;
	Listphonepage listiphone;
	
	////create constructor of ListPhoneTC
	public ListPhoneTC()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
	{
		initialization();
		searchapple=new SearchApple();
		listiphone = searchapple.EnterIphone(); 
		
	}
	
	@Test
	public void Detail() throws InterruptedException
	{
		listiphone.Clickhightolowprise();
		Thread.sleep(2000);
		
		listiphone.Productdetails();
	}
	@Test
	public void Windowhandle() throws InterruptedException {
				
		listiphone.ClickApple();
		
		Thread.sleep(2000);
		listiphone.addtocart();
		System.out.println("add to cart");
	}
			
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
