Feature: Negative Login Test
  @wip @smoke
  Scenario Outline: Negative Test
    Given The user is on the login page
    When The user logs in using "<userType>" and "<password>"
    Then The warning message contains "<message>"


    Examples:
      | userType          | password   | message                                                                   |
      | eurotech          | Test12345! | Please include an '@' in the email address. 'eurotech' is missing an '@'. |
      | eurotech@         | Test12345! | Please enter a part following '@'. 'eurotech@' is incomplete.             |
      | eurotech@gmail    | Test12345! | Please include a valid email!                                             |
      | eurotec@gmail.com | Test12345! | Invalid Credentials!                                                      |
