package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AccessEmployeesPage extends BasePage {


    public List<WebElement> employeeModules;

    public AccessEmployeesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Employees']")

    public WebElement employeesButton;

    @FindBy(xpath = "//a[@title='Company Structure']")
    public WebElement companyStructure;

    @FindBy(xpath = "//span[.='Find Employee']")
    public WebElement findEmployee;

 @FindBy(xpath = "//span[.='Telephone Directory']")
    public WebElement telephoneDirectory;

 @FindBy(xpath = "//span[.='Staff Changes']")
    public WebElement staffChanges;

 @FindBy(xpath = "//span[.='Efficiency Report']")
    public WebElement efficiencyReport;

 @FindBy(xpath = "//span[.='Honored Employees']")
    public WebElement honoredEmployees;

 @FindBy(xpath = "//span[.='Birthdays']")
    public WebElement birthdays;

 @FindBy(xpath = "//span[.='New page']")
    public WebElement newPage;











}
