package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CallsScreen extends BaseClass {
    AppiumDriver appiumDriver;
    String addContactId = "com.viber.voip:id/menu_add_contact";
    String searchContactId = "com.viber.voip:id/menu_search";
    String allContactId = "com.viber.voip:id/filterAllView";
    String viberContactId = "com.viber.voip:id/filterViberView";
    String buyCreditsId = "com.viber.voip:id/voBuyCreditView";
    String keybordNumberId = "com.viber.voip:id/fab_open_keypad";
    String contactListId = "com.viber.voip:id/root";



    public CallsScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    WebElement getAddContactElement(){
        return appiumDriver.findElement(By.id(addContactId));
    }
    WebElement getSearchContactElement(){
        return appiumDriver.findElement(By.id(searchContactId));
    }
    WebElement getAllContactElement(){
        return appiumDriver.findElement(By.id(allContactId));
    }
    WebElement getViberContactElement(){
        return appiumDriver.findElement(By.id(viberContactId));
    }
    WebElement getBuyCreditsElement(){
        return appiumDriver.findElement(By.id(buyCreditsId));
    }
    WebElement getKeyboardNumbersElement(){
        return appiumDriver.findElement(By.id(keybordNumberId));
    }
    List<WebElement> getContactListElement(){
        return (List<WebElement>) appiumDriver.findElements(MobileBy.id(contactListId));
    }



    public void clickOnAddContactIcon(){
        getAddContactElement().click();
    }
    public void clickOnSearchContact(){
        getSearchContactElement().click();
    }
    public void clickOnAllContactIcon(){
        getAllContactElement().click();
    }
    public void clickOnViberContactIcon(){
        getViberContactElement().click();
    }
    public void clickOnBuyCreditsIcon(){
        getBuyCreditsElement().click();
    }
    public void clickOnKeyboardNumbersIcon(){
        getKeyboardNumbersElement().click();
    }
    public List<WebElement> getListOfContacts(){
        return getContactListElement();
    }
}
