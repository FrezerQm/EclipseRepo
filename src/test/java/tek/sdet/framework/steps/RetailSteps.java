package tek.sdet.framework.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility{
	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")    //case sensitive should copy paste from feature file
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		//if condition will not fail the test case so we will use Assertion in this case
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
		logger.info("User is on retail website");
		
	}
	
	@When("User search for {string} item")
	public void userSearchForItem(String value) {
		sendText(factory.homePage().searchBarInput,"Pokemon");
	    click(factory.homePage().searchButton);
	    logger.info("User search for " + value + " item");
	}
	
	@Then("Product should be displayed")
	public void productShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemonItem));
		logger.info("Product should be displayed");
	}

}
