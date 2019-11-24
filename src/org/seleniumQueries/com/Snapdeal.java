package org.seleniumQueries.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Snapdeal {

	
	WebDriver driver;
	
	@BeforeMethod
	
	public void OpenBrowser() {
		
		System.setProperty("WebDriver.chrome.driver", "F:\\Selenium_Practice\\Drivers\\ChromeDriver_75\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com");
		
		}
	
	 @Test
	 
	 public void TestCase() {
		 //Sign In
		 WebElement Signin =driver.findElement(By.xpath("//i[@class ='sd-icon sd-icon-menu']"));
		 driver.findElement(By.xpath("//a[@href='https://www.snapdeal.com/login']")).click();
		 driver.findElement(By.id("userName")).sendKeys("7906332298");
		 
		 
	 }
	
	@AfterMethod
	
	public void CloseBrowser() {
		
		//driver.quit();
		
		
	}
	
}
