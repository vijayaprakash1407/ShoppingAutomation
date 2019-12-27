package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.MyAccountPage;

public class MyAccountPageSteps {

    TestContext testContext;
    MyAccountPage myAccountPage;

    public MyAccountPageSteps(TestContext testContext) {
        this.testContext = testContext;
        myAccountPage = testContext.getPageObjectManager().getMyAccountPage();
    }

    @Then("I should get logged into the application")
    public void i_should_get_logged_into_the_application() {
    	myAccountPage.validateAccountInfo();
    }
    
    @Then("I should be able to view his account page")
    public void i_should_be_able_to_view_his_account_page() {
    	myAccountPage.validateMyAccountText();
    }
    
    @Then("I view the sign out option")
    public void i_view_the_sign_out_option() {
    	myAccountPage.verifySigoutLink();
    }
}
