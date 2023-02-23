package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeSearchScreen extends BaseClass {
    AppiumDriver appiumDriver;
    String titleSearchFieldId = "com.viber.voip:id/search_src_text";

    public HomeSearchScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    WebElement getTitleSearchElement(){
        return appiumDriver.findElement(By.id(titleSearchFieldId));
    }
    public void clickOnTitleSearchField(){
        getTitleSearchElement().click();
    }
    public void sendTextToField(String text){
        getTitleSearchElement().sendKeys(text);
    }
}
