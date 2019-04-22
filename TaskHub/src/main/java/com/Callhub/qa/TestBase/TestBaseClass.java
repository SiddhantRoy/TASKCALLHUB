package com.Callhub.qa.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaseClass {

	public static WebDriver driver;
	public static Properties prop;

	// create constructer
	public TestBaseClass() {

		// pass "config,properties'
		try {

			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\siddhant sankar\\eclipse-work\\TaskHub\\src\\main\\java\\com\\Callhub"
							+ "\\qa\\config\\config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	// initialization method
	public static void initialization() 
	{
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("Googlechrome")) {
			                                       // "give chromedriver path"
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\siddhant sankar\\eclipse-work\\TaskHub\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			                                                   // "geckodriver path"
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String search_url = prop.getProperty("url");
		System.out.println(search_url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(search_url);
		
		
	}

	// Handle the multipule window
	public void switchTowindow() {

        driver.getWindowHandle();
		//driver.switchTo().window(childid);
	
		/*Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		String parentId = it.next();
		String childId = it.next();

		driver.switchTo().window(parentId);
*/
	}

	// switch driver control to mainwindow
	public void Mainwindow() {
		driver.close();
		driver.switchTo().defaultContent();
	}

	// Take a screenshort
	public void Screenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scrFile, new File("C:\\Users\\siddhant sankar\\eclipse-work\\TaskHub\\Screen_Shot\\img.png"));
	}

}
