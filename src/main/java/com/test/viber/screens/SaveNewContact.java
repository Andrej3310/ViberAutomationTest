package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SaveNewContact extends BaseClass {
    AppiumDriver appiumDriver;
    String saveContactButtonId = "com.viber.voip:id/done";
    String titleXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout[1]/android.view.View/android.widget.TextView";
    String titleId = "com.viber.voip:id/action_bar";
    String nameId = "com.viber.voip:id/display_name_text";
    String mobileId = "com.viber.voip:id/phone_number_text";
    String accountId = "android:id/text1";
    String doneId = "com.viber.voip:id/menu_done";
    String openCameraId = "com.viber.voip:id/open_camera";
    String openGalleryId = "com.viber.voip:id/open_gallery";
    String zoomPhotoId = "com.viber.voip:id/photo";



    public SaveNewContact(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    WebElement getTitleElement(){
        return appiumDriver.findElement(By.xpath(titleXpath));
    }
    WebElement getSaveElement(){
        return appiumDriver.findElement(By.id(saveContactButtonId));
    }
    public WebElement getTitleFieldElement(){
        return appiumDriver.findElement(By.id(titleId));
    }

    public void clickOnSaveButton(){
        getSaveElement().click();
    }
    public String getTitleText(){
        return getTitleElement().getText();
    }


}
