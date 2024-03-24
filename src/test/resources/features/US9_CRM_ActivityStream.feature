
Feature:  As a user, I should be able to see all the options on the Activity stream page

@B32G6-195
  Scenario Outline: Verify that<userType> views the following options on the Activity Stream page.
    When user logs in as "<userType>"
    Then user should be able to see"<Expected>" the following options on the Activity Stream page
    Examples:
      | Expected |
      | MESSAGE  |
      | TASK     |
      | EVENT    |
      | POLL     |
      | MORE     |

  @B32G6-196
  Scenario Outline: Verify that<userType> views the following 4 options under the MORE tab
    When user logs in as "<userType>"
    And user is on the Activity Stream page
    And user clicks "<More>" in activity stream
    Then user should be able to see the following options under more tab on the Activity Stream page
    Examples:
      | More         |
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |



    