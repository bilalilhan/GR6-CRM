
Feature: Activity stream page functionality
  Agile story: As user, I should be able to see all the options on the Activity stream page

  Scenario Outline: : Activity stream page
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


    