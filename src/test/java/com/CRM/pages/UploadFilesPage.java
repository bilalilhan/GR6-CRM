package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilesPage {

    public UploadFilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement clickMassageTab;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement clickUploadFile;


    @FindBy(xpath = "//div[@class='diskuf-uploader']//span[1]")
    public WebElement uploadFileAndImage;

    @FindBy(xpath = "//span[@class='f-wrap']")
    public WebElement FileOrImage;

    @FindBy(id = "check-in-text-n1473")
    public WebElement InsertInText;

    @FindBy(xpath = "//*[@id=\"disk-edit-attachn1462\"]/td[5]/span")
    public WebElement RemoveFile;


}

