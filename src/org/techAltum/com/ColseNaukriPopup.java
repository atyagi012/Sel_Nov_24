package org.techAltum.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import basePackage.BaseClass;

public class ColseNaukriPopup extends BaseClass{
	
	@Test
	public void closeNaukriPopupas() throws Exception{
		
		driver.get("http://www.naukri.com");
		Thread.sleep(2000);
		
		//Handle Popup
		Set<String> windowHandler = driver.getWindowHandles();
		System.out.println("Total open windows are = " + windowHandler.size());
		System.out.println("windowHandler is = " + windowHandler);
		
		//Insert all values from windowHandler(Set<String>) to a List<String>
		List<String> handlingWindows = new ArrayList<String>();
		Iterator<String> itr = windowHandler.iterator();
		
		for(int i = 0; i<windowHandler.size(); i++) {
			handlingWindows.add(itr.next());
		}
		
		//Now all values are in a List<String> i.e. handlingWindows
		
		//Close all other popup except parent window
		for(int j = handlingWindows.size()-1; j>0; j--) {
			driver.switchTo().window(handlingWindows.get(j));
			System.out.println("Window title after switch to popup is = " + driver.getTitle());
			
			//close child window
			driver.close();
		}
		
		//From above code all popup are closed.
		//Now switch to parent window
		driver.switchTo().window(handlingWindows.get(0));
		System.out.println("Parent window title is = " + driver.getTitle());
	}
}
