package com.Callhub.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Callhub.qa.TestBase.TestBaseClass;

public class SearchApple extends TestBaseClass{
	
	//pageFactory==pom
	@FindBy(xpath="//button[text()='✕']")
	WebElement popup;
	
	@FindBy(xpath="//span[text()='Electronics']/..")
	WebElement Electronics;
	
	@FindBy(xpath="//a[text()='Apple']")
	WebElement Apple;
	
	@FindBy(name="q")
	WebElement Searchbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchbutton;
	
	
	
	//initalizted the Page objects:
	public SearchApple() {
			
			PageFactory.initElements(driver, this);	
		}
	
	//Action
	
	
	public Listphonepage  EnterIphone()
	{
		popup.click();
		
		Searchbox.sendKeys("iphone7");
		searchbutton.click();
		
		return new Listphonepage();
		
	}
	
	
}
