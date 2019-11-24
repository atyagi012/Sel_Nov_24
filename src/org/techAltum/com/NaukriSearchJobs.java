package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class NaukriSearchJobs extends BaseClass{

	@Test
	public void naukriSearchJobTest() throws Exception{
		driver.get("http://www.naukri.com");
		By byLocator = By.xpath("//div[text()='Jobs']");
		
		//Mouse Over - Jobs
		mouseOver(byLocator);
		System.out.println("Mouse Over - Done");
		
		mouseOver(By.xpath("//div[text()='More']"));
		
		//Click on Naukri Blog
		clickOn(By.xpath("//a[text()='Naukri Blog']"));
	
	}
}
