$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/OrderComplete.feature");
formatter.feature({
  "name": "User should be able to checkout, pay and complete an order.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User Complete the order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ordercomplete"
    }
  ]
});
formatter.step({
  "name": "I am on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageSteps.i_am_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on signin link",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageSteps.i_click_on_signin_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username and password to select below products",
  "rows": [
    {
      "cells": [
        "Section",
        "Product"
      ]
    },
    {
      "cells": [
        "Women",
        "Faded Short Sleeve T-shirts"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.i_enter_username_and_password_to_select_below_products(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigates to payments page",
  "keyword": "And "
});
formatter.match({
  "location": "OrderCompleteSteps.i_navigates_to_payments_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I opts \"Pay by bank wire\" payment method",
  "keyword": "And "
});
formatter.match({
  "location": "OrderCompleteSteps.i_opts_payment_method(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I confirms the order",
  "keyword": "And "
});
formatter.match({
  "location": "OrderCompleteSteps.i_confirms_the_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will be taken to order confirmation page",
  "keyword": "And "
});
formatter.match({
  "location": "OrderCompleteSteps.i_will_be_taken_to_order_confirmation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I completes the order",
  "keyword": "And "
});
formatter.match({
  "location": "OrderCompleteSteps.i_completes_the_order()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Register.feature");
formatter.feature({
  "name": "User should be able to create a new account for the application, signin and signout.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create a new account for the user Matt, signin to the application and signout",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@newuser"
    }
  ]
});
formatter.step({
  "name": "I am on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageSteps.i_am_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on signin link",
  "keyword": "When "
});
formatter.match({
  "location": "LandingPageSteps.i_click_on_signin_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter details for registers as a new user of the application",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterPageSteps.i_enter_details_for_registers_as_a_new_user_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get logged into the application",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountPageSteps.i_should_get_logged_into_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to view his account page",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountPageSteps.i_should_be_able_to_view_his_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I view the sign out option",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountPageSteps.i_view_the_sign_out_option()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});