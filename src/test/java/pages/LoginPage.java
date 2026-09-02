package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseClasses.BasePage;

public class LoginPage extends BasePage {
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}



	private By inputEmailBy = By.xpath("//input[@name='email']");

	private By inputPassBy = By.xpath("//input[@name='password']");

	private By btnSignInBy = By.xpath("//button[@name='btn-login']");
	
	private By btnSignIntBy = By.xpath("//button[@name='btn-login']");

	
	public void insertEmail(String email) {
		insertText(inputEmailBy, email);
	}

	public void insertPassword(String password) {
		insertText(inputPassBy, password);
	}
	


	public void clickBtnSignIn() {
		clickOnElement(btnSignInBy);
	}
}
