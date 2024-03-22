package com.CRM.step_definitions;

import com.CRM.pages.CRM_MainPage;
import com.CRM.pages.SendingMessagePage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US4_SendingMessage_StepDefs {
    CRM_MainPage crm_mainPage = new CRM_MainPage();

    @Given("user is on the Activity Stream page")
    public void user_is_on_the_activity_stream_page() {


        crm_mainPage.crmMainPage_hr();
        // crm_mainPage.crmMainPage_helpDesk();
        //crm_mainPage.crmMainPage_marketing();
    }

    SendingMessagePage messagePage = new SendingMessagePage();

    @When("user clicks on the Message tab")
    public void user_clicks_on_the_message_tab() {
        messagePage.messageButton.click();
    }

    @And("user fills the message content as a mandatory field {string}")
    public void userFillsTheMessageContentAsAMandatoryField(String testMessage) {
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().frame(messagePage.messageAreaIframe);
        messagePage.textMessageArea.sendKeys(testMessage);
    }

    @When("user clicks on the Send button")
    public void user_clicks_on_the_send_button() {
        Driver.getDriver().switchTo().defaultContent();
        messagePage.sendButton.click();

    }

    @Then("the message should be sent successfully and displayed {string}")
    public void theMessageShouldBeSentSuccessfullyAndDisplayed(String expectedText) {
        BrowserUtils.sleep(3);

        String actualText = messagePage.messageDisplayedArea.getText();
        Assert.assertEquals(actualText, expectedText);
    }


    @When("user tries to send a message without filling in the mandatory fields")
    public void userTriesToSendAMessageWithoutFillingInTheMandatoryFields() {
        messagePage.messageButton.click();

        Driver.getDriver().switchTo().frame(messagePage.messageAreaIframe);

        messagePage.textMessageArea.clear();

        Driver.getDriver().switchTo().defaultContent();
        messagePage.sendButton.click();
    }

    @When("user tries to send a message without choosing any recipients")
    public void userTriesToSendAMessageWithoutChoosingAnyRecipients() {

        messagePage.messageButton.click();
        messagePage.allEmplyeesXbutton.click();
        messagePage.sendButton.click();
    }


    @Then("user should see error messages {string}")
    public void userShouldSeeErrorMessages(String expectedErrorMessage) {
        String actualErrorMessage = messagePage.errorMessageText.getText();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);


    }


    @Then("the message delivery should be set to {string} by default")
    public void theMessageDeliveryShouldBeSetToAllEmployeesByDefault(String defaultDeliveryTo) {
        BrowserUtils.sleep(2);
        String actualDeliveryTo = messagePage.allEmployeesText.getText();
        Assert.assertEquals(actualDeliveryTo, defaultDeliveryTo);

    }


    @Then("user clicks on the cancel button")
    public void userClicksOnTheCancelButton() {

        messagePage.cancelButton.click();
    }

    @Then("the message composition should be canceled")
    public void theMessageCompositionShouldBeCanceled() {

        BrowserUtils.sleep(3);

        Assert.assertFalse(messagePage.sendButton.isDisplayed());
    }


}
