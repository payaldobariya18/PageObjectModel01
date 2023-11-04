package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterPage extends Utils{

    public void verifyUserIsOnRegistrationPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"), "User is not on register page");
    }
   public void enterRegistraionDetails()
   {
       //System.out.println(email);
       waitForClickable(By.linkText("Register"), 10); //explicit wait

       // driver.findElement(By.id("FirstName")).sendKeys("Nick");
       typetext(By.id("FirstName"), "Nick");//enter firstname

       //driver.findElement(By.id("LastName")).sendKeys("Jonas");
       typetext(By.id("LastName"), "Jonas");//enter lastname

       Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
       selectDay.selectByValue("6"); //Dropdown Day

       Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
       selectMonth.selectByVisibleText("March");  //Dropdown Month
       //Dropdown Year
       Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
       selectYear.selectByValue("1927"); //Dropdown Year
       System.out.println(email);
       //driver.findElement(By.name("Email")).sendKeys("nickjonas" +timeStamp()+"@gmail.com");
       typetext(By.name("Email"), email); // enter email adress

       // driver.findElement(By.id("Company")).sendKeys("Dichman");
       typetext(By.id("Company"), "Dichman"); // enter companyname

       // driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
       clickonelements(By.xpath("//*[@id=\"Newsletter\"]")); //click on checkbox

       // driver.findElement(By.id("Password")).sendKeys("Test1234");
       typetext(By.id("Password"), password); //enter password

       //driver.findElement(By.name("ConfirmPassword")).sendKeys("Test1234");
       typetext(By.name("ConfirmPassword"), password); //enter confirm password

       //driver.findElement(By.id("register-button")).click();
       clickonelements(By.id("register-button"));  //click on register button




   }


}
