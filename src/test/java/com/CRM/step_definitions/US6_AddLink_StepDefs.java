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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.lang.module.Configuration;
import java.util.Set;

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
        BrowserUtils.sleep(3);
    }

    @Then("Verify Link window is displayed")
    public void verify_link_window_is_displayed() {
        addLinkInMessage.linkInputWindowPops.isDisplayed();
        BrowserUtils.sleep(3);
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

    @Then("user click SEND button")
    public void userClickSENDButton() {
        addLinkInMessage.sendBtn.click();
    }


    @When("user click on the {string} link")
    public void user_click_on_the_link(String link) {
        addLinkInMessage.linkTextInActivityStream.sendKeys(link+Keys.ENTER);
        BrowserUtils.sleep(5);
    }

    @Then("user should be navigated to the expected URL")
    public void user_should_be_navigated_to_the_expected_url() {

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String windowHandle : windowHandles) {
            Driver.getDriver().switchTo().window(windowHandle);
        }

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.tesla.com/";


        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Then("Verify link is opening in a new tab")
    public void verifyLinkIsOpeningInANewTab() {

        String currentWindowHandle = Driver.getDriver().getWindowHandle();

        Set<String> allWindows = Driver.getDriver().getWindowHandles();

        allWindows.remove(currentWindowHandle);

        Assert.assertEquals("The link is not opening in a new tab.", 1, allWindows.size());

        String newTabHandle = (String) allWindows.toArray()[0];
        Driver.getDriver().switchTo().window(newTabHandle);

    }

}
