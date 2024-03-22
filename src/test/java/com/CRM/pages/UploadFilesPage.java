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


    @FindBy(xpath = "//div[@class='diskuf-uploader'][1]")
    public WebElement uploadFileAndImage;

    @FindBy(id = "diskuf-docn1242")
    public WebElement FileOrImage;

    @FindBy(xpath = "//span[@class='insert-btn-text']")
    public WebElement InsertInText;


    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement RemoveFile;



}

