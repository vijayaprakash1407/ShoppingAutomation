Feature: User should be able to checkout, pay and complete an order.
  @ordercomplete 
  Scenario: User Complete the order
   Given I am on the landing page
   When I click on signin link
   And I enter username and password to select below products
      | Section   | Product                                 |
      | Women   | Faded Short Sleeve T-shirts |
    And I navigates to payments page
    And I opts "Pay by bank wire" payment method
    And I confirms the order
    And I will be taken to order confirmation page
    Then I completes the order

