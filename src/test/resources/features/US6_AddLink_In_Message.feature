@B32G6-183
Feature: Add link in message
  Agile story: As a user, I should be able to add link in message.

  @B32G6-182 @CRM
  Scenario:  Verify that the user can attach a link to the specified text.
    Given User is on Customer Relationship Management application Login page
    When User click on message tab
    Then Verify Link button displayed
    Then User click on Link button
    And Verify Link window is displayed
    And User enter "Tesla"
    Then User also enter "tesla.com"
    Then User click Save
    And Verify link attached to given text
    ##add line below to jira tc scenario
    Then user click SEND button

  @B32G6-199
  Scenario: Verify that by clicking on the link the user can navigate to the correct URL
    ##locate to activity stream first
    Given user is on the Activity Stream page
    When user click on the "Link Text" link
    Then user should be navigated to the expected URL