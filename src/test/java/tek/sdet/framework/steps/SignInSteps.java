package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();

	//same given in feature cucumber will find that step we don't need to rewrite it by "GLUE" we wrote in TestRunner
	@When("User click sign in button")
	public void userClickSignInButton() {
		//call method from CommonUtility class
		//pass parameter 
		click(factory.homePage().signinButton);
		logger.info("user clicked on Sign in button");
	}
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passValue) {
		sendText(factory.signinPage().emailInput, emailValue);
		sendText(factory.signinPage().passwordInput, passValue);
		logger.info("user enter email and password");
	}
	
	@And("User click Log in button")
	public void userClickLogInButton() {
		click(factory.signinPage().loginBtn);
		logger.info("user click Log in button");
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountButton));
		logger.info("user is logged in into account");
	}
	@And("User click on Logout option")
	public void userClickOnLogoutOption() {
		click(factory.homePage().logOutButton);
		waitTillPresence(factory.homePage().signinButton);
		Assert.assertTrue(isElementDisplayed(factory.homePage().signinButton));
		logger.info("user is logged out");
	}
	
}
