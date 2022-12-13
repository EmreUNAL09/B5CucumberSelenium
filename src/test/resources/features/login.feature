@Login @smoke
Feature: Eurotech log in test
  # Agile story : As a user, I should be able to log in so I can see my account
  Background:
    Given The user is on the login page


  @Teacher @Eurotech
  Scenario: Login as a teacher
    When The user enters teacher credentials
    Then The user should be able to login

  @Student @Eurotech
  Scenario: Login as a student
    When The user enters student credentials
    Then The user should be able to login

  @db
  Scenario: Login as a developer
    When The user enters developer credentials
    Then The user should be able to login


