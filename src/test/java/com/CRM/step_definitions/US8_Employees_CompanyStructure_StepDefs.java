package com.CRM.step_definitions;

import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US8_Employees_CompanyStructure_StepDefs {

    @Given("User is on home page of CRM application")
    public void user_is_on_home_page_of_crm_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on home page");
        System.out.println("get block from Mojib's Login");
    }

    @When("User clicks on Employees menu")
    public void user_clicks_on_employees_menu() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User clicked Employees menu");
    }

    @Then("User should be able to see the Company Structure tab")
    public void user_should_be_able_to_see_the_company_structure_tab() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User should see the Company Structure tab");
    }

    @Then("User clicks on ADD DEPARTMENT")
    public void user_clicks_on_add_department() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("HR User clicks on ADD DEPARTMENT and adds a department");
    }

    @Then("User should not be seeing ADD DEPARTMENT button from Company Structure")
    public void user_should_not_be_seeing_add_department_button_from_company_structure() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User should not be seeing ADD DEPARTMENT button");
    }

    @Given("HR User is on home page of CRM application")
    public void hr_User_Is_On_HomePage_Of_CRM_Application() {

        System.out.println("HR user is on home page");

    }

    @Given("Helpdesk User is on home page of CRM application")
    public void helpdesk_User_Is_On_HomePage_Of_CRM_Application() {
        System.out.println("Helpdesk user is on home page");
    }

    @Given("Marketing User is on home page of CRM application")
    public void marketing_User_Is_On_HomePage_Of_CRM_Application() {
        System.out.println("Marketing user is on home page");
    }
}
