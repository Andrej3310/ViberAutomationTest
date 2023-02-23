package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AppearanceScreen extends BaseClass {
    AppiumDriver appiumDriver;

    String classicId = "com.viber.voip:id/button1";
    String darkBlueId = "com.viber.voip:id/button2";
    String blackId = "com.viber.voip:id/button3";

    public AppearanceScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    WebElement editScreenModeToDarkBlue(){
        return appiumDriver.findElement(By.id(darkBlueId));
    }
    WebElement editScreenModeToBlack(){
        return appiumDriver.findElement(By.id(blackId));
    }
    WebElement editScreenModeToClassic(){
        return appiumDriver.findElement(By.id(classicId));
    }

    public void clickOnDarkBlueButton(){
        editScreenModeToDarkBlue().click();
    }
    public void clickOnBlackButton(){
        editScreenModeToBlack().click();
    }

}
