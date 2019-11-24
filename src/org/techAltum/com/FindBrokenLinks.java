package org.techAltum.com;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class FindBrokenLinks extends BaseClass{

	@Test
	public void findBrokenLonks() throws Exception{

		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
		//Find broken links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links are = " + allLinks.size());
		
		for(int i = 0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}
		
		List<WebElement> newList = new ArrayList<WebElement>();
		
		for(int j = 0; j<allLinks.size(); j++) {
			
			if(!allLinks.get(j).getText().equals("")) {
				
				newList.add(allLinks.get(j));
			}
		}
		System.out.println("=======================================================");
		System.out.println("Size of new List is = " + newList.size());
		
		for(int k = 0; k<newList.size(); k++) {
			System.out.println(newList.get(k).getText());
			System.out.println(newList.get(k).getAttribute("href"));
			
			newList.get(k).click();
			Thread.sleep(2000);   //Explicit wait
			
			if(driver.findElement(By.tagName("body")).getText().contains("404")) {
				System.out.println("Broken link");
			}
			else {
				System.out.println("Link is working fine");
			}
			driver.navigate().back();
			System.out.println("***************************************");
		}
	}
}
