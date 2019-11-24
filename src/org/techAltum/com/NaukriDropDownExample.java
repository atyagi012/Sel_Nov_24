package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class NaukriDropDownExample extends BaseClass{
	
	@Test
	public void DropDownExample() {
		//CLick on Search job text box
		//driver.findElement(By.id("qsbClick")).click();
		
		//FIndElement
		WebElement searchJobTextBox = driver.findElement(By.id("qsbClick"));
		
		//Perform Operation
		searchJobTextBox.click();
		System.out.println("CLick on search job text box");
		
		//Enter Skills
		WebElement skills = driver.findElement(By.name("qp"));
		skills.sendKeys("Java");
		
		//Enter Location
		driver.findElement(By.name("ql")).sendKeys("Noida");
		
		driver.findElement(By.name("ql")).sendKeys(Keys.TAB);
		
		//WebElement location = driver.findElement(By.name("ql"));
		//location.sendKeys("Noida");
		
		//Press TAB key
		//location.sendKeys(Keys.TAB);
		
		//Select Exp
		WebElement experience = driver.findElement(By.xpath("//input[@placeholder='Experience']"));
		/*
		 * experience.sendKeys(Keys.ARROW_DOWN); experience.sendKeys(Keys.ARROW_DOWN);
		 * experience.sendKeys(Keys.ARROW_DOWN); experience.sendKeys(Keys.ARROW_DOWN);
		 * experience.sendKeys(Keys.ARROW_DOWN); experience.sendKeys(Keys.ARROW_DOWN);
		 */
		
		for(int i = 1; i<=7; i++) {
			experience.sendKeys(Keys.ARROW_DOWN);
		}
		
		
		/*
		 * Select selectExp = new Select(experience); selectExp.selectByIndex(5);
		 * //should select 4 exp
		 */		
		
		
	}

}
