package com.test.viber.tests;

import org.testng.annotations.Test;

public class TestExample extends BaseClass{

    @Test
    public void checkAppName(){
        homeScreen.checkTitleName("Viber");
    }

    @Test
    public void openCamera(){
        homeScreen.openCamera();
    }

    @Test
    public void addMessangeInNotes(){
        homeScreen.clickOnItems("My Notes");
        myNotesScreen.checkPageName("My Notes");
        myNotesScreen.typeMessange("automation message");
        myNotesScreen.typeMessange("Inter");
    }

    @Test
    public void openNotes(){
        homeScreen.clickOnMoreButton();
        moreScreen.clickOnMyNotesButton();
        myNotesScreen.clickOnTypeMessange();
        myNotesScreen.typeMessange("poraka 1");
        myNotesScreen.clickOnSendButton();
        utils.clickBackButton();
    }

    @Test
    public void addPhotoInNotes(){
        homeScreen.clickOnItems("My Notes");
        myNotesScreen.clickOnGallery();
        myNotesScreen.selectLastPhoto();
        myNotesScreen.clickOnSendButton();
    }

    @Test
    public void removeFirstMessangeInMyNotes() throws Exception {
        utils.scrollToAnElementByText("My Notes");
        homeScreen.clickOnItems("My Notes");
        myNotesScreen.clickOnRemoveMessange();
        utils.clickBackButton();
    }

    @Test
    public void clearAllNotes(){
        homeScreen.clickOnItems("My Notes");
        myNotesScreen.checkPageName("My Notes");
        utils.clickOnThreePoints();
        utils.clickOnChatInfo();
        myNotesScreen.clickOnDeleteNotes();
        myNotesScreen.clickOnDeleteButton();
    }

    @Test
    public void sendMessenge(){
        utils.scrollToAnElementByText("Zahariev Aleksandar");
        homeScreen.clickOnItems("Zahariev Aleksandar");
        contactScreen.sendKays("Test sending a message");
        //contactScreen.clickOnSendButton();
    }

    @Test
    public void callAnyContact() throws InterruptedException {
        utils.scrollToAnElementByText("Andrej Zahariev");
        homeScreen.clickOnItems("Andrej Zahariev");
        userChatScreen.call();
        Thread.sleep(5000);
        activeCallScreen.callSpeaker("Off");
        Thread.sleep(5000);
        activeCallScreen.endCall();
    }

    @Test
    public void videoCallAnyContact() throws InterruptedException {
        utils.scrollToAnElementByText("Andrej Zahariev");
        homeScreen.clickOnItems("Andrej Zahariev");
        userChatScreen.videoCall();
        Thread.sleep(5000);
        activeCallScreen.videoSpeaker("Off");
        Thread.sleep(5000);
        activeCallScreen.endCall();
    }

    @Test
    public void addContact(){
        homeScreen.clickOnCallsButton();
        callsScreen.clickOnAddContactIcon();
        addContactScreen.checkLabelName("Add contact");
        addContactScreen.AddNumbers("00359889095639");
        addContactScreen.clickOnContinueButton();
        //saveNewContact.clickOnSaveButton();
        assert profileContactScreen.getTitle().equals("Dajana Georgievska");
    }

    @Test
    public void typeNumber(){
        homeScreen.clickOnCallsButton();
        callsScreen.clickOnKeyboardNumbersIcon();
        keyboardScreen.typeNumber("0038975311450");
    }

    @Test
    public void editProfil() throws Exception {
        homeScreen.clickOnMoreButton();
        moreScreen.clickOnEdit();
        editProfilScreen.clickOnDate();
        editProfilScreen.izberiDen("15");
        editProfilScreen.izberiMesec("Jan");
        editProfilScreen.izberiGodina("1993");
        editProfilScreen.clickOnOk();

        /*assert editProfilScreen.getTextFromName().equals("Andrej");
        editProfilScreen.clearEmailField();
        editProfilScreen.renameMail("andrej.zahariev@yahoo.com");
        editProfilScreen.clickOnVerificationButton();*/
    }

    @Test
    public void openSettings(){
        homeScreen.clickOnMoreButton();
        moreScreen.clickOnSettings();
        settingsScreen.printListOfItems();
    }

    @Test
    public void setNotification() throws InterruptedException {
        homeScreen.clickOnMoreButton();
        moreScreen.clickOnSettings();
        settingsScreen.clickOn("Notifications");
        notificationsScreen.showMessagePreview(true);
        notificationsScreen.contactJoinedViber(true);
        notificationsScreen.getBirthdayNotifications(true);
        notificationsScreen.showExploreNotifications(false);
        notificationsScreen.showBirthdaysReminders(false);
        utils.scrollToAnElementByText("Vibrate when ringing");
        notificationsScreen.vibrateWhenRinging(true);
    }

    @Test
    public void changeLanguage() {
        homeScreen.clickOnMoreButton();
        moreScreen.clickOnSettings();
        settingsScreen.clickOn("General");
        generalScreen.clickOnLanguage();
        utils.scrollToAnElementByText("Български");
        generalScreen.selectNewLanguage("Български");
        generalScreen.clickOnSaveButton();
    }


    @Test
    public void clearMessangeInPoliceGroup() throws Exception {
        utils.scrollToAnElementByText("Стоп Полиција-Stop Police");
        homeScreen.clickOnItems("Стоп Полиција-Stop Police");
        contactScreen.clickOnJumpButtom();
        Thread.sleep(5000);
        utils.clickBackButton();
    }

    @Test
    public void changeThemeOnDarkBlue() throws Exception {
        homeScreen.clickOnMoreButton();
        moreScreen.clickOnSettings();
        settingsScreen.clickOn("Appearance");
        appearanceScreen.clickOnDarkBlueButton();
        Thread.sleep(2000);
        utils.clickBackButton();
    }

    @Test
    public void changeThemeToBlack() throws Exception {
        homeScreen.clickOnMoreButton();
        moreScreen.clickOnSettings();
        settingsScreen.clickOn("Appearance");
        appearanceScreen.clickOnBlackButton();
        Thread.sleep(2000);
        utils.clickBackButton();
    }

    @Test
    public void openInviteFriends(){
        homeScreen.clickOnMoreButton();
        utils.scrollToAnElementByText("Invite friends");
        moreScreen.clickOnInviteFriends();
        utils.clickBackButton();
    }

    @Test
    public void sendLastPhotoFromPhoneToDajana() throws InterruptedException {
        //homeScreen.printText();
        //homeScreen.clickOnItems("Andrej \uD83D\uDC95");
        homeScreen.clickOnItems("Dajana Georgievska");
        userChatScreen.clickOnGalleryButton();
        userChatScreen.clickOnFirstPhotoFromGallery();
        userChatScreen.clickOnSendButton();
        Thread.sleep(2000);
        utils.clickBackButton();
    }

    @Test
    public void sendMessangeTo() throws Exception{
        homeScreen.clickOnItems("Andrej Zahariev");
        userChatScreen.clickOnTextField();
        userChatScreen.sendText("Odi da jades");
        Thread.sleep(2000);
        userChatScreen.clickOnSendButton();
        utils.clickBackButton();
    }

    @Test
    public void checkStatus(){
        utils.scrollToAnElementByText("Andrej Zahariev");
        homeScreen.clickOnItems("Andrej Zahariev");
        userChatScreen.checkStatus();
        utils.clickBackButton();
    }

    @Test
    public void editContact(){
        homeScreen.clickOnCallsButton();
        callsScreen.clickOnAddContactIcon();
        addContactScreen.checkLabelName("Add contact");
        addContactScreen.AddNumbers("00359889095639");
        addContactScreen.clickOnContinueButton();
        profileContactScreen.clickOnEditContact();
        editContactScreen.checkTitleName("Edit contact");
        editContactScreen.changeName("Dajana Georgievska");
        editContactScreen.clickOnOrganisation();
        editContactScreen.enterCompanyName("Splentdent");
        editContactScreen.enterTitleName("DDM");
        /*editContactScreen.changeMobileType("Work");
        editContactScreen.changeMobilePhone("075311450");
        editContactScreen.changeEmailType("Other");
        editContactScreen.enterMail("aleksandar.zahariev08@gmail.com");
        editContactScreen.addAnotherField("IM");
        editContactScreen.enterAdress("Metodija Shatorov Sharlo 25");*/
    }

    @Test
    public void downloadFreeSticker() throws InterruptedException {
        homeScreen.clickOnMoreButton();
        moreScreen.clickOnItem("Sticker Market");
        Thread.sleep(2000);
        //stickerMarketScreen.clickOnFreeSticker();
        utils.scrollToAnElementByText("Dating Life");
        stickerMarketScreen.clickOnFoundSticker("Dating Life");
    }
}
