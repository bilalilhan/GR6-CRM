#@EmployeesCompanyStructure @Regression
Feature: Users should be able to access Company Page

  User Story: As a user, I should be able to use functions on Company Structure under Employee menu
  Acceptance Criteria:
  1.Verify that the Company Structure is visible for all users
  2.Verify that the HR user can add a department from the Company Structure
  3.Verify that the "ADD DEPARTMENT" button is not displayed for Helpdesk and Marketing users

#  @All_Users //
  @ScenarioOutline
  Scenario Outline: All users should be able to see Company Structure tab
    Given User is on CRM application Login page
    When User login to application with username <username> and password <password>
    When  User clicks on Employees menu
    Then Verify the Title of the page
    And Verify if User is able to see the Company Structure under Employees page
    Examples:
      | username               | password |
      | hr1@cydeo.com          | UserUser |
      | hr25@cydeo.com         | UserUser |
      | hr75@cydeo.com         | UserUser |
      | hr100@cydeo.com        | UserUser |
      | helpdesk1@cydeo.com    | UserUser |
      | helpdesk50@cydeo.com   | UserUser |
      | helpdesk100@cydeo.com  | UserUser |
      | marketing1@cydeo.com   | UserUser |
      | marketing50@cydeo.com  | UserUser |
      | marketing100@cydeo.com | UserUser |

#@HR_User
  @ScenarioOutline
  Scenario Outline:HR user should be able to add a department from Company Structure
    Given User is on CRM application Login page
    When User login to application with username <username> and password <password>
    When  User clicks on Employees menu
    Then Verify the Title of the page
    Then Verify if User is able to see the Company Structure under Employees page
    And HR User clicks on ADD DEPARTMENT
    And HR User fills the Add Department form
    Examples:
      | username        | password |
      | hr1@cydeo.com   | UserUser |
      | hr25@cydeo.com  | UserUser |
      | hr75@cydeo.com  | UserUser |
      | hr100@cydeo.com | UserUser |


#@Helpdesk_And_Marketing_Users
  @ScenarioOutline
  Scenario Outline:User should not be seeing ADD DEPARTMENT button from Company Structure
    Given User is on CRM application Login page
    When User login to application with username <username> and password <password>
    When  User clicks on Employees menu
    Then Verify the Title of the page
    Then Verify if User is able to see the Company Structure and should not see ADD Department button
    Examples:
      | username               | password |
      | helpdesk1@cydeo.com    | UserUser |
      | helpdesk50@cydeo.com   | UserUser |
      | helpdesk100@cydeo.com  | UserUser |
      | marketing1@cydeo.com   | UserUser |
      | marketing50@cydeo.com  | UserUser |
      | marketing100@cydeo.com | UserUser |


