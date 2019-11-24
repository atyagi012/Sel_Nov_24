package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class MouseOverExample extends BaseClass{

	@Test
	public void naukriMouseOverExample() {
		
		WebElement insights = driver.findElement(By.xpath("//div[text()='Insights']"));
		
		//Mouse over - Insights 
		Actions act = new Actions(driver);
		act.moveToElement(insights);
		act.build().perform();
		
		//Click on  - Salary Trands
		//Assignment
	}
}
