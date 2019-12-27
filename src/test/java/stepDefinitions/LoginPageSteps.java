package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {

    TestContext testContext;
    LoginPage loginPage;

    public LoginPageSteps(TestContext testContext) {
        this.testContext = testContext;
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @When("I enter username and password to select below products")
    public void i_enter_username_and_password_to_select_below_products(io.cucumber.datatable.DataTable dataTable) {
    	loginPage.enterUsername("Joe123@test.com");
        loginPage.enterPassword("Password1");
        loginPage.clickSignInButton();
        loginPage.selectProducts(dataTable);
       
    }
}
