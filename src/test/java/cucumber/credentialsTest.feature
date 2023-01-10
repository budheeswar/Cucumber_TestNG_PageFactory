Feature: TEST LOGIN CREDENTIALS

  Background: 
     After launching URL

    Then user should be in Login Page

  Scenario: Valid USERNAME and Valid PASSWORD
    When user enter valid username and password
    Then Login should be successful

  Scenario: Invalid USERNAME and Valid PASSWORD
    When user enter invalid username and password
    Then Login should be Unsuccessful
