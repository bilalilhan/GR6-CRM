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



    @FindBy(xpath = "//table//tr[1]/td[4]//span[@class='insert-btn-text']")
    public WebElement uploadPdfFile;
    @FindBy(xpath = "//table//tr[2]/td[4]//span[@class='insert-btn-text']")
    public WebElement uploadTextFile;
    @FindBy(xpath = "//table//tr[3]/td[4]//span[@class='insert-btn-text']")
    public WebElement uploadImgJpg;
    @FindBy(xpath = "//table//tr[4]/td[4]//span[@class='insert-btn-text']")
    public WebElement uploadImgPng;
    @FindBy(xpath = "//table//tr[5]/td[4]//span[@class='insert-btn-text']")
    public WebElement uploadWordFile;




    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement RemovePdfFile;


    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement RemoveTextFile;


    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement RemoveImgJpg;


    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement RemoveImgPng;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement RemoveWordFile;



}

