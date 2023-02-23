package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SettingsScreen extends BaseClass {
    AppiumDriver appiumDriver;

    String settingsListId = "android:id/title";
    String appearanceXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]";

    public SettingsScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    List<WebElement> getSettingsElement(){
        return (List<WebElement>) appiumDriver.findElements(MobileBy.id(settingsListId));
    }
    WebElement getApperanceElement(){
        return appiumDriver.findElement(By.xpath(appearanceXpath));
    }

    public List<WebElement> getListElement(){
        return getSettingsElement();
    }
    public void clickOnAppearanceButton(){
        getApperanceElement().click();
    }
//    public String getNameElement(){
//        return getTitleElement().getText();
//    }
}
