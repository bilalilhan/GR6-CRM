@B32G6-181
Feature: Default

	
	@B32G6-178
	Scenario: The user must be able to insert files and images into the text.
		Given User is on CRM 24 home page
			When User must be "click" Massage Tab	

	
	@B32G6-179
	Scenario: Verify that the user can upload files and pictures.
		Given User's click on the file upload in the message form
				    When User must be click on the "upload file" button.
				    And User must be on the  "Upload File and image".	

	
	@B32G6-180
	Scenario: The user should be able to delete files and images at any time before posting.
		Given User must be "remove" files and images before sending.