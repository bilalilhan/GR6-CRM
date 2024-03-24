package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage {

    public ActivityStreamPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']/span/span[1]")
    public List<WebElement> Options;


    @FindBy(xpath = "//span[@id='feed-add-post-form-link-more']/span[@class='feed-add-post-form-link']")
    public List<WebElement> More;

    public static void selectMore(String activity) {
    }
}