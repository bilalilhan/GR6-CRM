package com.CRM.step_definitions;

import com.CRM.pages.ActivityStreamPage;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US9_ActivityStreamStepDef {
    ActivityStreamPage page = new ActivityStreamPage();

    @When("user logs in as {string}")
    public void user_logs_in_as(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }

    @Then("user should be able to see{string} the following options on the Activity Stream page")
    public void userShouldBeAbleToSeeTheFollowingOptionsOnTheActivityStreamPage(List<String> expectedOptions) {
        List<String> actualOptions = new ArrayList<>();
        for (WebElement eachOptions : page.Options) {
            actualOptions.add(eachOptions.getText());
        }
        Assert.assertEquals(expectedOptions, actualOptions);

    }

    @And("user clicks {string} in activity stream")
    public void userClicksInActivityStream(String activity) {
        ActivityStreamPage.selectMore(activity);
    }

    @Then("user should be able to see the following options under more tab on the Activity Stream page")
    public void user_should_be_able_to_see_the_following_options_under_more_tab_on_the_activity_stream_page(List<String> expectedMore) {
        List<String> actualMore = new ArrayList<>();
        for (WebElement eachOptions : page.More) {
            actualMore.add(eachOptions.getText());
        }
        Assert.assertEquals(expectedMore, actualMore);


    }
}




