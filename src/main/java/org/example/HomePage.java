package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class HomePage extends Utils{
     String expectedSentMessage = "Your message has been sent.";
    public void clickOnRegisterButton()
    {
        clickonelements(By.linkText("Register"));
    }
    public void clickOnElectronics()
    {

      clickonelements(By.xpath("//div[@class = 'header-menu']/ul[contains(@class,'notmobile')]/li/a[@href='/electronics']"));//click on electronics

    }
    public void clickOnCameraAndPhoto(){

        clickonelements(By.xpath("//img[@alt='Picture for category Camera & photo']"));//click on camera@photo

    }
    public void clickOnDigitalCamera(){

        clickonelements(By.xpath("//div[@class=\"picture\"]/a[@href=\"/leica-t-mirrorless-digital-camera\" ]"));
    }
    public void clickOnEmailAFriend(){

        clickonelements(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));//click on Email a friend button

    }
    public void enterAFriendEmail(){

        typetext(By.id("FriendEmail"),"mirakhan@gmail.com"); //Enter friend's email

    }
    public void enterPersonalMessage(){

        typetext(By.id("PersonalMessage"),"half price sale");

    }
    public void clickOnASendMailButton(){

        clickonelements(By.xpath("//button[@name=\"send-email\"]"));
    }

    public void verifyUserSentMessageSuccessfully(){

       // Assert.assertEquals(getTextFromElement(By.className("result")),"Your message has been sent.","Not showing correct message");
       String actualSentMessage = getTextFromElement(By.className("result"));
       Assert.assertEquals(actualSentMessage,expectedSentMessage,"Your message not sent");
        System.out.println(actualSentMessage);
    }
}
