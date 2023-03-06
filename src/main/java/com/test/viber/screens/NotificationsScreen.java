package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NotificationsScreen extends BaseClass {
    AppiumDriver appiumDriver;
    String showMessagePreviewXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.CheckBox";
    String contactJoinXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.CheckBox";
    String birthdayXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.CheckBox";
    String showExploreXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.CheckBox";
    String showBirthdayXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.CheckBox";
    String newMessagePopupXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[6]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.CheckBox";
    String vibrateRingingXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[9]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.CheckBox";


    public NotificationsScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }


    WebElement getShowElement(){
        return appiumDriver.findElement(By.xpath(showMessagePreviewXpath));
    }
    WebElement getContactElement(){
        return appiumDriver.findElement(By.xpath(contactJoinXpath));
    }
    WebElement getBirthdayElement(){
        return appiumDriver.findElement(By.xpath(birthdayXpath));
    }
    WebElement getShowExploreElement(){
        return appiumDriver.findElement(By.xpath(showExploreXpath));
    }
    WebElement getShowBirthdayElement(){
        return appiumDriver.findElement(By.xpath(showBirthdayXpath));
    }
    WebElement getVibrateElement(){
        return appiumDriver.findElement(By.xpath(vibrateRingingXpath));
    }



    public void showMessagePreview(boolean is){
        if (is){
            if (getShowElement().getAttribute("checked").equals("false")){
                getShowElement().click();
            }
        }
        else {
            if (getShowElement().getAttribute("checked").equals("true")){
                getShowElement().click();
            }
        }
    }
    public void contactJoinedViber(boolean is){
        if (is){
            if (getContactElement().getAttribute("checked").equals("false")){
                getContactElement().click();
            }
        }
        else {
            if (getContactElement().getAttribute("checked").equals("true")){
                getContactElement().click();
            }
        }
    }
    public void getBirthdayNotifications(boolean is){
        if (is){
            if (getBirthdayElement().getAttribute("checked").equals("false")){
                getBirthdayElement().click();
            }
        }
        else {
            if (getBirthdayElement().getAttribute("checked").equals("true")){
                getBirthdayElement().click();
            }
        }
    }
    public void showExploreNotifications(boolean is){
        if (is){
            if (getShowExploreElement().getAttribute("checked").equals("false")){
                getShowExploreElement().click();
            }
        }
        else {
            if (getShowExploreElement().getAttribute("checked").equals("true")){
                getShowExploreElement().click();
            }
        }
    }
    public void showBirthdaysReminders(boolean is){
        if (is){
            if (getShowBirthdayElement().getAttribute("checked").equals("false")){
                getShowBirthdayElement().click();
            }
        }
        else {
            if (getShowBirthdayElement().getAttribute("checked").equals("true")){
                getShowBirthdayElement().click();
            }
        }
    }
    public void vibrateWhenRinging(boolean is){
        if(is){
            if(getVibrateElement().getAttribute("checked").equals("false")){
                getVibrateElement().click();
            }
        }
        else {
            if(getVibrateElement().getAttribute("checked").equals("true")){
                getVibrateElement().click();
            }
        }
    }





}
