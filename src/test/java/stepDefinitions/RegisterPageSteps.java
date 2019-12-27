package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pages.RegisterPage;

public class RegisterPageSteps {

    TestContext testContext;
    RegisterPage registerPage;

    public RegisterPageSteps(TestContext testContext) {
        this.testContext = testContext;
        registerPage = testContext.getPageObjectManager().getRegisterPage();
    }

    @When("I enter details for registers as a new user of the application")
    public void i_enter_details_for_registers_as_a_new_user_of_the_application() {
    	registerPage.enterRegistrationDetails();
    }
    
    
}
