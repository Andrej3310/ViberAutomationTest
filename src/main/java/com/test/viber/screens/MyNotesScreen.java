package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyNotesScreen extends BaseClass {
    AppiumDriver appiumDriver;

    String typeMessangeId = "com.viber.voip:id/send_text";
    String sendMessangeId = "com.viber.voip:id/btn_send";
    String backButtonAssId ="Navigate up";
    String searchButtonId = "com.viber.voip:id/menu_search_messages";
    String settingsButtonXpath = "(//android.widget.ImageView[@content-desc=\"More options\"])[1]";
    String stickerAssId = "Select a sticker to send";
    String removeButtonXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.view.View";
    String deleteAllNotesXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView";




    public MyNotesScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    WebElement getTypeMessangeElement(){
        return appiumDriver.findElement(By.id(typeMessangeId));
    }
    WebElement getSendMessangeElement(){
        return appiumDriver.findElement(By.id(sendMessangeId));
    }
    WebElement getBackButtonElement(){
        return appiumDriver.findElementByAccessibilityId(backButtonAssId);
    }
    WebElement getSettingButtonElement(){
        return appiumDriver.findElement(By.xpath(settingsButtonXpath));
    }
    WebElement getStickerElement(){
        return appiumDriver.findElementByAccessibilityId(stickerAssId);
    }
    WebElement getRemoveButtonElement(){
        return appiumDriver.findElement(By.xpath(removeButtonXpath));
    }
    WebElement getDeleteNotesElement(){
        return appiumDriver.findElement(By.xpath(deleteAllNotesXpath));
    }

    public void clickOnTypeMessange(){
        getTypeMessangeElement().click();
    }
    public void clickOnSendButton(){
        getSendMessangeElement().click();
    }
    public void typeMessange(String poraka){
        getTypeMessangeElement().sendKeys(poraka);
    }
    public void clickOnBackButton(){
        getBackButtonElement().click();
    }
    public void clickOnSettingsButton(){
        getSettingButtonElement().click();
    }
    public void clickOnStickerButton(){
        getStickerElement().click();
    }
    public void clickOnRemoveMessange(){
        getRemoveButtonElement().click();
    }
    public void clickOnDeleteNotes(){
        getDeleteNotesElement().click();
    }
}



