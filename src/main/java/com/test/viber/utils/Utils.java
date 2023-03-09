package com.test.viber.utils;

import com.test.viber.tests.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utils extends BaseClass {
    AppiumDriver appiumDriver;

    public Utils(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    public static String prescriptionId = "";

    public static String getPrescriptionId() {
        return prescriptionId;
    }

    public static void setPrescriptionId(String prescriptionId) {
        Utils.prescriptionId = prescriptionId;
    }

    public void scrolling() throws Exception {
        System.out.println("Scrolling...");
        Thread.sleep(3000);
        TouchAction touchAction = new TouchAction(appiumDriver);
        PointOption pointStart = PointOption.point(440, 770);
        Thread.sleep(3000);
        PointOption pointEnd = PointOption.point(500, 0);
        touchAction.press(pointStart);
        Thread.sleep(2000);
        touchAction.moveTo(pointEnd);
        Thread.sleep(3000);
        touchAction.release();
        Thread.sleep(2000);
        touchAction.perform();
        System.out.println("Scrolling is done");
    }

    public void scrolling2() throws Exception {
        System.out.println("Scrolling...");
        Thread.sleep(3000);
        TouchAction touchAction = new TouchAction(appiumDriver);
        PointOption pointStart = PointOption.point(295, 1095);
        Thread.sleep(3000);
        PointOption pointEnd = PointOption.point(290, 910);
        touchAction.press(pointStart);
        Thread.sleep(2000);
        touchAction.moveTo(pointEnd);
        Thread.sleep(3000);
        touchAction.release();
        Thread.sleep(2000);
        touchAction.perform();
        System.out.println("Scrolling is done");
    }

    public void scrollToAnElementByText(String text) {
        appiumDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(new UiSelector().text(\"" + text + "\"));"));
    }
    public WebElement findElement(String text) {
        return appiumDriver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + text + "\")"));
    }
    String backButtonAssId = "Navigate up";
    String threePointsXpath = "(//android.widget.ImageView[@content-desc=\"More options\"])[1]";
    String chatIfoXpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout";

    WebElement backButtonElement(){
        return appiumDriver.findElementByAccessibilityId(backButtonAssId);
    }
    WebElement threePointsElement(){
        return appiumDriver.findElement(By.xpath(threePointsXpath));
    }
    WebElement getChatInfoElement(){
        return appiumDriver.findElement(By.xpath(chatIfoXpath));
    }
    public void clickBackButton(){
        backButtonElement().click();
    }
    public void clickOnThreePoints(){
        threePointsElement().click();
    }
    public void clickOnChatInfo(){
        getChatInfoElement().click();
    }

}