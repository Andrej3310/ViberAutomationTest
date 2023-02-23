package com.test.viber.tests;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.net.URL;
import java.util.List;

//import org.openqa.selenium.remote.CapabilityType;


public class TestElements {
    WebDriver webDriver;
    AndroidDriver androidDriver;
    AppiumDriver appiumDriver;
    MobileElement mobileElement;
    MobileDriver mobileDriver;

    @BeforeClass
    public void setUp() throws Exception {
         DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION", "6.0.1");
        capabilities.setCapability("deviceName", "af4b25b6");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability("appPackage", "com.viber.voip");
        capabilities.setCapability("appActivity", ".WelcomeActivity");

         System.out.println("creating the driver");
         appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
         System.out.println("Appium Driver is created");

     }


    @Test
    public void testViber() throws Exception {

        List<WebElement>  listItemsWithContacts = appiumDriver.findElements(MobileBy.id("com.viber.voip:id/from"));
        foundAndClickOnFirstContact(listItemsWithContacts);
        Thread.sleep(2000);
//        sentDefaultMessage();
//        Thread.sleep(1000);
//        clickOnPhisicalBackButton();
//        Thread.sleep(1000);
//        clickOnPhisicalBackButton();
//        Thread.sleep(2000);
//        clickOnButtonForNewMessage();
//        Thread.sleep(9000);
//        clickOnFieldForSearch();
//        Thread.sleep(2000);
//        List <WebElement> contactItemList = appiumDriver.findElements(MobileBy.id("com.viber.voip:id/name"));
//        Thread.sleep(2000);
//         listWithContacts(contactItemList);
//         sentDefaultMessage();

//        clickOnPhisicalBackButton();
//        Thread.sleep(1000);
//        clickOnPhisicalBackButton();
//        Thread.sleep(1000);
//        clickOnCalls();
//        Thread.sleep(2000);
//        clickOnSearch();
//        Thread.sleep(2000);
//        clickOnType();
//        Thread.sleep(2000);
//        List<WebElement>  listOfContact = appiumDriver.findElements(MobileBy.id("com.viber.voip:id/name"));
//        findContactInSearchtList(listOfContact);
//        Thread.sleep(2000);

//        clickOnMore();
//        Thread.sleep(1000);
        scrolling();
//        Thread.sleep(2000);
//        clickOnAddContact();
//        Thread.sleep(2000);
//        typeNumber();
//        Thread.sleep(2000);
//        clickContinue();
//        Thread.sleep(3000);
//        clickMess();
//        clickDone();


//        List <WebElement> moreList = appiumDriver.findElements(MobileBy.id("com.viber.voip:id/titleView"));
//        Thread.sleep(2000);
//        findAbout(moreList);

        /*Thread.sleep(2000);
        clickOnMenuSearch();
        Thread.sleep(3000);
        sentKeysMenuSearchField();
        Thread.sleep(2000);
        List<WebElement> listWithItems = appiumDriver.findElements(MobileBy.id("com.viber.voip:id/title"));
        findElementFromContactMainMenu(listWithItems);*/

    }
    private void findElementFromContactMainMenu( List <WebElement> listWithItems) throws Exception{

        System.out.println("List size is " + listWithItems.size());
        int flag=0;
        while (true){
            for(int i=0;i<listWithItems.size();i++){
                //System.out.println("Print " + i + "Element in list "+ listWithItems.get(i).getText());
                if(listWithItems.get(i).getText().equals("Dajana Georgievska"))
                {
                    listWithItems.get(i).click();
                    Thread.sleep(4000);
                    sentDefaultMessage();
                    flag=1;
                    WebElement title = appiumDriver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.View/android.widget.TextView[1]"));
                    assert title.getText().equals("Dajana Georgievska");
                    break;
                }
            }
            if (flag==0){
                scrolling();
            }
            if(flag==1){
                break;
            }
            listWithItems = appiumDriver.findElements(MobileBy.id("com.viber.voip:id/title"));
            System.out.println("One while is done ");
        }




    }
    private void clickOnMenuSearch() throws Exception{
        WebElement clickOnSearch = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/menu_search"));
        clickOnSearch.click();
//        Thread.sleep(1000);
//        WebElement back = appiumDriver.findElement(MobileBy.AccessibilityId("Collapse"));
//        assert back.getText();
    }
    private void sentKeysMenuSearchField(){
        WebElement sendKeysField = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/search_src_text"));
        sendKeysField.sendKeys(" ");
        clickOnPhisicalBackButton();

    }
    private void findAbout(List <WebElement> moreList) throws Exception{
        int flag = 0;
        while (true){
            Thread.sleep(3000);
            System.out.println(moreList.size());
            for(int i = 0; i < moreList.size(); i++){
                System.out.println(i + " in MeniList is " + moreList.get(i).getText());
                if(moreList.get(i).getText().equals("About and FAQ")){
                    moreList.get(i).click();
                    flag = 1;
                    System.out.println("found");
                    break;
                }
            }
            if (flag == 0) {
                scrolling();
            }
            if(flag == 1)
            {
                break;
            }
            flag=0;
            System.out.println("One while cicle is done");
            Thread.sleep(2000);
            moreList = appiumDriver.findElements(MobileBy.id("com.viber.voip:id/titleView"));

        }
    }

    private void foundAndClickOnFirstContact(List<WebElement> listItemsWithContacts) throws Exception {
        int flag = 0;
        while(true) {
            System.out.println("Numbers of contacts are " + listItemsWithContacts.size());
            for (int i = 0; i < listItemsWithContacts.size(); i++) {
                System.out.println("Contact with number " + i + " is " + listItemsWithContacts.get(i).getText());
                if (listItemsWithContacts.get(i).getText().equals("Zahariev Aleksandar")) {
                    System.out.println("Our Contact is with number " + i + " is " + listItemsWithContacts.get(i).getText());
                    listItemsWithContacts.get(i).click();
                    flag = 1;
                    break;
                }
            }
            System.out.println("Flag1 ==  " + flag);

            if (flag == 0) {
                scrolling();
            }
            System.out.println("Flag2  ==  " + flag);

            if (flag ==1) {
                System.out.println("SYSO == pred break   ");

                break;
            }
            System.out.println("Flag3 ==  " + flag);

            flag=0;
            System.out.println("One while cicle is done");
        }
    }

    private void clickOnAbout() throws Exception {
        WebElement ace = appiumDriver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[7]"));
        ace.click();
//        WebElement ace = appiumDriver.findElement(MobileBy.className("android.view.ViewGroup"));
//        ace.click();
    }

    private void listWithContacts(List<WebElement> contactItemList) throws Exception {
        int flag=0;
        while (true) {
            Thread.sleep(2000);
            System.out.println("Contact: Contact Numbers of contacts are " + contactItemList.size());
            for (int i = 0; i < contactItemList.size(); i++) {
                Thread.sleep(2000);
                System.out.println("Contact: Contact with number " + i + " is " + contactItemList.get(i).getText());
                if (contactItemList.get(i).getText().equals("Dajana Georgievska")) {
                    System.out.println("Contact: Our Contact is with number " + i + " is " + contactItemList.get(i).getText());
                    contactItemList.get(i).click();
                    flag = 1;
                }
            }

            if (flag == 0) {
                scrolling();
//            System.out.println("Item is not in the list ");
            }
            if(flag==1){
                break;
            }
            contactItemList = appiumDriver.findElements(MobileBy.id("com.viber.voip:id/name"));
        }
    }

    private boolean contactCall(List<WebElement> contactList) throws Exception {
        int flag=0;
        System.out.println("Contact: Contact Numbers of contacts are " + contactList.size());
        for (int i = 0; i < contactList.size(); i++) {
            Thread.sleep(2000);
            System.out.println("Contact: Contact with number " + i + " is " + contactList.get(i).getText());
            if (contactList.get(i).getText().equals("Zahariev Aleksandar")) {
                System.out.println("Contact: Our Contact is with number " + i + " is " + contactList.get(i).getText());
                contactList.get(i).click();
                flag=1;
                return true;
            }

        }

        if(flag==0){
            System.out.println("Item is not in the list ");
            return false;
        }
        return false;
    }

    private void clickOnFieldForSearch(){
        WebElement messageField = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/search_src_text"));
        messageField.click();
        messageField.sendKeys("");
        clickOnPhisicalBackButton();
    }

    private void clickContinue(){
        WebElement conti = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/continue_btn"));
        conti.click();
    }
    private void clickDone(){
        WebElement conti = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/done"));
        conti.click();
    }
    private void clickMess(){
        WebElement conti = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/message_button"));
        conti.click();
    }

    private void typeNumber(){
        WebElement num = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/phone_number"));
        num.click();
        num.sendKeys("00359889095639");
    }

    private void clickOnButtonForNewMessage() throws Exception {
        tap(630,955);
        System.out.println("Button is clicked");
    }


    private void tap(int x,int y) throws Exception {
        Runtime.getRuntime().exec("adb shell input tap " + x + " " + y);
    }


    private void scrolling() throws Exception {
        System.out.println("Scrolling...");
        Thread.sleep(3000);
        TouchAction touchAction = new TouchAction(appiumDriver);
        PointOption pointStart = PointOption.point(415, 766);
        PointOption pointEnd = PointOption.point(360, 60);
        touchAction.press(pointStart);
        touchAction.moveTo(pointEnd);
        touchAction.release();
        touchAction.perform();
        System.out.println("Scrolling is done");
    }

    private void sentDefaultMessage() throws Exception {

       Thread.sleep(2000);
       WebElement fieldForOpenKeyboard = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/send_text"));
       fieldForOpenKeyboard.click();
       fieldForOpenKeyboard.sendKeys("Bato so praves");
       WebElement buttonForSend = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/btn_send_icon_1"));
       buttonForSend.click();

    }

    private void clickOnMore(){
        WebElement more = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/bottom_nav_tab_3"));
        more.click();
    }
    private void clickOnAddContact() throws Exception {
        WebElement ace = appiumDriver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[7]"));
        ace.click();
//        WebElement ace = appiumDriver.findElement(MobileBy.className("android.view.ViewGroup"));
//        ace.click();
    }

     private boolean findContactInSearchtList(List<WebElement> listOfContact) throws Exception {
         int flag = 0;
         while(true) {
             System.out.println("Numbers of search contact are " + listOfContact.size());
             for (int i = 0; i < listOfContact.size(); i++) {
                 System.out.println("Contact with number " + i + " is " + listOfContact.get(i).getText());
                 if (listOfContact.get(i).getText().equals("Zahariev Aleksandar")) {
                     //System.out.println("Our Contact is with number " + i + " is " + listOfContact.get(i).getText());
//                     listOfContact.get(i).click();
                     flag = i;
                     break;
                 }
             }
             List<WebElement>  contactList = appiumDriver.findElements(MobileBy.id("com.viber.voip:id/callButtonView"));
             if(flag>0){
                 contactList.get(flag).click();
                 return true;
             }
             else
             {
                 return false;
             }
             //System.out.println("Flag1 ==  " + flag);

//             if (flag == 0) {
//                 scrolling();
//             }
             //System.out.println("Flag2  ==  " + flag);

//             if (flag ==1) {
//                 System.out.println("SYSO == pred break   ");
//                 break;
//             }
//             System.out.println("Flag3 ==  " + flag);

//             flag=0;
//             System.out.println("One while cicle is done");

         }
     }

    private void clickOnPhisicalBackButton(){
        appiumDriver.navigate().back();
        //System.out.println("Back button is clicked ");
    }

    private void clickOnCalls(){
        WebElement callButton = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/bottom_nav_tab_2"));
        callButton.click();
    }


    private void clickOnSearch() throws InterruptedException {
        WebElement searchButton = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/menu_search"));
        searchButton.click();
    }

    private void clickOnType(){
        WebElement sendKeys = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/search_src_text"));
        sendKeys.sendKeys("aleksandar");
        clickOnPhisicalBackButton();
    }
    private void callContact(){
        WebElement call = appiumDriver.findElement((MobileBy.id("com.viber.voip:id/callButtonView")));
        //call.click();
        System.out.println("Call bato");
    }
    private void callEnd(){
        WebElement cancel = appiumDriver.findElement(MobileBy.id("com.viber.voip:id/phone_end_call"));
        cancel.click();
    }


    @AfterClass
    public void teardown() {
        //close the app
        // driver.quit();
    }
}