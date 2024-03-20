package com.CRM.step_definitions;

import com.CRM.pages.CRM_MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US4_SendingMessage_StepDefs {
     CRM_MainPage crm_mainPage = new CRM_MainPage();
    @Given("user is on the Activity Stream page")
    public void user_is_on_the_activity_stream_page() {
       crm_mainPage.crmMainPage_hr();
      // crm_mainPage.crmMainPage_helpDesk();
      // crm_mainPage.crmMainPage_marketing();
    }
    @When("user clicks on the Message tab")
    public void user_clicks_on_the_message_tab() {

    }
    @When("user fills the message content as a mandatory field")
    public void user_fills_the_message_content_as_a_mandatory_field() {

    }
    @When("user clicks on the Send button")
    public void user_clicks_on_the_send_button() {

    }
    @Then("the message should be sent successfully")
    public void the_message_should_be_sent_successfully() {

    }

    @When("user tries to send a message without filling in the mandatory fields")
    public void userTriesToSendAMessageWithoutFillingInTheMandatoryFields() {
    }

    @Then("user should see error messages for mandatory fields")
    public void userShouldSeeErrorMessagesForMandatoryFields() {
    }

    @Then("the message delivery should be set to {string} by default")
    public void theMessageDeliveryShouldBeSetToAllEmployeesByDefault() {
    }

    @Then("user clicks on the cancel button")
    public void userClicksOnTheCancelButton() {
    }

    @Then("the message composition should be canceled")
    public void theMessageCompositionShouldBeCanceled() {
    }
}
