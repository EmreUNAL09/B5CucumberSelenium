Feature: Navigate to Menu with Parameters

  Background:
    Given The user is on the login page

@smoke
  Scenario: User navigates to Developers Menu
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The welcome message contains "Teacher"
    And The user navigates to "Developers" menu
    Then The user should be able to see header as "Filter Profiles by Skill or by Location"
  @smoke
  Scenario: User navigates to All Post Menu
    When The user logs in using "studentB5@ets.com" and "studentB5"
    Then The welcome message contains "student"
    And The user navigates to "All Posts" menu
    Then The user should be able to see header as "Posts"
  @smoke
  Scenario: User navigates to My Account Menu
    When The user logs in using "developerB5@ets.com" and "developerB5"
    Then The welcome message contains "developer"
    And The user navigates to "My Account" menu
    Then The user should be able to see header as "Dashboard"


 # class task
 # --> create Navigate to Menu with Parameters feature test with scenario outline
 # --> 10 minutes

  Scenario Outline: The User <name> Navigates Different Menu
    When The user logs in using "<userType>" and "<password>"
    Then The welcome message contains "<name>"
    And The user navigates to "<menu>" menu
    Then The user should be able to see header as "<header>"



    Examples:
      | userType            | password    | name      | menu       | header                                  |
      | eurotech@gmail.com  | Test12345!  | Teacher   | Developers | Filter Profiles by Skill or by Location |
      | studentB5@ets.com   | studentB5   | student   | All Posts  | Posts                                   |
      | developerB5@ets.com | developerB5 | developer | My Account | Dashboard                               |