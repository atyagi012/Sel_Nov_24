package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class Snapdeal extends BaseClass{
	
	@Test
	public void snalDealLogin() throws Exception{
		//TC Logic
		//Mouse Over - SignIn
		WebElement signIn = driver.findElement(By.xpath("//div[@class='accountInner']"));
		
		Actions mouseOver = new Actions(driver);
		mouseOver.moveToElement(signIn);
		mouseOver.build().perform();      //Pls note
		System.out.println("Mouse over - Done");
		
		//Click on 
		WebElement logIn = driver.findElement(By.xpath("//a[@href='https://www.snapdeal.com/login']"));
		logIn.click();
		System.out.println("Click on Login");
		
		//There will be LOgin Popup
		//Enter Email/Mobile
		Thread.sleep(1500);
		
		//Switch to frame
		driver.switchTo().frame(driver.findElement(By.id("loginIframe")));
		
		//To come back from frame
		//driver.switchTo().defaultContent();
		
		//Enter Mobile number
		WebElement mobileNum = driver.findElement(By.id("userName"));
		mobileNum.sendKeys("9711235995");
		
		//Enter Passwd	
		
		
	}
}
