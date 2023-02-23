package com.test.viber.tests;

import com.test.viber.screens.*;
import com.test.viber.utils.Utils;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

     AppiumDriver appiumDriver;
     HomeScreen homeScreen;
     HomeSearchScreen homeSearchScreen;
     SearchResultScreen searchResultScreen;
     OpenUserScreen openUserScreen;
     CallsScreen callsScreen;
     AddContactScreen addContactScreen;
     MoreScreen moreScreen;
     Utils utils;
     NewMessengeScreen newMessengeScreen;
     ContactScreen contactScreen;
     SaveNewContact saveNewContact;
     ProfileContactScreen profileContactScreen;
     KeyboardScreen keyboardScreen;
     EditProfilScreen editProfilScreen;
     SettingsScreen settingsScreen;
     MyNotesScreen myNotesScreen;
     AppearanceScreen appearanceScreen;
     InviteFriendsScreen inviteFriendsScreen;
     UserChatScreen userChatScreen;
     EditContactScreen editContactScreen;


    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION", "7.0");
        capabilities.setCapability("deviceName", "af4b25b6");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability("appPackage", "com.viber.voip");
        capabilities.setCapability("appActivity", ".WelcomeActivity");

        System.out.println("creating the driver");
        appiumDriver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        System.out.println("Appium Driver is created");

        homeScreen = new HomeScreen(appiumDriver);
        homeSearchScreen = new HomeSearchScreen(appiumDriver);
        searchResultScreen = new SearchResultScreen(appiumDriver);
        openUserScreen = new OpenUserScreen(appiumDriver);
        callsScreen = new CallsScreen(appiumDriver);
        addContactScreen = new AddContactScreen(appiumDriver);
        moreScreen = new MoreScreen(appiumDriver);
        utils = new Utils(appiumDriver);
        newMessengeScreen = new NewMessengeScreen(appiumDriver);
        contactScreen = new ContactScreen(appiumDriver);
        saveNewContact = new SaveNewContact(appiumDriver);
        profileContactScreen = new ProfileContactScreen(appiumDriver);
        keyboardScreen = new KeyboardScreen(appiumDriver);
        editProfilScreen = new EditProfilScreen(appiumDriver);
        settingsScreen = new SettingsScreen(appiumDriver);
        myNotesScreen = new MyNotesScreen(appiumDriver);
        appearanceScreen = new AppearanceScreen(appiumDriver);
        inviteFriendsScreen = new InviteFriendsScreen(appiumDriver);
        userChatScreen = new UserChatScreen(appiumDriver);
        editContactScreen = new EditContactScreen(appiumDriver);
    }
}
