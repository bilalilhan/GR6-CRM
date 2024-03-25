package com.CRM.step_definitions;

import com.CRM.pages.AccessEmployeesPage;
import com.CRM.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US7_AccessTheEmployeesPageStepDefs {


   AccessEmployeesPage accessEmployeesPage = new AccessEmployeesPage();


    @When("User click on Employees menu")
    public void userClickOnEmployeesMenu() {

    accessEmployeesPage.employeesButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("User should have access to Employees page")
    public void userShouldHaveAccessToEmployeesPage() {

     Assert.assertTrue(accessEmployeesPage.companyStructure.isDisplayed());
     BrowserUtils.sleep(3);
    }


@And("User should be able to see eight {string} on Employees page Company Structure")
 public void userShouldBeAbleToSeeEightOnEmployeesPageCompanyStructure(List<String> expectedModules) {

  List<String> actualModules = BrowserUtils.getElementsText(accessEmployeesPage.employeeModules);



 }

 @Then("user sees Company Structure as default")
 public void userSeesCompanyStructureAsDefault() {
     String expectedPageTitle = "Company Structure";
  String actualPageTitle = accessEmployeesPage.companyStructure.getText();
  Assert.assertEquals(expectedPageTitle, actualPageTitle);
 }
}


