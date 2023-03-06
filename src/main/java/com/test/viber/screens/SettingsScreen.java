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

    public SettingsScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    List<WebElement> getSettingsElement(){
        return (List<WebElement>) appiumDriver.findElements(MobileBy.id(settingsListId));
    }


    public List<WebElement> getListElement(){
        return getSettingsElement();
    }
    public void printListOfItems(){
        System.out.println("Number of Items is " + getListElement().size());
        for(int i=0; i<getListElement().size(); i++){
            System.out.println(i+1+". " + getListElement().get(i).getText());
        }
    }
    public void clickOn(String item){
        for(int i=0; i<getListElement().size(); i++){
            if (getListElement().get(i).getText().equals(item)){
                System.out.println(getListElement().get(i).getText() + " is clicked");
                getListElement().get(i).click();
            }
        }
    }
}
