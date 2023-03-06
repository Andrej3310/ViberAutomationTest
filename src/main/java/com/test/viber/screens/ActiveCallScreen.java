package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiveCallScreen extends BaseClass {
    AppiumDriver appiumDriver;
    String leaveConferenceButtonId = "com.viber.voip:id/leaveConference";
    String speakerButtonId = "com.viber.voip:id/speakerPhone";
    String videoCallButtonId = "com.viber.voip:id/videoCall";
    String muteMicrophoneButtonId = "com.viber.voip:id/silentCall";
    String photoId = "com.viber.voip:id/speakingPersonPhoto";

    public ActiveCallScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    WebElement getLeaveElement(){
        return appiumDriver.findElement(By.id(leaveConferenceButtonId));
    }
    WebElement getSpeakerElement(){
        return appiumDriver.findElement(By.id(speakerButtonId));
    }
    WebElement getVideoElement(){
        return appiumDriver.findElement(By.id(videoCallButtonId));
    }
    WebElement getMuteElement(){
        return appiumDriver.findElement(By.id(muteMicrophoneButtonId));
    }
    WebElement getPhotoElement(){
        return appiumDriver.findElement(By.id(photoId));
    }

    public void endCall(){
        getLeaveElement().click();
    }
    public void muteMicrophone(){
        getMuteElement().click();
    }
    public void callSpeaker(String status){
        if (status.equals("On")){
            getSpeakerElement().click();
        }
    }
    public void videoSpeaker(String status){
        if (status.equals("Off")){
            getSpeakerElement().click();
        }
    }




}
