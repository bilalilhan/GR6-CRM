Feature: My Profile Page
  As a user
  I want to verify the options and email under the General tab

  Scenario: View Options on My Profile Page
    Given I am on the My Profile page
    Then I should see the options General, Drive, Tasks, Calendar, Conversations

  Scenario: Verify Email under General Tab
    Given I am on the My Profile page
    When I navigate to the General tab
    Then I should see my account email