package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class FacebookDropDownExample extends BaseClass{
	
	@Test
	public void DropDownExample() {
		//Enter FIrst Name
		
		//Enter Sur Name
		
		
		//Mobile Number
		
		
		//Password
		
		
		//BirthDay - Dropdown
		//Day
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select selectValues = new Select(dayDropDown);
		selectValues.selectByIndex(5);   //should select date 5
		
		//Month
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select selectMonth = new Select(monthDropDown);
		selectMonth.selectByValue("5");    //should select May
		
		
		//Year
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select selectYear = new Select(yearDropDown);
		selectYear.selectByVisibleText("1990");
		
		
		//Select Gender
		//WebElement FemaleRadioButton = driver.findElement(By.id("u_0_6"));
		WebElement FemaleRadioButton = driver.findElement(By.xpath("//input[@class='_8esa']"));
		//Boolean IsFemaleDisplayed = FemaleRadioButton.isDisplayed();
		
		//if(IsFemaleDisplayed) {
		if(FemaleRadioButton.isDisplayed()) {
			System.out.println("Displayed");
		}
		else {
			System.out.println("Not Displayed");
		}
		
		if(FemaleRadioButton.isSelected()) {
			System.out.println("Selected");
		}
		else {
			System.out.println("Not selected");
		}
		
		FemaleRadioButton.click();
		System.out.println("Click on Female radio button");
		
		if(FemaleRadioButton.isSelected()) {
			System.out.println("Selected");
		}
		else {
			System.out.println("Not selected");
		}
	}

}
