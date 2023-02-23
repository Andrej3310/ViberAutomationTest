package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class KeyboardScreen extends BaseClass {
    AppiumDriver appiumDriver;
    String oneId = "com.viber.voip:id/one";
    String twoId = "com.viber.voip:id/two";
    String threeId = "com.viber.voip:id/three";
    String fourId = "com.viber.voip:id/four";
    String fiveId = "com.viber.voip:id/five";
    String sixId = "com.viber.voip:id/six";
    String sevenId = "com.viber.voip:id/seven";
    String eightd = "com.viber.voip:id/eight";
    String nineId = "com.viber.voip:id/nine";
    String zeroId = "com.viber.voip:id/zero";
    String greenId = "com.viber.voip:id/fab_dial";
    String deleteId = "com.viber.voip:id/deleteButton";
    String poundId = "com.viber.voip:id/pound";
    String starId = "com.viber.voip:id/star";
    String nineWordsXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]/android.widget.TextView[1]";


    public KeyboardScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    WebElement getOneElement(){
        return appiumDriver.findElement(By.id(oneId));
    }
    WebElement getTwoElement(){
        return appiumDriver.findElement(By.id(twoId));
    }
    WebElement getThreeElement(){
        return appiumDriver.findElement(By.id(threeId));
    }
    WebElement getFourElement(){
        return appiumDriver.findElement(By.id(fourId));
    }
    WebElement getFiveElement(){
        return appiumDriver.findElement(By.id(fiveId));
    }
    WebElement getSixElement(){
        return appiumDriver.findElement(By.id(sixId));
    }
    WebElement getSevenElement(){
        return appiumDriver.findElement(By.id(sevenId));
    }
    WebElement getEightElement(){
        return appiumDriver.findElement(By.id(eightd));
    }
    WebElement getNineElement(){
        return appiumDriver.findElement(By.id(nineId));
    }
    WebElement getZeroElement(){
        return appiumDriver.findElement(By.id(zeroId));
    }
    WebElement getGreenElement(){
        return appiumDriver.findElement(By.id(greenId));
    }
    WebElement getDeleteElement(){
        return appiumDriver.findElement(By.id(deleteId));
    }
    WebElement getPoundElement(){
        return appiumDriver.findElement(By.id(poundId));
    }
    WebElement getStarElement(){
        return appiumDriver.findElement(By.id(starId));
    }
    WebElement getNineWordsElement(){
        return appiumDriver.findElement(By.xpath(nineWordsXpath));
    }


    public void clickOnOneButton(){
        getOneElement().click();
    }
    public void clickOnTwoButton(){
        getTwoElement().click();
    }
    public void clickOnThreeButton(){
        getThreeElement().click();
    }
    public void clickOnFourButton(){
        getFourElement().click();
    }
    public void clickOnFiveButton(){
        getFiveElement().click();
    }
    public void clickOnSixButton(){
        getSixElement().click();
    }
    public void clickOnSevenButton(){
        getSevenElement().click();
    }
    public void clickOnEightButton(){
        getEightElement().click();
    }
    public void clickOnNineButton(){
        getNineElement().click();
    }
    public void clickOnZeroButton(){
        getZeroElement().click();
    }
    public void clickOnGreenButton(){
        getGreenElement().click();
    }
    public void clickOnDeleteButton(){
        getDeleteElement().click();
    }
    public void clickOnPoundButton(){
        getPoundElement().click();
    }
    public void clickOnStarButton(){
        getStarElement().click();
    }
    public String getNineWords(){
        return getNineWordsElement().getText();
    }




}
