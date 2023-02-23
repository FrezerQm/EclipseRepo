Feature: Retail SignIn feature

  @smokeTest
  Scenario: Verify user can sign in into Retail Appication
    Given User is on retail website
    When User click sign in button
    And User enter email 'frezer@hot.com' and password 'Abc@12345'
    And User click Log in button
    Then User should be logged in into Account
    And User click on Logout option
#When we finish feature file click on pretty format to check if there is any error
