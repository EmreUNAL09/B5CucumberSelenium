#-Write scenarios
#-Create step definitions
#-No need to use any JAVA code.
#-Just implement the step definitions by adding print statement.
#-Create new class NavigationMenuStepDefs

@NavigationMenu
Feature: Navigation Menu

  @Developer
  Scenario: Navigation to Developers menu
    Given The user is on the login page
    When  The user enters teacher credentials
    Then  The user should be able to sees welcome message
    And   The user navigates to Developers menu
    Then  The user able to see developer text


  Scenario: Navigation to All Post menu
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to sees welcome message
    And The user navigates to All Post menu
    Then The user able to see Posts text


  Scenario:Navigation to My Account menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to sees welcome message
    And The user navigates to My Account menu
    Then The user able to see dashboard text
