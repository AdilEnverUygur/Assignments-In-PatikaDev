package com.testcase.a101.utility;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

    WebDriver driver;

    private int timeOut = Integer.parseInt(ReadFromFile.readConfigProperties("timeOut"));

    public Utility(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementPresent(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Random create title
    public String randomTitle(){
        Faker faker = new Faker();
        return faker.name().title();
    }

    //Random create street address
    public String randomAddress(){
        Faker faker=new Faker();
        return faker.address().streetAddress();
    }

    //Random create zipcode
    public String randomZipCode(){
        Faker faker=new Faker();
        return faker.number().digits(5);
    }

    public void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
