package com.test.viber.screens;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddContactScreen extends BaseClass {
    AppiumDriver appiumDriver;
    String enterNumberId = "com.viber.voip:id/phone_number";
    String continueButtonId = "com.viber.voip:id/continue_btn";
    String scanCodeId = "com.viber.voip:id/scan_code";
    String helpTextId = "com.viber.voip:id/scan_code_help_text";
    String orLabelId = "com.viber.voip:id/or_label";
    String labelNameXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView\n";

    public AddContactScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    WebElement getNumberElement(){
        return appiumDriver.findElement(By.id(enterNumberId));
    }
    WebElement getContinueButtonElement(){
        return appiumDriver.findElement(By.id(continueButtonId));
    }
    WebElement getScanCodeElement(){
        return appiumDriver.findElement(By.id(scanCodeId));
    }
    WebElement getHelpTextElement(){
        return appiumDriver.findElement(By.id(helpTextId));
    }
    WebElement getOrLabelElement(){
        return appiumDriver.findElement(By.id(orLabelId));
    }
    WebElement getLabelTextElement(){
        return appiumDriver.findElement(By.xpath(labelNameXpath));
    }





    public void AddNumbers(String numbers){
        getNumberElement().sendKeys(numbers);
    }
    public void clickOnContinueButton(){
        getContinueButtonElement().click();
    }
    public void clickOnScanCodeButton(){
        getScanCodeElement().click();
    }
    public String getHelpText(){
        return getHelpTextElement().getText();
    }
    public String getOrLabelText(){
        return getOrLabelElement().getText();
    }
    public void checkLabelName(String expectedName){
        assert getLabelTextElement().getText().equals(expectedName);
    }
}
