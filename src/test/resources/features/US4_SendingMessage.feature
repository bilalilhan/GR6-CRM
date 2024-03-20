
 @wip
Feature: Sending Messages via the Message Tab in the Activity Stream

  As a user,
  I should be able to send messages by clicking on the Message tab in the Activity Stream.

  Scenario: Sending a message with mandatory fields filled
    Given user is on the Activity Stream page
    When user clicks on the Message tab
    And user fills the message content as a mandatory field
    And user clicks on the Send button
    Then the message should be sent successfully

  Scenario: Error messages for mandatory fields
    Given user is on the Activity Stream page
    When user clicks on the Message tab
    When user tries to send a message without filling in the mandatory fields
    Then user should see error messages for mandatory fields

  Scenario: Verifying default message delivery to 'All employees'
    Given user is on the Activity Stream page
    When user clicks on the Message tab
    Then the message delivery should be set to 'All employees' by default

  Scenario: Canceling message sending
    Given user is on the Activity Stream page
    When user clicks on the Message tab
    Then user clicks on the cancel button
    Then the message composition should be canceled


