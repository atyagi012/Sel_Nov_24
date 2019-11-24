package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class InitiateSearchCOA extends BaseClass{

	@Test
	public void fillWidgetAndSearchOnCOA() throws Exception{
		driver.get("http://www.cheapoair.com");
		
		//Enter Origin
		//Enter CityName - LAS
		String origin = "LAS";
		typeKeyword(By.cssSelector("input[class='form-control pr-4']"), origin);
		
		//Wait for element present - Auto suggestion box
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul[class='suggestion-box__list']")));
		
		//Select Value from auto suggest
		driver.findElement(By.cssSelector("input[class='form-control pr-4']")).sendKeys(Keys.TAB);
		
		
		
		/*Enter Destination
		Enter CityName - LAX
		Wait for auto Suggestion box
		Select City from auto suggestio*/
		/*
		 * Select Date - Depart Date : CurrentDate + 10 Days Select Date - Return Date :
		 * Depart Date + 7 Days Click on Search button Verify that Listing page is
		 * loaded Verify Origin, Destination, Depart date, Return Date on Listing page
		 */
		
	}
}
