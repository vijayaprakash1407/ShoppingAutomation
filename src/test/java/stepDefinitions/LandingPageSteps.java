package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LandingPage;

public class LandingPageSteps {

    TestContext testContext;
    LandingPage landingPage;

    public LandingPageSteps(TestContext testContext) {
        this.testContext = testContext;
        landingPage = testContext.getPageObjectManager().getLandingPage();
    }

    @Given("I am on the landing page")
    public void i_am_on_the_landing_page() {
        landingPage.navigateToLandingPage();
       
    }
    @When("I click on signin link")
    public void i_click_on_signin_link() {
    	 landingPage.clickSignInLink();
    }

  
}
