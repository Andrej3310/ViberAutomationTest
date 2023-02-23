package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactScreen extends BaseClass {
    AppiumDriver appiumDriver;

    String typeMessengeId = "com.viber.voip:id/send_text";
    String sendMessengeId = "com.viber.voip:id/btn_send";
    String jumpButtonId = "com.viber.voip:id/btn_jump_to_bottom";

    WebElement getTypeMessengerElement(){
        return appiumDriver.findElement(By.id(typeMessengeId));
    }
    WebElement getSendButtonElement(){
        return appiumDriver.findElement(By.id(sendMessengeId));
    }
    WebElement getJumpBottomElement(){
        return appiumDriver.findElement(By.id(jumpButtonId));
    }

    public ContactScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }


    public void clickOnTypeMessenger(){
        getTypeMessengerElement().click();
    }
    public void sendKays(String text){
        getTypeMessengerElement().sendKeys(text);
    }
    public void clickOnSendButton(){
        getSendButtonElement().click();
    }
    public void clickOnJumpButtom(){
        getJumpBottomElement().click();
    }
}
