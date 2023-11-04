package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class BrowserManager extends Utils {
    String browserName = "firefox";

    public  void openBrowser()
    {
        if (browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            // setting for chrome browser run
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
            // setting for chrome browser run
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge"))
        {
            System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
            // setting for chrome browser run
            driver = new EdgeDriver();
        } else
        {
            System.out.println("Your browser name is not match:" + browserName);
        }

        // implicitly wait for each command
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // maximize full web screen
        driver.manage().window().maximize();
        //open url
        driver.get("https://demo.nopcommerce.com/");

    }
        public void closeBrowser()
       {
        driver.quit();
       }
}
