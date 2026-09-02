package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseClasses.BasePage;


public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	private By enrollNowLinkBy = By.partialLinkText("Enroll Now");
	private By signInLinkBy = By.xpath("//a[contains(text(),'Sign In')]");
	public void clickEnrollNowLink() {
		driver.findElement(enrollNowLinkBy).click();
	}
	
	public void clickSignINLink() {
		clickOnElement(signInLinkBy);
	}

}
