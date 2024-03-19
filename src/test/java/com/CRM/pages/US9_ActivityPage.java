package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US9_ActivityPage {

    public US9_ActivityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name ="More")
    public WebElement options;

}
