package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NaukriTest {

	//Declare WebDriver
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "F:\\Regression\\Selenium\\Drivers\\ChromeDriver_75\\chromedriver.exe");
		driver = new ChromeDriver();
		
		/*
		 * driver = new FirefoxDriver(); driver = new InternetExplorerDriver();
		 */
		
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.naukri.com");
	}
	
	@Test
	public void testCase01() throws Exception{
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		//Check if user is on correct page
		if(pageTitle.contains("naukri.com")) {
			System.out.println("User is on correct page");
		}
		else {
			System.out.println("User is not on correct page");
		}
		
		//Click on Search job text box
		driver.findElement(By.id("qsbClick")).click();
		System.out.println("Click on Search Job text box");
		
		//Enter Skills
		String skill = "Java";   ///Read this value from external source
		driver.findElement(By.name("qp")).sendKeys(skill);
		System.out.println("Skill is entered.");
		
		//Enter Loc
		driver.findElement(By.name("ql")).sendKeys("Noida");
		System.out.println("Loc is entered.");
		
		
		//CLick on Search
		driver.findElement(By.id("qsbFormBtn")).click();
		System.out.println("Click on Search");
		Thread.sleep(4000);
		
		//Check total no. of jobs
		String TotalJobs = driver.findElement(By.xpath("//div[@class='small_title']")).getText();
		System.out.println(TotalJobs);
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	
}
