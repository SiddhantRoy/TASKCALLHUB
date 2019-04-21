package com.Callhub.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Callhub.qa.TestBase.TestBaseClass;

public class Cartpage extends TestBaseClass{
	
	//pageFactory
	//remove
	@FindBy(xpath="//span[text()='Remove']")
	WebElement Remove;
	
	
	//initalizted the Page objects:
			public Cartpage() {
					
					PageFactory.initElements(driver, this);	
				}

			
			//Actions
			
			
			public void Removeitem() throws IOException
			{
				
				Remove.click();
			}
}
