package basePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	protected WebDriver driver;
	public CommonUtility seleniumHelper;
	
	@BeforeMethod
	public void openBrowser() {
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "F:\\Regression\\Selenium\\Drivers\\ChromeDriver_77\\chromedriver.exe");
		driver = new ChromeDriver();
		seleniumHelper = new CommonUtility(driver);
		//imp wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quitBrowser() {
		 driver.quit();
	}

	public void clickOn(By byLocator) {
		WebElement element = driver.findElement(byLocator);
		element.click();
	}

	public void typeKeyword(By byLocator, String keyword) {
		WebElement element = driver.findElement(byLocator);
		element.sendKeys(keyword);
	}
	
	public void mouseOver(By byLocator) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(byLocator));
		act.build().perform();
	}
}
