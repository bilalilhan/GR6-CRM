package com.CRM.step_definitions;

import com.CRM.pages.CRM_LoginPage;
import com.CRM.pages.EmployeesPage;
import com.CRM.utilities.BrowserUtils;
import com.CRM.utilities.ConfigurationReader;
import com.CRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class US8_Employees_CompanyStructure_StepDefs extends BrowserUtils {

    EmployeesPage empPage= new EmployeesPage();
    CRM_LoginPage loginPage = new CRM_LoginPage();

    @Given("User is on CRM application Login page")
    public void userIsOnHomePageOfCRMApplication(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User login to application with username {} and password {}")
    public void userLoginToApplicationWithUsernameAndPassword(String username, String password) throws IOException {
        loginPage.login(username, password);
    }

    @When("User clicks on Employees menu")
    public void user_clicks_on_employees_menu() throws InterruptedException, IOException {
        //Clicking Employees menu/ page from the left pane
        empPage.employeesPage.click();
        Thread.sleep(3000);
    }

    @Then("Verify the Title of the page")
    public void verifyTheTitleOfThePage() {
        verifyTitleContains("Company Structure");
        System.out.println("Title \"Company Structure\" is verified successfully");
    }

    @And("Verify if User is able to see the Company Structure under Employees page")
    public void verify_If_User_Is_Able_To_See_The_Company_Structure_Under_Employees_Page() {
        //Verifying if user is able to see the Company Structure
        String expectedVerification= "Company Structure";
        String actualVerification= empPage.companyStructure.getText();

        Assert.assertEquals(expectedVerification, actualVerification);
//After checking with Aaron, will need to change the verification to companyStructureTitle from companyStructureTab
        System.out.println("Assertion has passed");
    }

    @Then("HR User clicks on ADD DEPARTMENT")
    public void hr_User_clicks_on_add_department() throws InterruptedException, IOException {
//HR User clicks on ADD DEPARTMENT and adds a department;
        empPage.addDepartmentButton.click();
    }

    @And("HR User fills the Add Department form")
    public void hr_User_Fills_The_Add_Department_Form() throws InterruptedException, IOException {
//User enters the department name as HR
        empPage.departmentName.sendKeys("HR");
        Thread.sleep(3000);

//User clicks on Select from structure link
        empPage.selectFromStructure.click();
        Thread.sleep(2000);

//User selects email under recent tab
        empPage.emailUnderRecentTab.click();

//User clicks on ADD button
        empPage.addButton.click();
        Thread.sleep(5000);


/*
//User deletes department,Need to implement it at later point
        empPage.deleteDepartment.click();
        Thread.sleep(5000);

        File src= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File("C:\\Users\\vidya\\AutomationTestScreenshots\\AfterDeletingDepartment.png"));*/
    }

    @Then("Verify if User is able to see the Company Structure and should not see ADD Department button")
    public void user_should_not_be_seeing_add_department_button_from_company_structure() {
        //Verifying if user is able to see the Company Structure
        String expectedVerification= "Company Structure";
        String actualVerification= empPage.companyStructure.getText();

        Assert.assertEquals(expectedVerification, actualVerification);
//After checking with Aaron, will need to change the verification to companyStructureTitle from companyStructureTab
        System.out.println("Assertion has passed");
    }




}











    







































































































































































































































































































































































































/*
System.out.println("get block from Mojib's Login");

//Below 3 lines I can get from Login page, Mojibs page, but for now I'm keeping it in Employees page
        empPage.userName.sendKeys("helpdesk1@cydeo.com");
        empPage.password.sendKeys("UserUser");
        empPage.loginButton.click();

*/













