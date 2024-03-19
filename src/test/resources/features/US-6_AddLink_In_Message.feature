Feature:Add link in message functionality
  Agile story:As a user,I should be able to add link in message.


  Scenario: User can attach a link to the specified text
    Given User is on CRM application Login page
    When User click on message tab
    Then Verify Link button displayed
    Then User click on Link button
    And Verify Link window is displayed
    And User enter Link text and Link URl
    Then User click Save
