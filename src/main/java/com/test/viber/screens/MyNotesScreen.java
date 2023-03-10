package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
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
    String removeFirstMessageXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.View";
    String deleteAllNotesXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView";
    String cancelButtonId = "android:id/button2";
    String deleteButtonId = "android:id/button1";
    String titleXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView";
    String galleryId = "Choose media from gallery";
    String lastPhotoXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView";
    String notesId = "com.viber.voip:id/balloonView";



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
        return appiumDriver.findElement(By.xpath(removeFirstMessageXpath));
    }
    WebElement getDeleteNotesElement(){
        return appiumDriver.findElement(By.xpath(deleteAllNotesXpath));
    }
    WebElement getCancelElement(){
        return appiumDriver.findElement(By.id(cancelButtonId));
    }
    WebElement getDeleteElement(){
        return appiumDriver.findElement(By.id(deleteButtonId));
    }
    WebElement getTitleElement(){
        return appiumDriver.findElement(By.xpath(titleXpath));
    }
    WebElement getGalleryElement(){
        return appiumDriver.findElementByAccessibilityId(galleryId);
    }
    WebElement getLastPhotoElement(){
        return appiumDriver.findElement(By.xpath(lastPhotoXpath));
    }
    WebElement getNotesElement(){
        return appiumDriver.findElement(By.id(notesId));
    }

    public void clickOnTypeMessange(){
        getTypeMessangeElement().click();
    }
    public void clickOnSendButton(){
        getSendMessangeElement().click();
    }
    public void typeMessange(String poraka){
        getTypeMessangeElement().sendKeys(poraka);
        getSendMessangeElement().click();
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
    public void clickOnRemoveMessage(){
        try{
            getRemoveButtonElement().click();
            System.out.println("The message is successfully deleted");
        } catch (Exception e){
            System.out.println("There is no messages in My Notes");
        }
    }
    public void clickOnDeleteNotes(){
        getDeleteNotesElement().click();
    }
    public void clickOnDeleteButton(){
        getDeleteElement().click();
    }
    public void checkPageName(String expectedName){
        assert getTitleElement().getText().equals(expectedName);
    }
    public void clickOnGallery(){
        getGalleryElement().click();
    }
    public void selectLastPhoto(){
        getLastPhotoElement().click();
    }
}



