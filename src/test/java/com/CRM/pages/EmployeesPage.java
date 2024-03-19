package com.CRM.pages;



import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage {

    public EmployeesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Employees")
    public WebElement employeesPage;

    @FindBy(linkText = "Company Structure")
    public WebElement companyStructure;

    @FindBy(xpath = "//span[@class='webform-small-button-text']")
    public WebElement addDepartmentButton;

    /*@FindBy(xpath = "//*[@id=\"pagetitle-menu\"]/a") //traversing from parent to class
    public WebElement addDepartmentButton;*/ //this one is also working for addDepartment functionality

    @FindBy(id = "NAME")
    public WebElement departmentName;

    @FindBy(id = "single-user-choice")
    public WebElement selectFromStructure;

    @FindBy(xpath = "//div[@class= 'finder-box-item-text']")
    public WebElement emailUnderRecentTab;

    @FindBy(xpath = "//div[@class='popup-window-buttons']/span") //traversing from parent to class
    public WebElement addButton;

    @FindBy(xpath = "//div[@title= 'Delete department']")
    public WebElement deleteDepartment;

    @FindBy(xpath = "//div[@class='popup-window-buttons']/span[2]") //traversing from parent to class
    public WebElement closeButton;
















}
