package basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;
public class CommonUtility {

	private WebDriver driver;
	
	public CommonUtility(WebDriver driver) {
		this.driver = driver;
	}
	
	public Boolean waitForElementPresent(By byLocator, int totalTimeInSec, int pollingTimeInMiliSec) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(java.time.Duration.ofSeconds(totalTimeInSec))
				.pollingEvery(java.time.Duration.ofMillis(pollingTimeInMiliSec));
		
		Boolean isElementPresent = fluentWait.until(
				new Function<WebDriver, Boolean>() {
					public Boolean apply(WebDriver driver) {
						
						try {
							if(driver.findElement(byLocator).getAttribute("class").contains("visible"))
								return true;
						}
						catch(Exception ex) {}	
						return false;
					}
				});
		return isElementPresent;
	}
}
