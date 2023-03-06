package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GeneralScreen extends BaseClass {
    AppiumDriver appiumDriver;
    String languageXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup";
    String saveButtonId = "com.viber.voip:id/menu_save";
    String titleId = "com.viber.voip:id/label";


    public GeneralScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    WebElement getLanguageElement(){
        return appiumDriver.findElement(By.xpath(languageXpath));
    }
    WebElement getSaveElement(){
        return appiumDriver.findElement(By.id(saveButtonId));
    }
    List<WebElement> getTitleElement(){
        return (List<WebElement>) appiumDriver.findElements(By.id(titleId));
    }

    public void clickOnLanguage(){
        getLanguageElement().click();
    }
    public void clickOnSaveButton(){
        getSaveElement().click();
    }
    public void selectNewLanguage(String language){
        //System.out.println(getTitleElement().size());
        for (int i=1;i<getTitleElement().size();i++){
            if (getTitleElement().get(i).getText().equals(language)){
                getTitleElement().get(i).click();
            }
        }
    }




}
