package com.CRM.step_definitions;

import com.CRM.pages.AddLinkInMessage;
import com.CRM.pages.CRM_LoginPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.lang.module.Configuration;

public class US6_AddLink_StepDefs {


    CRM_LoginPage crmLoginPage = new CRM_LoginPage();
    AddLinkInMessage addLinkInMessage = new AddLinkInMessage();

    @Given("User is on Customer Relationship Management application Login page")
    public void user_is_on_crm_application_login_page() {
      Driver.getDriver().get("https://qa.agileprocrm.com");
        crmLoginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("hr_username"));
        crmLoginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("hr_password"));
        crmLoginPage.loginButton.click();
    }


    @When("User click on message tab")
    public void user_click_on_message_tab() {
        addLinkInMessage.message.click();
        BrowserUtils.sleep(3);
    }

    @Then("Verify Link button displayed")
    public void verify_link_button_displayed() {
        addLinkInMessage.link.isDisplayed();
    }

    @Then("User click on Link button")
    public void user_click_on_link_button() {
        addLinkInMessage.link.click();
    }

    @Then("Verify Link window is displayed")
    public void verify_link_window_is_displayed() {
        addLinkInMessage.linkInputWindowPops.isDisplayed();
    }


    @And("User enter {string}")
    public void userEnter(String userTextInput) {
        addLinkInMessage.inputText.sendKeys(userTextInput);
    }


    @And("User also enter {string}")
    public void userAlsoEnter(String userInputURL) {
        addLinkInMessage.inputURL.sendKeys(userInputURL);
    }


    @Then("User click Save")
    public void user_click_save() {
        addLinkInMessage.saveBtn.click();

    }

    @And("Verify link attached to given text")
    public void verifyLinkAttachedToGivenText() {

        String actualLinkText = addLinkInMessage.linkAttachedToText.getText();
        String expected = "Tesla";

        Assert.assertEquals(actualLinkText, expected);
    }
}
