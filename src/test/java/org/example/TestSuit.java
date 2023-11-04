package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{

   HomePage homePage = new HomePage();
   RegisterPage registerPage=new RegisterPage();

   RegisterResultPage registerResultPage=new RegisterResultPage();

   LogIn logIn = new LogIn();
   CategoriesPage categoriesPage=new CategoriesPage();
    EmailResultPage emailResultPage = new EmailResultPage();

   @Test  (priority = 1)
   public void verifyUserShouldAbleToRegisterSuccessfully() {
       //click on registerbutton
       homePage.clickOnRegisterButton();
       //verify user is on register page
       registerPage.verifyUserIsOnRegistrationPage();
       //enter registration details
       registerPage.enterRegistraionDetails();
       //verify user registred successfully
       registerResultPage.verifyUserRegistraionSuccessfully();


   }
    @Test (priority = 2)
    public void verifyUserShouldLogInSuccessfully() {
        //click on login button
        homePage.clickOnLoginButton();
        //enter login details
        logIn.verifyUserShouldBeAbleTOLogIn();

    }
   @Test
    public void verifyRegisteredUserShouldReferAProductTOFriend(){

       //User should logged in and click on login button
        homePage.clickOnLoginButton();
        //enter login details
        logIn.verifyUserShouldBeAbleTOLogIn();
       //click on electronics button
        homePage.clickOnElectronics();
        //click on camera&photo
        categoriesPage.clickOnCameraAndPhoto();
       //click on Digital photo
        categoriesPage.clickOnDigitalCamera();
       //click on sent a mail button to reffering product to friend
        categoriesPage.SendAMailToFriendForRefferingProduct();
       //sent a message successfully
      emailResultPage.verifyUserSentMessageSuccessfully();













    }




}

