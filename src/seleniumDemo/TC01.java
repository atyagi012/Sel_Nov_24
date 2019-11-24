package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01 {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "F:\\Regression\\Selenium\\Drivers\\ChromeDriver_77\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.naukri.com");
		//driver.navigate().to("http://www.naukri.com");
	}
	
	@Test
	public void testCaSE01() throws Exception{
		//Click on Search job text box
		driver.findElement(By.id("qsbClick")).click();
		System.out.println("Click on Search Job text box.");
		
		//Enter Skills
		//driver.findElement(By.name("qp")).sendKeys("Java");
		String skills = "Java";
		WebElement skillTextBox = driver.findElement(By.name("qp"));
		skillTextBox.sendKeys(skills);
		System.out.println("Skill is entered - " + skills);
		
		//Enter Location
		String location = "Noida";
		WebElement locationTextbox = driver.findElement(By.name("ql"));
		locationTextbox.sendKeys(location);
		System.out.println("Location is entered - " + location);
		
		//Click on Search
		WebElement searchButton = driver.findElement(By.id("qsbFormBtn"));
		searchButton.click();
		System.out.println("Click on Search button.");
		Thread.sleep(4000);
		
		
		//On next page, count total no. of jobs
		WebElement totalJobs = driver.findElement(By.xpath("//div[@class='small_title']"));
		String jobs = totalJobs.getText();
		System.out.println("Total jobs are = " + jobs);
		
	}
	
	@AfterMethod
	public void quitBrowser() {
		//close browser
		driver.quit();
	}
	
}
