package baseClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static Actions action;
	
	public  BasePage(WebDriver driver) {
		this.driver = driver;

		
		
		//		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		action = new Actions(driver);
	}

	
	
	
	public void clickOnElement(By by) {
		    WebElement element = driver.findElement(by);
			
			wait.until(ExpectedConditions.elementToBeClickable(by));
			
			action.scrollToElement(element).perform();
		
			element.click();
	}

	public void insertText(By by, String data) {
		WebElement element = driver.findElement(by);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
		action.scrollToElement(element).perform();

		element.sendKeys(data);
	}
	
}
