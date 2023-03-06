package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditProfilScreen extends BaseClass{
    AppiumDriver appiumDriver;

    String editNameId = "com.viber.voip:id/nameText";
    String editDateId = "com.viber.voip:id/birthDateView";
    String editMailId = "com.viber.voip:id/emailText";
    String enterMailId = "com.viber.voip:id/userEmailTextInput";
    String verificationButtonId = "com.viber.voip:id/sendVerificationBtnText";
    String celKalendarId = "android:id/pickers";
    String denXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText";
    String mesecXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText";
    String godinaXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText";
    String okButtonId = "android:id/button1";
    public EditProfilScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }


    WebElement getDenELement(){
        return appiumDriver.findElement(By.xpath(denXpath));
    }
    WebElement getMesecElement(){
        return appiumDriver.findElement(By.xpath(mesecXpath));
    }
    WebElement getGodinaElement(){
        return appiumDriver.findElement(By.xpath(godinaXpath));
    }
    WebElement getNameElement(){
        return appiumDriver.findElement(By.id(editNameId));
    }
    WebElement getEmailElement(){
        return appiumDriver.findElement(By.id(editMailId));
    }
    WebElement getMailEnterElement(){
        return appiumDriver.findElement(By.id(enterMailId));
    }
    WebElement getVerificationButtonElement(){
        return appiumDriver.findElement(By.id(verificationButtonId));
    }
    WebElement getDateElement(){
        return appiumDriver.findElement(By.id(editDateId));
    }
    WebElement getOkButtonElement(){
        return appiumDriver.findElement(By.id(okButtonId));
    }

    public String getTextFromName(){
        return getNameElement().getText();
    }
    public void clickOnEmail(){
        getEmailElement().click();
    }
    public void renameMail(String mail){
        getMailEnterElement().sendKeys(mail);
    }
    public void clickOnVerificationButton(){
        getVerificationButtonElement().click();
    }
    public void clearEmailField(){
        getMailEnterElement().clear();
    }
    public void clickOnDate(){
        getDateElement().click();
    }
    public void clickOnOk(){
        getOkButtonElement().click();
    }

    public void izberiDen(String den){
        getDenELement().click();
        getDenELement().clear();
        getDenELement().sendKeys(den);
    }
    public void izberiMesec(String mesec){
        getMesecElement().click();
        getDenELement().clear();
        getMesecElement().sendKeys(mesec);
    }
    public void izberiGodina(String godina){
        getGodinaElement().click();
        getDenELement().clear();
        getGodinaElement().sendKeys(godina);
    }

}
