package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendingMessagePage {

    public SendingMessagePage (){

        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = " //span[@id='feed-add-post-form-tab-message']")
    public WebElement messageButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")  //inside of iframe
    public WebElement messageAreaIframe;

    @FindBy(tagName = "body")     // still inside of iframe
    public WebElement textMessageArea;

    @FindBy(id = "blog-submit-button-save")  // outside iframe //?
    public WebElement sendButton ;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[text()='All employees']")
    public WebElement allEmployeesText;


    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement allEmplyeesXbutton;


    @FindBy(xpath ="//span[@class='feed-add-info-text']")//?
    public WebElement errorMessageText;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement messageDisplayedArea;

}

