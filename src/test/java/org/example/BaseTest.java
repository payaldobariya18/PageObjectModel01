package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BrowserManager {
   @BeforeMethod
   public void setup()
   {
       openBrowser();
   }
  @AfterMethod
   public void tearDown()
   {
       closeBrowser();
   }


}
