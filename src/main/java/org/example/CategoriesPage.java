package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CategoriesPage extends Utils {


    public void clickOnCameraAndPhoto() {

        clickonelements(By.xpath("//img[@alt='Picture for category Camera & photo']"));//click on camera@photo

    }

    public void clickOnDigitalCamera() {

        clickonelements(By.xpath("//div[@class=\"picture\"]/a[@href=\"/leica-t-mirrorless-digital-camera\" ]"));
    }

    //reffering product eo a friend
    public void SendAMailToFriendForRefferingProduct() {


        //click on Email a friend button
        clickonelements(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));
        //Enter friend's email
        typetext(By.id("FriendEmail"), "mirakhan@gmail.com");
        //write personal message
        typetext(By.id("PersonalMessage"), "half price sale");
        //click on sent mail button
        clickonelements(By.xpath("//button[@name=\"send-email\"]"));
    }

    }








