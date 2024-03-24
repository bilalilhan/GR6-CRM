package com.CRM.step_definitions;

import com.CRM.pages.CRM_LoginPage;
import com.CRM.pages.LoginPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

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
        BrowserUtils.verifyTitleContains("Portal");
    }






    @When("user try to login with incorrect {string} and {string}")
    public void user_try_to_login_with_incorrect_and(String username, String password) {

        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();
    }

    @Then("user should see Incorrect login or password message")
    public void user_should_see_incorrect_login_or_password_message() {


        Assert.assertTrue(loginPage.errorMessage.isDisplayed());

    }



    @When("user try to login without entering {string} or {string}")
    public void user_try_to_login_without_entering_or(String username, String password) {

        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();
    }
    @Then("user should see Please fill out this field error message")
    public void user_should_see_please_fill_out_this_field_error_message() {
        Assert.fail();
    }


    @Then("user should be able to located and click on the Remember me on this computer checkbox in the login page")
    public void user_should_be_able_to_located_and_click_on_the_remember_me_on_this_computer_checkbox_in_the_login_page() {

      Assert.assertTrue(loginPage.rememberMeCheckBox.isDisplayed());

      //Assert.assertTrue(loginPage.rememberMeCheckBox.isEnabled());


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(loginPage.rememberMeCheckBox));
        checkBox.click();
    }



    @Then("user should see password input in bullet signs by default")
    public void user_should_see_password_input_in_bullet_signs_by_default() {

        if (Objects.equals(loginPage.passwordInput.getAttribute("type"), "password")){
            Assert.assertTrue(true);
        }else {
            Assert.fail();
        }


    }


}

