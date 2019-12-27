package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import pages.OrdercompletePage;

public class OrderCompleteSteps {

    TestContext testContext;
    OrdercompletePage ordercompletePage;

    public OrderCompleteSteps(TestContext testContext) {
        this.testContext = testContext;
        ordercompletePage = testContext.getPageObjectManager().getOrdercompletePage();
    }
    
    @When("I navigates to payments page")
    public void i_navigates_to_payments_page() {
    	ordercompletePage.navigateToPayment();
    }

    @When("I opts {string} payment method")
    public void i_opts_payment_method(String string) {
    	ordercompletePage.clickWireTransfer();
    }

    @When("I confirms the order")
    public void i_confirms_the_order() {
    	ordercompletePage.confirmOrder();
    }

    @When("I will be taken to order confirmation page")
    public void i_will_be_taken_to_order_confirmation_page() {
    	ordercompletePage.confirmOrderPage();
    }

    @When("I completes the order")
    public void i_completes_the_order() {
    	ordercompletePage.verifyOrdercompleted();
    }

  
}
