package stepDefs;

import org.testng.Assert;

import baseClasses.BaseStepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseStepDef {
	@Given("user is in the login page")
	public void user_in_the_login_Page() {
//		testSetup();
		home.clickSignINLink();

	}
	
	
	
	
	
	@When("user insert valid email")
	public void user_insert_valid_email() {
		login.insertEmail("student@qa.test");
	}
	
	@When("user insert valid {string} data")
	public void user_insert_valid(String email) {
	    // Write code here that turns the phrase above into concrete actions
		login.insertEmail(email);
	}

	
	
	@When("user inserts valid password")
	public void user_inserts_valid_password() {
		login.insertPassword("Password123");
	}
	
	@When("user inserts valid {string}")
	public void user_inserts_valid(String pass) {
	    // Write code here that turns the phrase above into concrete actions
		login.insertPassword(pass);
	}

	
	
	

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		login.clickBtnSignIn();
	}

	@Then("dashboard page should be displayed")
	public void dashboard_page_should_be_displayed() {
	   Assert.assertTrue(dash.isDashboardDisplayed());;
	}

	@Then("an welcome message should be displayed")
	public void an_welcome_message_should_be_displayed() {
	    Assert.assertTrue(dash.isWelcomMsgDisplayed());
	}

	@When("user insert invalid email")
	public void user_insert_invalid_email() {
	    
	}

	@When("user inserts invalid password")
	public void user_inserts_invalid_password() {
	    
	}

	@Then("error message should be displayed")
	public void error_message_should_be_displayed() {
	    
	}
	
	
}
