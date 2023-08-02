Feature: Test Cogmento CRM application

  Scenario: Test login Functionality
    Given user is on login page
    When user enter valid username and password and click on login button

  # Code written by Gauri.
  Scenario: Test Home page Functionality
    When user is in home page validate homepage title.
    And validate home page URL.
    And validate home page logo.
