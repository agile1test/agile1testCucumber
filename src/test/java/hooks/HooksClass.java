package hooks;

import baseClasses.BaseStepDef;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class HooksClass extends BaseStepDef{
@Before("@smoke")
public void beforeSmoke() {
	
	System.out.println("hook for smoke");
	testSetup();
}

@Before("@reg")
public void beforereg() {
	
	System.out.println("Hook For Regression");
	testSetup();
}


@BeforeAll
public static void beforeALL() {
System.out.println("Before All");	
}


@BeforeStep
public  void beforeSteps() {
	System.out.println("Before each step");
}

@After
public void afterScen() {
	testTearDown();
}

}
