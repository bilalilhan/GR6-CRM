#@EmployeesCompanyStructure @Regression
Feature: Users should be able to access Company Page

  User Story: As a user, I should be able to use functions on Company Structure under Employee menu
  Acceptance Criteria:
      1.Verify that the Company Structure is visible for all users
      2.Verify that the HR user can add a department from the Company Structure
      3.Verify that the "ADD DEPARTMENT" button is not displayed for Helpdesk and Marketing users

#  @All_Users_Login
  Scenario: All users should be able to see Company Structure tab under Employee menu
    Given User is on home page of CRM application
    When  User clicks on Employees menu
    Then User should be able to see the Company Structure tab
    #For this step I can use "Scenario Outline" concept as Data Driven Testing

#  @HR_Login
  Scenario: HR user should be able to add a department from Company Structure
    Given HR User is on home page of CRM application
    When  User clicks on Employees menu
    Then User should be able to see the Company Structure tab
    And User clicks on ADD DEPARTMENT
    #TO DO- still need to write filling the form steps

#  @Helpdesk_Login
  Scenario: Helpdesk user should not be seeing ADD DEPARTMENT button from Company Structure
    Given Helpdesk User is on home page of CRM application
    When  User clicks on Employees menu
    Then User should not be seeing ADD DEPARTMENT button from Company Structure

#  @Marketing_Login
  Scenario: Marketing user should not be seeing ADD DEPARTMENT button from Company Structure
    Given Marketing User is on home page of CRM application
    When  User clicks on Employees menu
    Then User should not be seeing ADD DEPARTMENT button from Company Structure
    #I can wright the above and this step as one Scenario and use "Scenario Outline" concept as Data Driven Testing
