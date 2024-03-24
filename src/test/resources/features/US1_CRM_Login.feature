@us1Login
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


  Scenario Outline: Login with invalid credential
    When user try to login with incorrect "<username>" and "<password>"
    Then user should see Incorrect login or password message

    Examples:
      | username            | password      |
      | hr1@cydeo.com       | wrongUser123  |
      | 123abcd1@c1ydeo.com | UserUser      |
      | wrongUserName       | wrongPassword |



  Scenario Outline: Login with no credential
    When user try to login without entering "<username>" or "<password>"
    Then user should see Please fill out this field error message

    Examples:
      | username      | password |
      | hr1@cydeo.com |          |
      |               | UserUser |
      |               |          |



  Scenario: Verify remember me link on the login page
    Then user should be able to located and click on the Remember me on this computer checkbox in the login page



  Scenario: Verify password input is in bullet signs by default
    Then user should see password input in bullet signs by default