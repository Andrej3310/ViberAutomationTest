package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultScreen extends BaseClass {

    AppiumDriver appiumDriver;
    String resultId = "com.viber.voip:id/title";

    public SearchResultScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    WebElement getResultElement(){
        return appiumDriver.findElement(By.id(resultId));
    }
    public void clickOnFirstResult(){
        getResultElement().click();
    }
}
