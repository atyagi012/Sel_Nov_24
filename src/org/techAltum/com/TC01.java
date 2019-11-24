package org.techAltum.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//to import all at once - ctrl + shift + o
//To know all shortcut of eclipse use - ctrl + shijft + l
public class TC01 {

	//Declare WebDriver
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		//Open Browser
		//System.setProperty("webdriver.chrome.driver", "F:\\Regression\\Selenium\\Drivers\\ChromeDriver_75\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		/*
		 * System.setProperty("webdriver.edge.driver",
		 * "F:\\Regression\\Selenium\\Drivers_ZIP\\MicrosoftWebDriver.exe"); driver =
		 * new EdgeDriver();
		 */
		
		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "F:\\Regression\\Selenium\\Drivers\\IEDriverServer.exe"); driver = new
		 * InternetExplorerDriver();
		 */
		
		//Forefox Browser
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "F:\\Regression\\Selenium\\Drivers\\geckodriver.exe"); driver = new
		 * FirefoxDriver();
		 */
		
		System.setProperty("webdriver.ie.driver", "F:\\Regression\\Selenium\\\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.naukri.com");
	}
	
	@Test
	public void testCase01() {
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
}
