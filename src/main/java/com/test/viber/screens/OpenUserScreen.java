package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OpenUserScreen extends BaseClass {
    AppiumDriver appiumDriver;

    String titleXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.widget.TextView";

    public OpenUserScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    WebElement getTitleElement(){
        return appiumDriver.findElement(By.xpath(titleXpath));
    }
    public void clickOnTitle(){
        getTitleElement().click();
    }
    public String getTitleName(){
        return getTitleElement().getText();
    }
}
