@B32G6-195 @CRM
Feature: Activity stream page functionality
  Agile story: As user, I should be able to see all the options on the Activity stream page
  @B32G6-196@CRM
  Scenario Outline: : Activity stream page
    When user enters HR user credentials
    Then user should be able to log in and land on the HR home page
    Given user should be able to see all the options on the Activity stream page
    When user sees "<Expected>" is in the page module
    Then user clicks to the more button
    And user sees the following "<options>" under the More tab
    Examples:
    |Expected|
    |Message |
    |Task |
    |Event |
    |Poll |
    |More |

    Examples:
      |options|
      |File |
      |Appreciation |
      |Announcement |
      |Workflow |



    