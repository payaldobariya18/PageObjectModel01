package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{

   HomePage homePage = new HomePage();
   RegisterPage registerPage=new RegisterPage();

   RegisterResultPage registerResultPage=new RegisterResultPage();

   LogIn logIn = new LogIn();

   @Test  (priority = 1)
   public void verifyuserShouldAbleToRegisterSuccessfully(){
       //click on registerbutton
       homePage.clickOnRegisterButton();
       //verify user is on register page
       registerPage.verifyUserIsOnRegistrationPage();
       //enter registration details
       registerPage.enterRegistraionDetails();
       //verify user registred successfully
       registerResultPage.verifyUserRegistraionSuccessfully();
       logIn.verifyUserShouldBeAbleTOLogIn();

   }
   @Test (priority = 2)
  public void userShouldLOgInSuccessfully() {

    logIn.verifyUserShouldBeAbleTOLogIn();

 }
 @Test (priority = 3)
  public void verfyRegisteredUserShouldAbleToReferAProductToFriendSuccessfully() {

     //click on registerbutton
     homePage.clickOnRegisterButton();
     //verify user is on register page
     registerPage.verifyUserIsOnRegistrationPage();
     //enter registration details
     registerPage.enterRegistraionDetails();
     //verify user registred successfully
     registerResultPage.verifyUserRegistraionSuccessfully();
     //click on electronics
     homePage.clickOnElectronics();
     //click on camera&photo
     homePage.clickOnCameraAndPhoto();
     //click on digital camera
     homePage.clickOnDigitalCamera();
     //click on email a friend button
     homePage.clickOnEmailAFriend();
     //enter friend email
     homePage.enterAFriendEmail();
     //enter a message
     homePage.enterPersonalMessage();
     // click on SEND EMAIL buttonn
     homePage.clickOnASendMailButton();
     //get text 'your message has been sent'
    homePage.verifyUserSentMessageSuccessfully();
 }









}
