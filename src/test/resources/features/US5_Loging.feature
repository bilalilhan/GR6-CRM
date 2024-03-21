@B32G6-181
Feature: Default

	
	@B32G6-178
	Scenario: The user must be able to insert files and images into the text.
		Given to the text insertion button, by clicking on this button, the text or photo should be inserted in the message tab.
		       And by typing the text of the photo in the message tab and clicking the insert button in the file text, it should be inserted in the message tab.	

	
	@B32G6-179
	Scenario: Verify that the user can upload files and pictures.
		Given user's click on the file upload in the message form
		    When the user clicks on the message tab.
		    When user clicks on the upload file button.
		    Then the user should be able to click on the upload file and image button and upload the file or photo with formats .pdf, .txt, .jpeg, .png, .docx	

	
	@B32G6-180
	Scenario: The user should be able to delete files and images at any time before posting.
		Given to the insert button in the text, after uploading the file or photo, you need to delete it by right clicking on delete.