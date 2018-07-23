package stepDefinations;

import cucumber.TestContext;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    TestContext testContext;


    public Hooks(TestContext context){
        testContext= context;
    }

    @Before
    public void BeforeSteps(){
        		/*What all you can perform here
			Starting a webdriver
			Setting up DB connections
			Setting up test data
			Setting up browser cookies
			Navigating to certain page
			or anything before the test
		*/

    }

    @After
    public void AfterSteps(){
        testContext.getWebDriverManager().closeDriver();
    }
}
