package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MoreScreen extends BaseClass {
    AppiumDriver appiumDriver;
    String editSettingsId = "com.viber.voip:id/menu_edit";
    String qrId = "com.viber.voip:id/menu_qr_code";
    String listOptionId = "com.viber.voip:id/titleView";
    String settingsXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]";
    String viberOutXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]";
    String stickerMarketXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]";
    String myNotesXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]";
    String inviteFriendsXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]";




    public MoreScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    WebElement editButtonElement(){
        return appiumDriver.findElement(By.id(editSettingsId));
    }
    WebElement qrButtonElement(){
        return appiumDriver.findElement(By.id(qrId));
    }
    List<WebElement> getOptionElement(){
        return (List<WebElement>) appiumDriver.findElements(By.id(listOptionId));
    }
    WebElement getSettingsElement(){
        return appiumDriver.findElement(By.xpath(settingsXpath));
    }
    WebElement getMyNotesElement(){
        return appiumDriver.findElement(By.xpath(myNotesXpath));
    }
    WebElement getInviteFriendsElement(){
        return appiumDriver.findElement(By.xpath(inviteFriendsXpath));
    }


    public void clickOnEdit(){
        editButtonElement().click();
    }
    public void clickOnQrButton(){
        qrButtonElement().click();
    }
    public void clickOnSettings(){
        getSettingsElement().click();
    }
    public void clickOnMyNotesButton(){
        getMyNotesElement().click();
    }
    public void clickOnInviteFriends(){
        getInviteFriendsElement().click();
    }
    public void clickOnItem(String item){
        System.out.println(getOptionElement().size());
        for (int i=0;i<getOptionElement().size();i++){
            System.out.println(getOptionElement().get(i).getText());
            if (getOptionElement().get(i).getText().equals(item)){
                getOptionElement().get(i).click();
            }
        }
    }
}
