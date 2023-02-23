package tek.sdet.framework.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.sdet.framework.utilities.CommonUtility;

public class BaseUITest extends CommonUtility{
	@Before   //import from io.cucumber not junit
	public void setupTest() {
		super.setupBrowser();
	}
	
	@After    //import from io.cucumber not junit
	public void closeTest(Scenario scenario) {
		if(scenario.isFailed()) {
			byte[] screenshot = takeScreenShotAsBytes();
			scenario.attach(screenshot, "image/png", scenario.getName()+"scenario Failed");
		}
		
		super.quitBrowser();
		//quitBrowser close the browser
		//quitDriver end the whole test case and need to start manually
	}

}
