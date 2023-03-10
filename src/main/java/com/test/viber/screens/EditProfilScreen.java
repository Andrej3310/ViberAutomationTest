package com.test.viber.screens;

import com.google.common.collect.ImmutableMap;
import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EditProfilScreen extends BaseClass{
    AppiumDriver appiumDriver;

    String editNameId = "com.viber.voip:id/nameText";
    String editDateId = "com.viber.voip:id/birthDateView";
    String enterMailId = "com.viber.voip:id/userEmailTextInput";
    String verificationButtonId = "com.viber.voip:id/sendVerificationBtnText";
    String celKalendarId = "android:id/pickers";
    String denXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText";
    String mesecXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText";
    String godinaXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText";
    String okButtonId = "android:id/button1";
    String nextDayXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.Button[2]";
    String nextMonthXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.Button[2]";
    String nextYearXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.Button[2]";
    String prevYearXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.Button[1]";
    String prevMonthXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.Button[1]";
    String prevDayXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.Button[1]";


    public EditProfilScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }


    WebElement getDenELement(){
        return appiumDriver.findElement(By.xpath(denXpath));
    }
    WebElement getNextDayElement(){
        return appiumDriver.findElement(By.xpath(nextDayXpath));
    }
    WebElement getMesecElement(){
        return appiumDriver.findElement(By.xpath(mesecXpath));
    }
    WebElement getNexMonthElement(){
        return appiumDriver.findElement(By.xpath(nextMonthXpath));
    }
    WebElement getGodinaElement(){
        return appiumDriver.findElement(By.xpath(godinaXpath));
    }
    WebElement getNextYearElement(){
        return appiumDriver.findElement(By.xpath(nextYearXpath));
    }
    WebElement getPrevYearElement(){
        return appiumDriver.findElement(By.xpath(prevYearXpath));
    }
    WebElement getNameElement(){
        return appiumDriver.findElement(By.id(editNameId));
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
    WebElement getPrevMonthElement(){
        return appiumDriver.findElement(By.xpath(prevMonthXpath));
    }
    WebElement getPrevDayElement(){
        return appiumDriver.findElement(By.xpath(prevDayXpath));
    }

    public void checkName(String name){
        assert getNameElement().getText().equals(name);
    }
    public void clickOnEmail(){
        getMailEnterElement().click();
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

    public void izberiDen(String den) {
        int flag = 1;
        while (flag == 1) {
            if (!getDenELement().getText().equals(den)) {
                int momday = Integer.parseInt(getDenELement().getText());
                int numday = Integer.parseInt(den);
                if (momday < numday){
                    getNextDayElement().click();
                }
                else {
                    getPrevDayElement().click();
                }
            }
            else {
                flag=0;
            }
        }
    }
    public void izberiMesec(String mesec){
        int flag = 1;
        while (flag == 1) {
            if (!getMesecElement().getText().equals(mesec)) {
                /*int mommes = Integer.parseInt(getMesecElement().getText());
                int nummesec = Integer.parseInt(mesec);
                if (mommes < nummesec){
                    getNexMonthElement().click();
                }
                else {
                    getPrevMonthElement().click();
                }*/
                getNexMonthElement().click();
            }
            else {
                flag=0;
            }
        }
    }
    public void izberiGodina(String godina){
        int flag = 1;
        while (flag == 1) {
            if (!getGodinaElement().getText().equals(godina)) {
                int momgod = Integer.parseInt(getGodinaElement().getText());
                int numgodina = Integer.parseInt(godina);
                if (momgod < numgodina){
                    getNextYearElement().click();
                }
                else {
                    getPrevYearElement().click();
                }
            }
            else {
                flag=0;
            }
        }
    }

}
