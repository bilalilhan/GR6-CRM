
Feature: Users should be able to access the Employees page.

  User Story: As a user, I should be able to access the Employees page.
  Acceptance Criteria:
  1. Verify that the user views the following 8 modules in the Employees page.
  Company Structure
  Find Employee
  Telephone Directory
  Staff Changes
  Efficiency Report
  Honored Employees
  Birthdays
  New page
  2. Verify that the user views the Company Structure as default by clicking the Employees Module.
  @wip01
  
Scenario:
    Given User is on CRM application Login page
    Then user enters Helpdesk user credentials
    When User click on Employees menu
    Then User should have access to Employees page
    And User should be able to see eight "<modules>" on Employees page Company Structure


      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |


  Scenario: User should see the Company Structure as default by clicking the Employees Module.
    When  User click on Employees menu
    Then user sees Company Structure as default
