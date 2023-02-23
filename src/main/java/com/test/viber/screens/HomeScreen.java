package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeScreen extends BaseClass {

    AppiumDriver appiumDriver;
    String titleXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView";
    String searchButtonId = "com.viber.voip:id/menu_search";
    String buttonCallsId = "com.viber.voip:id/bottom_nav_tab_2";
    String buttonExploreId = "com.viber.voip:id/bottom_nav_tab_3";
    String buttonMoreId = "com.viber.voip:id/bottom_nav_tab_4";
    String newMessengeId = "com.viber.voip:id/fab_compose";
    String chatsButtonId = "com.viber.voip:id/bottom_nav_tab_1";
    String listOfItemsId = "com.viber.voip:id/from";
    String adSettingsId = "com.viber.voip:id/overflowButton";
    String getTextFromThisUSer = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup[4]/android.widget.TextView[1]";
    String cameraId = "com.viber.voip:id/iv_menu_camera";

    public HomeScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    WebElement getSearchButtonElement(){
        return appiumDriver.findElement(By.id(searchButtonId));
    }
    WebElement getTitleElement(){
        return appiumDriver.findElement(By.xpath(titleXPath));
    }
    WebElement getCallsButtonElement(){
        return appiumDriver.findElement(By.id(buttonCallsId));
    }
    WebElement getMoreButtonElement(){
        return appiumDriver.findElement(By.id(buttonMoreId));
    }
    WebElement getNewMessengeButtonElement(){
        return appiumDriver.findElement(By.id(newMessengeId));
    }
    WebElement getChatsButtonElement(){
        return appiumDriver.findElement(By.id(chatsButtonId));
    }
    List<WebElement> getListElement(){
        return (List<WebElement>) appiumDriver.findElements(MobileBy.id(listOfItemsId));
    }
     WebElement getAdSettingsElement(){
        return appiumDriver.findElement(By.id(adSettingsId));
     }
     WebElement getExploreButtonElement(){
        return appiumDriver.findElement(By.id(buttonExploreId));
     }
     WebElement getTextFromUser(){
        return appiumDriver.findElement(By.xpath(getTextFromThisUSer));
     }
     WebElement getCameraElement(){
        return appiumDriver.findElement(By.id(cameraId));
     }



    public void checkTitleName(String expectedName){
        assert getTitleElement().getText().equals(expectedName);
        System.out.println("Otvorena e aplikacija " + expectedName);
    }
    public void openCamera(){
        getCameraElement().click();
        System.out.println("Camera is opened");
    }
    public void printText(){
        System.out.println(getTextFromUser().getText());
    }
    public void clickOnSearchButton(){
       getSearchButtonElement().click();
    }
    public void clickOnCallsButton(){
        getCallsButtonElement().click();
    }
    public void clickOnMoreButton(){
        getMoreButtonElement().click();
    }
    public void ClickOnExploreButton(){
        getExploreButtonElement().click();
    }
    public void clickOnNewMessengeButton(){
        getNewMessengeButtonElement().click();
    }
    public void clickOnChatsButton(){
        getChatsButtonElement().click();
    }
    public List<WebElement> getListOfItems(){
        return getListElement();
    }

    public void clickOnItems(String item){
        int flag=0;
        System.out.println(" Item size is " + getListOfItems().size());
        for(int i=0;i<getListOfItems().size();i++){
            System.out.println(" i = " + i +" "+ getListOfItems().get(i).getText());
            System.out.println(" Item e "+ item);
            if(getListOfItems().get(i).getText().equals(item)){
                System.out.println("Is clicked");
                flag=1;
                getListOfItems().get(i).click();
                break;
            }
        }
        if (flag==0){
            System.out.println("Not fount " + item);
            //break;
        }
    }
    public void clickOnAdSettings(){
        getAdSettingsElement().click();
    }
 }