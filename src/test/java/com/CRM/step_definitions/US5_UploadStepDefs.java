package com.CRM.step_definitions;

import com.CRM.pages.CRM_LoginPage;
import com.CRM.pages.UploadFilesPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class US5_UploadStepDefs {
    UploadFilesPage uploadFilesPage = new UploadFilesPage();
    CRM_LoginPage crmLoginPage = new CRM_LoginPage();

    @Given("User is on CRM {int} home page")
    public void user_is_on_crm_home_page(Integer int1) {
        Driver.getDriver().get( "https://qa.agileprocrm.com" );
        crmLoginPage.usernameInput.sendKeys( ConfigurationReader.getProperty( "marketing_username" ) );
        crmLoginPage.passwordInput.sendKeys( ConfigurationReader.getProperty( "marketing_password" ) );
        crmLoginPage.loginButton.click();
    }

    @When("User must be {string} Massage Tab")
    public void user_must_be_massage_tab(String string) {
        uploadFilesPage.clickMassageTab.click();
    }

    @Given("User's click on the file upload in the message form")
    public void user_s_click_on_the_file_upload_in_the_message_form() {
        Driver.getDriver().get( "https://qa.agileprocrm.com" );
        crmLoginPage.usernameInput.sendKeys( ConfigurationReader.getProperty( "marketing_username" ) );
        crmLoginPage.passwordInput.sendKeys( ConfigurationReader.getProperty( "marketing_password" ) );
        crmLoginPage.loginButton.click();
        uploadFilesPage.clickMassageTab.click();
        BrowserUtils.sleep(1);
        uploadFilesPage.clickUploadFile.click();


    }
    @When("User must be click on the {string} button.")
    public void user_must_be_click_on_the_button(String string) {
        uploadFilesPage.uploadFileAndImage.click();
        uploadFilesPage.FileOrImage.findElement( By.linkText( "C:\\Users\\Lenovo\\Desktop\\avatar-blank.jpg" ) );

    }
    @When("User must be on the  {string}.")
    public void user_must_be_on_the(String string) {

    }


    @Given("User must be {string} files and images before sending.")
    public void user_must_be_files_and_images_before_sending(String string) {

    }
}