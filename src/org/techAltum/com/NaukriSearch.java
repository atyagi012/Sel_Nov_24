package org.techAltum.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class NaukriSearch extends BaseClass{

	@Test
	public void testCase01() {
		
		driver.get("http://www.naukri.com");
		
		//Click on Search Job Text Box
		clickOn(By.id("qsbClick"));
		
		//Enter Skills
		typeKeyword(By.name("qp"), "Java");

		
		//Enter Skills
		typeKeyword(By.name("ql"), "Noida");
		
		
		//CLick on Search Job button
		clickOn(By.id("qsbFormBtn"));
		
	}
}
