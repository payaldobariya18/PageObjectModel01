package org.example;

import org.openqa.selenium.By;

public class LogIn extends Utils {

    public void verifyUserShouldBeAbleTOLogIn() {
        clickonelements(By.className("ico-login"));//click on login button
        System.out.println(email);
        typetext(By.xpath("//input[@id=\"Email\"]"),email);//enter email adress

        typetext(By.className("password"),password);//enter password

        clickonelements(By.xpath("//button[contains(@class, 'login-button')]")); //click on login button for login successfully and on screen it shows logout


    }
}