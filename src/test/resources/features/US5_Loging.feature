@upload
Feature: Bing search functionality
  Agile story: As a user, I should be able to upload files and pictures as messages
  Supported file formats are: .pdf, .txt, .jpeg, .png, .docx
  Background: For all scenarios, the user is on the message page CRM 24

  @wip
  Scenario: Verifying the title of the search result
  The desired user is on the message page of CRM 24
    When the user clicks on upload file on the message form
    And  when the user uploads the file
    And  when he enters the text of the file or images into the message form.
    Then the user should see the text and file or photo in the message by clicking on In text
    Then the user should be able to delete it by clicking on the photo and file
