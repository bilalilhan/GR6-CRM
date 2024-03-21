package com.CRM.step_definitions;

import com.CRM.pages.CRM_LoginPage;
import com.CRM.pages.UploadFilesPage;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;


public class US5_UploadStepDefs {
    UploadFilesPage uploadFilesPage = new UploadFilesPage();
    CRM_LoginPage crmLoginPage = new CRM_LoginPage();
    @Given("User is on CRM {int} home page")
    public void userIsOnCRMHomePage() {
        Driver.getDriver().get( "https://qa.agileprocrm.com" );
        crmLoginPage.usernameInput.sendKeys( ConfigurationReader.getProperty( "hr_username" ) );
        crmLoginPage.passwordInput.sendKeys( ConfigurationReader.getProperty( "hr_password" ) );
        crmLoginPage.loginButton.click();
    }

    @When("User must be {string} Massage Tab")
    public void userMustBeMassageTab() {
        uploadFilesPage.clickMassageTab.click();
    }

    @Given("User's click on the file upload in the message form")
    public void userSClickOnTheFileUploadInTheMessageForm() {
        WebElement uploadButton = uploadFilesPage.clickUploadFile; // Assuming getUploadButton() returns the WebElement representing the upload button
        uploadButton.sendKeys( "C:\\Users\\Lenovo\\Desktop\\avatar-blank.jpg" ); // Replace the path with the actual file path

    }

    @When("User must be click on the {string} button.")
    public void userMustBeClickOnTheButton() {
        uploadFilesPage.DownloadFromExternalDrive.click();
    }

    @And("User must be on the  {string}.")
    public void userMustBeOnThe() {
        uploadFilesPage.InsertInText.click();
    }

    @Given("User must be {string} files and images before sending.")
    public void userMustBeFilesAndImagesBeforeSending() {
        uploadFilesPage.RemoveFile.click();
    }


}