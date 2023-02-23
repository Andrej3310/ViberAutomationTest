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
    public void clearAllNotes(){
        homeScreen.clickOnItems("My Notes");
        utils.clickOnThreePoints();
        utils.clickOnChatInfo();
        myNotesScreen.clickOnDeleteNotes();
    }



    @Test
    public void sendMessenge(){
        utils.scrollToAnElementByText("Zahariev Aleksandar");
        homeScreen.clickOnItems("Zahariev Aleksandar");
        contactScreen.sendKays("ja ovoa otvoriv za da kucam ne gi zimaj za ozbilno porakite na viber ako treba ke te trazam na dr mesto :D");
        //contactScreen.clickOnSendButton();
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
//        keyboardScreen.clickOnEightButton();
//        keyboardScreen.clickOnEightButton();
//        keyboardScreen.clickOnFourButton();
//        keyboardScreen.clickOnSixButton();
//        keyboardScreen.clickOnGreenButton();
        assert keyboardScreen.getNineWords().equals("WXYZ");
    }


    @Test
    public void editProfil() throws Exception {
        homeScreen.clickOnMoreButton();
        moreScreen.clickOnEdit();
        editProfilScreen.clickOnDate();
        editProfilScreen.izberiData("30", "Jun", "1996");
/*


        //assert editProfilScreen.getTextFromName().equals("Andrej");
        editProfilScreen.clearEmailField();
        editProfilScreen.renameMail("andrej.zahariev@yahoo.com");
        editProfilScreen.clickOnVerificationButton();*/
    }
    @Test
    public void openSettings(){
        homeScreen.clickOnMoreButton();
        moreScreen.clickOnSettings();
        settingsScreen.getListElement().size();
        for(int i=0; i<settingsScreen.getListElement().size(); i++){
            System.out.println(i+1+". " + settingsScreen.getListElement().get(i).getText());
        }
        System.out.println(settingsScreen.getListElement().size());
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
    public void clearMessangeInPoliceGroup() throws Exception {
        homeScreen.clickOnItems("Стоп Полиција-Stop Police");
        contactScreen.clickOnJumpButtom();
        Thread.sleep(5000);
        utils.clickBackButton();
    }

    @Test
    public void removeMessangeInMyNotes() throws Exception {
        utils.scrollToAnElementByText("My Notes");
        homeScreen.clickOnItems("My Notes");
        myNotesScreen.clickOnRemoveMessange();
        Thread.sleep(2000);
        utils.clickBackButton();
    }

    @Test
    public void changeThemeOnDarkBlue() throws Exception {
        homeScreen.clickOnMoreButton();
        moreScreen.clickOnSettings();
        settingsScreen.clickOnAppearanceButton();
        appearanceScreen.clickOnDarkBlueButton();
        Thread.sleep(2000);
        utils.clickBackButton();
    }
    @Test
    public void changeThemeToBlack() throws Exception {
        homeScreen.clickOnMoreButton();
        moreScreen.clickOnSettings();
        settingsScreen.clickOnAppearanceButton();
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
    public void SendLastPhotoFromPhoneToDajana() throws InterruptedException {
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
    public void SendMessangeTo() throws Exception{
        homeScreen.clickOnItems("Andrej \uD83D\uDC95");
        userChatScreen.clickOnTextField();
        userChatScreen.sendText("Odi da jades");
        Thread.sleep(2000);
        userChatScreen.clickOnSendButton();

        utils.clickBackButton();
    }
    @Test
    public void CheckStatus(){
        utils.scrollToAnElementByText("Zahariev Aleksandar");
        homeScreen.clickOnItems("Zahariev Aleksandar");
        if (userChatScreen.checkStatus().equals("Online")){
            System.out.println("Korisnikot e Online");
        }
        else
            System.out.println("Korisnikot ne e online");
        utils.clickBackButton();
    }

    @Test
    public void editContact(){
        homeScreen.clickOnCallsButton();
        callsScreen.clickOnAddContactIcon();
        addContactScreen.checkLabelName("Add contact");
        addContactScreen.AddNumbers("0038978708308");
        addContactScreen.clickOnContinueButton();
        profileContactScreen.clickOnEditContact();
        editContactScreen.checkTitleName("Edit contact");
        /*editContactScreen.changeName("Zahariev Andrej Sluzben");
        editContactScreen.clickOnOrganisation();
        editContactScreen.enterCompanyName("Totality Skopje");
        editContactScreen.enterTitleName("QA");
        editContactScreen.changeMobileType("Work");
        editContactScreen.changeMobilePhone("075311450");
        editContactScreen.changeEmailType("Other");
        editContactScreen.enterMail("aleksandar.zahariev08@gmail.com");
        editContactScreen.addAnotherField("IM");
        editContactScreen.enterAdress("Metodija Shatorov Sharlo 25");*/
    }
}
