package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailResultPage extends Utils {
    String expectedSentMessage = "Your message has been sent.";
    //verify user should sent message or not
    public void verifyUserSentMessageSuccessfully() {

        // Assert.assertEquals(getTextFromElement(By.className("result")),"Your message has been sent.","Not showing correct message");
        String actualSentMessage = getTextFromElement(By.className("result"));
        Assert.assertEquals(actualSentMessage, expectedSentMessage, "Your message not sent");
        System.out.println(actualSentMessage);

    }





    }
