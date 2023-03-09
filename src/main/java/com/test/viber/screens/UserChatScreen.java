package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserChatScreen extends BaseClass {
    AppiumDriver appiumDriver;

    String stickerId = "com.viber.voip:id/options_menu_open_stickers";
    String galleryId = "com.viber.voip:id/options_menu_open_gallery";
    String cameraId = "com.viber.voip:id/options_menu_open_custom_camera";
    String gifId = "com.viber.voip:id/options_menu_open_chat_extensions";
    String timerId = "options_menu_set_secret_mode";
    String firstPhotoXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[1]";
    String sendButtonId = "com.viber.voip:id/btn_send";
    String textFieldId = "com.viber.voip:id/send_text";
    String statusXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView[2]";
    String callButtonId = "com.viber.voip:id/menu_viber_call";
    String videoButtonId = "com.viber.voip:id/menu_video_call";


    public UserChatScreen(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
    }

    WebElement getStickerElement(){
        return appiumDriver.findElement(By.id(stickerId));
    }
    WebElement getGalleryElement(){
        return appiumDriver.findElement(By.id(galleryId));
    }
    WebElement getCameraId(){
        return appiumDriver.findElement(By.id(cameraId));
    }
    WebElement getGifId(){
        return appiumDriver.findElement(By.id(gifId));
    }
    WebElement getTimerId(){
        return appiumDriver.findElement(By.id(timerId));
    }
    WebElement getFirstPhotoElement(){
        return appiumDriver.findElement(By.xpath(firstPhotoXpath));
    }
    WebElement getSendButtonElement(){
        return appiumDriver.findElement(By.id(sendButtonId));
    }
    WebElement getTextFieldElement(){
        return appiumDriver.findElement(By.id(textFieldId));
    }
    WebElement getStatusElement(){
        return appiumDriver.findElement(By.xpath(statusXpath));
    }
    WebElement getCallElement(){
        return appiumDriver.findElement(By.id(callButtonId));
    }
    WebElement getVideoELement(){
        return appiumDriver.findElement(By.id(videoButtonId));
    }


    public void clickOnGalleryButton(){
        getGalleryElement().click();
    }
    public void clickOnFirstPhotoFromGallery(){
        getFirstPhotoElement().click();
    }
    public void clickOnSendButton(){
        getSendButtonElement().click();
    }
    public void clickOnTextField(){
        getTextFieldElement().click();
    }
    public void sendText(String text){
        getTextFieldElement().sendKeys(text);
    }
    public void checkStatus(){
        if (getStatusElement().getText().equals("Online")){
            System.out.println("Korisnikot e Online");
        }
        else
            System.out.println("Korisnikot ne e online");
    }
    public void call(){
        getCallElement().click();
    }
    public void videoCall(){
        getVideoELement().click();
    }




}
