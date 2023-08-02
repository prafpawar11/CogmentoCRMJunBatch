Feature: Test Cogmento CRM application

  Scenario: Test login Functionality
    Given user is on login page
    When user enter valid username and password and click on login button

  # Code written by Gauri.
  Scenario: Test Home page Functionality
    When user is in home page validate homepage title.
    And validate home page URL.
    And validate home page logo.
    
  #Code written by vishnu
  Scenario: Test the Contact page functionality
  When Click on contact links and validate user is on contact page
  Then User click on create button 
  And User enter firstname and lastname
  And Click on save button
  
  
    
