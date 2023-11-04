package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class HomePage extends Utils{

    public void clickOnRegisterButton()
    {
        clickonelements(By.linkText("Register"));
    }
    public void clickOnLoginButton()
    {
        clickonelements(By.className("ico-login"));//click on login button

    }
    public void clickOnElectronics()
    {

        clickonelements(By.xpath("//div[@class = 'header-menu']/ul[contains(@class,'notmobile')]/li/a[@href='/electronics']"));//click on electronics

    }





}
