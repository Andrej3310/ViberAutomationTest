package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EditContactScreen extends BaseClass {
    AppiumDriver appiumDriver;
    String contactNameXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText";
    String organisationXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText";
    String mobileTypeXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Spinner";
    String mobileNumberXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText";
    String addNewPhoneId = "com.android.contacts:id/add_item_name";
    String emailTypeXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Spinner";
    String emailXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText";
    String notesXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText";
    String addFieldId = "com.android.contacts:id/button_add_field";
    String companyXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText[1]";
    String titleXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.EditText[2]";
    String addressXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText";
    String pageTitleId = "android:id/action_bar_title";

    public EditContactScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    WebElement getContactNameElement(){
        return appiumDriver.findElement(By.xpath(contactNameXpath));
    }
    WebElement getOrganisationElement(){
        return appiumDriver.findElement(By.xpath(organisationXpath));
    }
    WebElement getMobileTypeElement(){
        return appiumDriver.findElement(By.xpath(mobileTypeXpath));
    }
    WebElement getMobileNumberElement(){
        return appiumDriver.findElement(By.xpath(mobileNumberXpath));
    }
    WebElement getNewPhoneElement(){
        return appiumDriver.findElement(By.id(addNewPhoneId));
    }
    WebElement getEmailTypeElement(){
        return appiumDriver.findElement(By.xpath(emailTypeXpath));
    }
    WebElement getEmailElement(){
        return appiumDriver.findElement(By.xpath(emailXpath));
    }
    WebElement getNotesElement(){
        return appiumDriver.findElement(By.xpath(notesXpath));
    }
    WebElement getAddFieldIdElement(){
        return appiumDriver.findElement(By.id(addFieldId));
    }
    WebElement getCompanyElement(){
        return appiumDriver.findElement(By.xpath(companyXpath));
    }
    WebElement getTitleElement(){
        return appiumDriver.findElement(By.xpath(titleXpath));
    }
    WebElement getAddressElement(){
        return appiumDriver.findElement(By.xpath(addressXpath));
    }
    WebElement getPageTitleElement(){
        return appiumDriver.findElement(By.id(pageTitleId));
    }


    public void changeName(String name){
        getContactNameElement().sendKeys(name);
    }
    public void clickOnOrganisation(){
        getOrganisationElement().click();
    }
    public void changeMobilePhone(String numbers){
        getMobileNumberElement().sendKeys(numbers);
    }
    public void enterCompanyName(String name){
        getCompanyElement().sendKeys(name);
    }
    public void enterTitleName(String title){
        getTitleElement().sendKeys(title);
    }
    public void changeMobileType(String type){
        getMobileTypeElement().click();

        if(type.equals("Mobile")){
            type = "1";
        }
        else if(type.equals("Work")){
            type = "2";
        }
        else if(type.equals("Home")){
            type = "3";
        }
        else if(type.equals("Main")){
            type = "4";
        }
        else if(type.equals("Work Fax")){
            type = "5";
        }
        else if(type.equals("Home Fax")){
            type = "6";
        }
        else if(type.equals("Pager")){
            type = "7";
        }
        else if(type.equals("Other")){
            type = "8";
        }
        else if(type.equals("Custom")){
            type = "9";
        }
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[" + type + "]/android.widget.TextView")).click();
    }
    public void enterMail(String mail){
        getEmailElement().sendKeys(mail);
    }
    public void addAnotherField(String type) {
        getAddFieldIdElement().click();
        for (int i = 1; i < 11; i++) {
            String lista = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[" + i + "]")).getText();
            System.out.println(lista);
            if (lista.equals(type)) {
                appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[" + i + "]")).click();
                break;
            }
        }
    }
    public void changeEmailType(String emailType){
        getEmailTypeElement().click();
        if (emailType.equals("Home")){
            emailType = "1";
        }
        else if (emailType.equals("Work")){
            emailType = "2";
        }

        else if (emailType.equals("Other")){
            emailType = "3";
        }

        else if (emailType.equals("Custom")){
            emailType = "4";
        }
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[" + emailType + "]/android.widget.TextView")).click();
    }
    public void enterAdress(String address){
        getAddressElement().sendKeys(address);
    }
    public void checkTitleName(String expectedName){
        assert getPageTitleElement().getText().equals(expectedName);
        System.out.println("The " + expectedName + " page is opened");
    }







}
