package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProfileContactScreen extends BaseClass {
    AppiumDriver appiumDriver;
    String titleId = "com.viber.voip:id/toolbar_custom_title";
    String favoritesId = "com.viber.voip:id/menu_favorite";
    String editId = "com.viber.voip:id/menu_contact_edit";
    String shareId = "com.viber.voip:id/share_fab";
    String lastLoginId = "com.viber.voip:id/toolbar_custom_subtitle";

    public ProfileContactScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    WebElement getTitleElement(){
        return appiumDriver.findElement(By.id(titleId));
    }
    WebElement getFavoriteElement(){
        return appiumDriver.findElement(By.id(favoritesId));
    }
    WebElement getEditElement(){
        return appiumDriver.findElement(By.id(editId));
    }
    WebElement getShareElement(){
        return appiumDriver.findElement(By.id(shareId));
    }
    WebElement getLastLoginElement(){
        return appiumDriver.findElement(By.id(lastLoginId));
    }


    public String getTitle(){
        return getTitleElement().getText();
    }
    public String lastLogin(){
        return getLastLoginElement().getText();
    }
    public void setContackFavorite(){
        getFavoriteElement().click();
    }
    public void clickOnEditContact(){
        getEditElement().click();
    }
    public void shareContact(){
        getShareElement().click();
    }
}
