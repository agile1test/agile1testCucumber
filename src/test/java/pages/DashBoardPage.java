package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseClasses.BasePage;

public class DashBoardPage extends BasePage{

	public DashBoardPage(WebDriver driver) {
		super(driver);
		
	}
	protected By welcomeMsgBy = By.xpath("//h1[@id='page-title']"); 
	
	public boolean isWelcomMsgDisplayed() {
		String actualMsg = driver.findElement(welcomeMsgBy).getText();
		return actualMsg.contains("Welcome back,");
	}
	
	
	
	public boolean isDashboardDisplayed() {
		 String actualTitle = driver.getTitle();
		 return actualTitle.equals("Dashboard | Agile1Tech QA Practice Portal");
	}
}
