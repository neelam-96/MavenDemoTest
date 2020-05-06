package org.tts.selenium.driver.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverchromeUtil {

        public String baseUrl = "https://www.facebook.com/";
        String driverPath = "D:\\chromedirever\\chromedriver.exe";
        public WebDriver driver ;

        @BeforeTest
        public void launchBrowser() {
            System.out.println("launching firefox browser");
            System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver();
            driver.get(baseUrl);
        }
        @Test
        public void verifyHomepageTitle() {
            String expectedTitle = "Facebook – log in or sign up";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
        }
        @AfterTest
        public void terminateBrowser(){
            driver.close();
        }

    }

