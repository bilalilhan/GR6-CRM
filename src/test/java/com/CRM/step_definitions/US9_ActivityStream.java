package com.CRM.step_definitions;


import com.CRM.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US9_ActivityStream {
    US9_ActivityStream activityStream = new US9_ActivityStream();
    @Given("user should be able to see all the options on the Activity stream page")
    public void user_should_be_able_to_see_all_the_options_on_the_activity_stream_page() {
     System.out.println("Activity stream page");
    }
    @When("user sees {string} is in the page module")
    public void user_sees_is_in_the_page_module(String expected) {
        BrowserUtils.verifyTitleContains(expected);

    }
    @Then("user clicks to the more button")
    public void user_clicks_to_the_more_button() {
        activityStream.user_clicks_to_the_more_button();
    }
    @Then("user sees the following {string} under the More tab")
    public void user_sees_the_following_under_the_more_tab(String following) {
        BrowserUtils.verifyTitle(following +" under the More tab");

    }

}


