package com.CRM.step_definitions;

import com.CRM.pages.CRM_LoginPage;
import com.CRM.pages.UploadFilesPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
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

    }


    @When("User must be click on the {string} button.")
    public void user_must_be_click_on_the_button(String imagePath) {
        uploadFilesPage.clickUploadFile.click();

    }
    @And("User must be on the  {string} .pdf, .txt, .jpeg, .png, .docx.")
    public void userMustBeOnThePdfTxtJpegPngDocx(String arg0) {
        WebElement btn_uploadedFileJPG = Driver.getDriver().findElement( By.cssSelector( "input[type='file']" ) );
        String projectPath = System.getProperty("user.dir");
        String filePathJPG = "src/test/resources/files/TestJpeg.jpg";
        String fullPathJPG = projectPath + "/" + filePathJPG;
        btn_uploadedFileJPG.sendKeys(fullPathJPG);

        WebElement btn_uploadedFilePNG = Driver.getDriver().findElement( By.cssSelector( "input[type='file']" ) );
        String projectPathPNG = System.getProperty("user.dir");
        String filePathPNG = "src/test/resources/files/TestPng.png";
        String fullPathPNG = projectPathPNG + "/" + filePathPNG;
        btn_uploadedFilePNG.sendKeys(fullPathPNG);

        WebElement btn_uploadedFilePDF = Driver.getDriver().findElement( By.cssSelector( "input[type='file']" ) );
        String projectPathPDF = System.getProperty("user.dir");
        String filePathPDF = "src/test/resources/files/TestPdf.pdf";
        String fullPathPDF = projectPathPDF + "/" + filePathPDF;
        btn_uploadedFilePDF.sendKeys(fullPathPDF);

        WebElement btn_uploadedFileDOCX = Driver.getDriver().findElement( By.cssSelector( "input[type='file']" ) );
        String projectPathDOCX = System.getProperty("user.dir");
        String filePathDOCX = "src/test/resources/files/TestDocx.docx";
        String fullPathDOCX = projectPathDOCX + "/" + filePathDOCX;
        btn_uploadedFileDOCX.sendKeys(fullPathDOCX);

        uploadFilesPage.InsertInText.click();
        uploadFilesPage.InsertInText.click();
        uploadFilesPage.InsertInText.click();
        uploadFilesPage.InsertInText.click();

        BrowserUtils.sleep( 3 );
    }

    @Given("User must be {string} files and images before sending.")
    public void user_must_be_files_and_images_before_sending(String RemoveFile) {


        Driver.getDriver().get( "https://qa.agileprocrm.com" );
        crmLoginPage.usernameInput.sendKeys( ConfigurationReader.getProperty( "marketing_username" ) );
        crmLoginPage.passwordInput.sendKeys( ConfigurationReader.getProperty( "marketing_password" ) );
        crmLoginPage.loginButton.click();
        uploadFilesPage.clickMassageTab.click();
        uploadFilesPage.clickUploadFile.click();


        WebElement btn_uploadedFileJPG = Driver.getDriver().findElement( By.cssSelector( "input[type='file']" ) );
        String projectPath = System.getProperty("user.dir");
        String filePathJPG = "src/test/resources/files/TestJpeg.jpg";
        String fullPathJPG = projectPath + "/" + filePathJPG;
        btn_uploadedFileJPG.sendKeys(fullPathJPG);

        uploadFilesPage.InsertInText.click();
        uploadFilesPage.RemoveFile.click();

    }

}