package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewMessengeScreen extends BaseClass {
    AppiumDriver appiumDriver;
    String enterNameId = "com.viber.voip:id/search_src_text";
    String backAccId = "Collapse";


    public NewMessengeScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    WebElement getBackElement(){
        return appiumDriver.findElementByAccessibilityId(backAccId);
    }

    public void clickOnBack(){
        getBackElement().click();
    }
}
