Feature: CRM login feature
  User Story:
  As as user, I should be able to login.

  Background:
    Given user is on the login page


  Scenario: Login as HR user
    When user enters HR user credentials
    Then user should be able to log in and land on the HR home page

  Scenario: Login as Marketing user
    When user enters Marketing user credentials
    Then user should be able to log in and land on the Marketing home page

  Scenario: Login as Helpdesk user
    When user enters Helpdesk user credentials
    Then user should be able to log in and land on the Helpdisk home page




