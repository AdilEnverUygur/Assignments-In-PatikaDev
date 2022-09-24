package com.testcase.a101test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;

public class BasePage {
    public static WebDriver driver;
    //Set up driver to open browser
    public static void setUpBrowser(String url) {
        String systemName = System.getProperty("os.name");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        if (systemName.contains("Mac")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(url);
        } else if (systemName.contains("Windows")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(url);
        } else {
            WebDriverManager.chromedriver().setup();
            chromeOptions.addArguments(Arrays.asList("--headless", "--dosan-gpu"));
            chromeOptions.addArguments("window-size=1920,1080");
            driver = new ChromeDriver(chromeOptions);
            driver.manage().deleteAllCookies();
            driver.get(url);
            System.out.println("Browser has been setup");
        }
    }


        //method for close browser
        public static void teardown ()
        {
            driver.close();
            System.out.println("driver closed");
            driver.quit();
        }
    }
