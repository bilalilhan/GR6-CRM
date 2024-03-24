package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddLinkInMessage {

    public AddLinkInMessage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Message']")
    public WebElement message;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement link;

    @FindBy(xpath = "//span[@class='bx-core-adm-dialog-head-inner']")
    public WebElement linkInputWindowPops;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement inputText;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement inputURL;

    @FindBy(xpath = "//input[@value ='Save']")
    public WebElement saveBtn;


    @FindBy(linkText = "Tesla")
    public WebElement linkAttachedToText;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(linkText = "Tesla")
    public WebElement linkTextInActivityStream;




}
