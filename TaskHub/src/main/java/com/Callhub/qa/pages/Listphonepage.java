package com.Callhub.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.Callhub.qa.TestBase.TestBaseClass;

public class Listphonepage extends TestBaseClass{
	
	//pageFactory==POM
	
	@FindBy(xpath="//div[text()='Price -- High to Low']")
	WebElement Hightolow;
	
	//single iphone
	@FindBy(xpath="//div[contains(text(),'Apple iPhone 7 Plus (Gold, 256 GB)')]")
	WebElement SingleIphone;
	
	//clickaddtocart //button[text()='GO TO CART']
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement clickToCart;
	
	//click cart  //a[@class='_3ko_Ud']
	@FindBy(xpath="//span[contains(text(),'Cart')]")
	WebElement Cart;
	
	
	
	//initalizted the Page objects:
		public Listphonepage() {
				
				PageFactory.initElements(driver, this);	
			}
	
	//Action
		public void Clickhightolowprise()
		{
			Hightolow.click();
		}
		
		
		//Print product and price
		public void Productdetails()
		{
			//products name
		    List<WebElement> pname=driver.findElements(By.xpath("//div[contains(text(), 'Apple iPhone')]"));
			
			//product price
			List<WebElement> price=driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
			
			for(int i=1; i<pname.size()-1;i++)
			
			{
				String prodname1=pname.get(i).getText();
				System.out.println("product name:"+prodname1);
				String prodprice1=price.get(i).getText();
				System.out.println("product name:"+prodprice1);
				
				
			}
			
			
		}
		
		
		public void ClickApple() 
		{
		
			//products name
		    /*List<WebElement> pname=driver.findElements(By.xpath("//div[contains(text(), 'Apple iPhone')]"));
			for(int j=1 ; j<pname.size();j++)
			{
				String iphone=pname.get(j).getText();
				
				if (iphone.equals("Apple iPhone 7 Plus (Silver, 256 GB)"))
				{
					pname.get(j).click();
					break;
				}
				break;
			}*/
			
			SingleIphone.click();
			switchTowindow();
			//driver.getWindowHandle();
			
		}
		
		public Shopcart addtocart()
		{
			 clickToCart.click();
			 Mainwindow();
			 return new Shopcart();
		}
		
		public Cartpage ClickCart()
		{
			Cart.click();
			String str=driver.getTitle();
			System.out.println(str);
			return new Cartpage();
		}

		

}
