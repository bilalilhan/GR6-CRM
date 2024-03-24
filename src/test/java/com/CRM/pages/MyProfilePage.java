package com.CRM.pages;

import com.CRM.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {

   public MyProfilePage (){
      PageFactory.initElements(Driver.getDriver(),this);
   }

}
