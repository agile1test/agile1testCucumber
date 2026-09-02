package baseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.*;


public class BaseStepDef {

	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static Actions action;
	protected static HomePage home;
	
	protected static LoginPage login;
	protected static DashBoardPage dash;
	
	
	public static void testSetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://agile1test.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		action = new Actions(driver); 
		home = new HomePage(driver);
		login = new LoginPage(driver);
		dash = new DashBoardPage(driver);
		
	}
	public static void testTearDown() {
		if(driver!=null) {
			driver.close();
		}
	}
	
	
}
