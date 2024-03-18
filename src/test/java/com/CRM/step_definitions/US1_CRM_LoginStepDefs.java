package com.CRM.step_definitions;

import com.CRM.pages.CRM_LoginPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_CRM_LoginStepDefs {


    CRM_LoginPage loginPage = new CRM_LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user enters HR user credentials")
    public void user_enters_hr_user_credentials() {
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("hr_username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("hr_password"));

        loginPage.loginButton.click();
    }

    @Then("user should be able to log in and land on the HR home page")
    public void user_should_be_able_to_log_in_and_land_on_the_hr_home_page() {
        BrowserUtils.verifyTitleContains("Portal");
    }






    @When("user enters Marketing user credentials")
    public void user_enters_marketing_user_credentials() {

        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("marketing_username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("marketing_password"));
        loginPage.loginButton.click();
    }

    @Then("user should be able to log in and land on the Marketing home page")
    public void user_should_be_able_to_log_in_and_land_on_the_marketing_home_page() {
        BrowserUtils.verifyTitleContains("Portal");
    }




    @When("user enters Helpdesk user credentials")
    public void user_enters_helpdesk_user_credentials() {

        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("helpdesk_username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("helpdesk_password"));
        loginPage.loginButton.click();

    }

    @Then("user should be able to log in and land on the Helpdisk home page")
    public void user_should_be_able_to_log_in_and_land_on_the_helpdisk_home_page() {
        BrowserUtils.verifyTitleContains("Calendar");
    }


    }

