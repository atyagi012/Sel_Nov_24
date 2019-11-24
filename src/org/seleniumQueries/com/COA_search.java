package org.seleniumQueries.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class COA_search extends BaseClass{

	@Test
	public void searchInCOA() throws Exception{
		driver.get("http://www.cheapoair.com");
		
		//Select OneWay
		driver.findElement(By.xpath("//label[@for='rbOW']")).click();
		System.out.println("One way is selected.");
		
		
		
		
		
		//Type
		WebElement from = driver.findElement(By.cssSelector("input[class='form-control pr-4']"));
		from.clear();
		from.sendKeys("LAS");
		
		//Wait for suggestion box
		//seleniumHelper.waitForElementPresent(By.cssSelector(""), 10, 500);
		Assert.assertTrue(seleniumHelper.waitForElementPresent(By.cssSelector("div[class*='suggestion-box__content']"), 10, 500), "Suggestion box is not present even after 10 seconds.");
		System.out.println("Suggestion box is present.");
		
		//Press TAB
		from.sendKeys(Keys.TAB);
		System.out.println("Origin is entered");
		
		//Enter Destination
		WebElement destination = driver.findElement(By.xpath("(//input[@class='form-control pr-4'])[2]"));
		destination.clear();
		destination.sendKeys("LAX");
		
		//Wait for suggestion box
		Assert.assertTrue(seleniumHelper.waitForElementPresent(By.xpath("(//div[contains(@class,'suggestion-box__content')])[2]"), 10, 100), "Suggestion box is not present even after 10 seconds.");
		System.out.println("Suggestion box is present.");
		
		destination.sendKeys(Keys.TAB);
		System.out.println("Destination is entered.");
		
		//Select Dates
		String startXp = "//div[@class='calendar__single-month active']/div[3]/div[";
		int i = 1;
		String endXp = "]/div";

		String xpathOfDates = startXp + i + endXp;
		
		for(i = 1; i<=42; i++) {
			xpathOfDates = startXp + i + endXp;
			
			try {
				String datesInCal = driver.findElement(By.xpath(xpathOfDates)).getText();
				//System.out.println(datesInCal);
				String[] arr = datesInCal.split("\n$");
				//datesInCal.
				
				String date = arr[0];
				System.out.println("arr1 is = " + arr[1]);
				System.out.println(date);
			}
			catch(Exception ex) {
				System.out.println("No date found for xpath = " + xpathOfDates);
			}
		}
		
	}
}
