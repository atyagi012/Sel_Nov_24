package nov24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01 {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		String projectPath = System.getProperty("user.dir");
		String driverPath = projectPath + "\\browserDriverEXE\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.google.com");
		
	}
	
	@Test
	public void testCase01() {
		driver.findElement(By.id("abc")).isDisplayed();
	}
	
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	
}
