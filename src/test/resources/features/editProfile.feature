Feature: The user should be able to edit profile

  Background:
    Given The user is on the login page

  @edit
  Scenario: edit profile
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    And The user navigates to "Edit Profile"
    And The user select status "Instructor"
    And The user slides the slider 3
    And The user add "company" "Eurotech Study"
    And The user add "website" "http://www.eurotechstudy.com/"
    And The user add "location" "London"
    And The user add "skills" "Java,Cucumber,Junit"
    And The user add "githubusername" "eurotech2022"
    And The user add "bio" "SDET program"
    Then The user click on the submit button


  Scenario Outline:edit profile with Scenario Outline
    When The user logs in using "<email>" and "<password>"
    And The user navigates to "<add info module>"
    And The user select status "<status info>"
    And The user slides the slider 3
    And The user add "company" "<company info>"
    And The user add "website" "<website info>"
    And The user add "location" "<location info>"
    And The user add "skills" "<skills info>"
    And The user add "githubusername" "<github info>"
    And The user add "bio" "<bio info>"
    Then The user click on the submit button
    Examples:
      | email              | password   | add info module | status info      | company info   | website info                  | location info | skills info                | github info  | bio info     |
      | eurotech@gmail.com | Test12345! | Edit Profile    | Instructor       | Eurotech Study | http://www.eurotechstudy.com/ | London        | Java,Cucumber,Junit        | eurotech2022 | SDET program |
      | studentB5@ets.com  | studentB5  | Edit Profile    | Manager          | Eurotech Study | http://www.eurotechstudy.com/ | London        | Java,Cucumber              | eurotech2022 | SDET program |
      | isa@gmail.com      | 2828isa    | Edit Profile    | Senior Developer | Eurotech Study | http://www.eurotechstudy.com/ | London        | Java,Cucumber,Junit,github | isamat23     | SDET Study   |


