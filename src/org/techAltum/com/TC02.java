package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TC02 {

	@Test
	public void testCase01() {
		WebDriver driver;
	
		//Open Browser
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "F:\\Regression\\Selenium\\Drivers\\ChromeDriver_75\\chromedriver.exe");
		 * driver = new ChromeDriver();
		 */
		
		System.setProperty("webdriver.gecko.driver", "F:\\\\Regression\\\\Selenium\\\\Drivers\\\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Test Case
		//Enter First Name
		driver.findElement(By.name("firstname")).sendKeys("Amit");
		
		//Enter Last Name
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		
		
		
		
		
		
		//Close Browser
		//driver.close();
		
	}
}
