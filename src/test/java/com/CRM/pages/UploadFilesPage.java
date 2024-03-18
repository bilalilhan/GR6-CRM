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
    public WebElement Message;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement UploadFiles;

    @FindBy(xpath = "//*[@id=\"disk-edit-attachn1223\"]/td[1]/span[1]")  // Fixed XPath
    public WebElement AttachedFilesAndImages;

}

