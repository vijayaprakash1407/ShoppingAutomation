Feature: User should be able to create a new account for the application, signin and signout.
@newuser
Scenario: Create a new account for the user Matt, signin to the application and signout
   Given I am on the landing page
   When I click on signin link
   And I enter details for registers as a new user of the application
   Then I should get logged into the application
   And I should be able to view his account page
   And I view the sign out option