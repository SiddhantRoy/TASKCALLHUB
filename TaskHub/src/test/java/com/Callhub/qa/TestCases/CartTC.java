package com.Callhub.qa.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Callhub.qa.TestBase.TestBaseClass;
import com.Callhub.qa.pages.Cartpage;
import com.Callhub.qa.pages.Listphonepage;
import com.Callhub.qa.pages.SearchApple;

public class CartTC extends TestBaseClass{
	
	SearchApple searchapple;
	Listphonepage listiphone;
	Cartpage cartpage;

	
	//create constructor of IphoneTC
		public CartTC()
		{
			super();
		}

		@BeforeMethod
		public void setUp() throws IOException, InterruptedException
		{
			initialization(); 
			searchapple=new SearchApple();
			listiphone = searchapple.EnterIphone(); 
			cartpage=listiphone.ClickCart();
			
		}
		
		
		@Test
		public void Test() throws InterruptedException, IOException 
		{
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//span[contains(text(),'Cart')]")).click();
			String title=driver.getTitle();
		
			String exp="Shopping Cart | Flipkart.com";
			
			System.out.println(title);
			if(title.equals(exp))
			{
				Screenshot();
				System.out.println("take screen shot");
			}
			else {
				System.out.println("dont no");
			}
			//cartpage.Removeitem();
			System.out.println("item is successfully remove");
			
}
		
		
		

		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
		
}
