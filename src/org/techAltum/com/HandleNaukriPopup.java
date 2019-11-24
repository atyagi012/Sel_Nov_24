package org.techAltum.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import basePackage.BaseClass;

public class HandleNaukriPopup  extends BaseClass{

	@Test
	public void handleNaukriPopup() throws Exception{
		
		driver.get("http://www.naukri.com");
		Thread.sleep(2000);
		
		//Handle popup
		Set<String> windowHandler =  driver.getWindowHandles();
		System.out.println("Total wins are = " + windowHandler.size());
		System.out.println(windowHandler);
		
		//How to switch on Window = contd...
		List<String> myL = new ArrayList<String>();
		Iterator<String> itr = windowHandler.iterator();
		
		for(int i = 0; i<windowHandler.size(); i++) {
			myL.add(itr.next());
		}
		
		System.out.println("Values in list are = " + myL);
		
		/*
		 * driver.switchTo().window(myL.get(1)); System.out.println(driver.getTitle());
		 */
		
		/*
		 * for(int j = 0; j<myL.size(); j++) { driver.switchTo().window(myL.get(j));
		 * String windowTitle = driver.getTitle(); if(windowTitle.contains("Amazon")) {
		 * //Operation //Code driver.close(); break; } }
		 */
		
		//driver.switchTo().window(myL.get(0));
		int windowSize = myL.size();
		
		//Assignment
		/*
		while(windowSize > 0) {
			System.out.println("MyL size is = " + myL.size());
			driver.switchTo().window(myL.get(myL.size() - 1));
			windowSize--;
		}
		*/
		//https://www.geeksforgeeks.org/differences-between-hashmap-and-hashtable-in-java/#targetText=HashMap%20is%20non%20synchronized.,code%20whereas%20Hashtable%20is%20synchronized.&targetText=HashMap%20allows%20one%20null%20key,any%20null%20key%20or%20value.
		
		System.out.println(driver.getTitle());
		
	}
}
