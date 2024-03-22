package com.CRM.pages;

import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_LoginPage {


    public CRM_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errorMessage;


    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeCheckBox;





    /**
     *This is a login method.
     * this method helps to make send keys more dynamic for username and password input
     *
     */

    public void login(String username, String password){

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }




    /**
     *This is a login method.
     * By calling this method you can log in to CRM application automatically
     *
     */

    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        usernameInput.sendKeys(ConfigurationReader.getProperty("hr_username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("hr_password"));
        loginButton.click();
    }
}
