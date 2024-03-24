package com.CRM.pages;

import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class CRM_MainPage {

    public CRM_MainPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

      CRM_LoginPage crmLoginPage = new CRM_LoginPage();

    public void crmMainPage_hr(){

        this.crmLoginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("hr_username"));

        this.crmLoginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("hr_password"));

        this.crmLoginPage.loginButton.click();

    }


    public void crmMainPage_helpDesk(){

        this.crmLoginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("helpdesk_username"));

        this.crmLoginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("helpdesk_password"));

        this.crmLoginPage.loginButton.click();

    }

    public void crmMainPage_marketing(){

        this.crmLoginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("marketing_username"));

        this.crmLoginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("marketing_password"));

        this.crmLoginPage.loginButton.click();

    }

    //With these methods, you do NOT need to call Driver.get() -->(it is instantiated in Hook clas, under @Before annotation), instead of this: you just need to instantiate an object with calling CRM_MainPage class. You can login as an hr, a helpdesk ,or a marketing user.
    /**
     * This is an example with my US4_SendingMessage_StepDefs
     *
     *
     *  CRM_MainPage crm_mainPage = new CRM_MainPage();
     *
     *    @Given("user is on the Activity Stream page")
     *     public void user_is_on_the_activity_stream_page() {
     *
     *       crm_mainPage.crmMainPage_hr();
     *       // crm_mainPage.crmMainPage_helpDesk();
     *       // crm_mainPage.crmMainPage_marketing();
     *
     *     }
     */



}
