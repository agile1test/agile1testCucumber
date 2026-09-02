package testRunner;

import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\zahid\\Documents\\Instructors\\Faisal\\SQA\\May2026\\agile1testCucumber\\src\\test\\resources\\featureFiles",
		glue = {"stepDefs","hooks"}, 
		tags ="@reg",
		plugin = {
				"pretty",
				"html:target/smokeReport.html"
				
		}
		
		
		
		
		
		)


public class TestRunner extends AbstractTestNGCucumberTests{
//		@Override
//		@DataProvider(parallel = true)
//		public  Object[][] scenarios(){
//			return super.scenarios();
//		}
		
	
}
