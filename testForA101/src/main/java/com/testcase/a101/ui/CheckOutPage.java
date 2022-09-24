package com.testcase.a101.ui;

import com.testcase.a101.utility.ReadFromFile;
import com.testcase.a101.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {

    WebDriver driver;
    Utility utility;

//    String city = ReadFromFile.readConfigProperties("city");
//    String townShip = ReadFromFile.readConfigProperties("townShip");
//    String district = ReadFromFile.readConfigProperties("district");

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utility=new Utility(driver);
    }


    @FindBy(css = "a[title=\"Yeni adres oluştur\"]")
    WebElement createNewAddress;

    @FindBy(name = "title")
    WebElement addressTitle;

    @FindBy(name = "first_name")
    WebElement firstName;

    @FindBy(name = "last_name")
    WebElement lastName;

    @FindBy(name = "phone_number")
    WebElement phoneNumber;

    @FindBy(name = "city")
    WebElement city;

    @FindBy(name = "township")
    WebElement townShip;

    @FindBy(name = "district")
    WebElement district;

    @FindBy(name = "line")
    WebElement addressDetail;

    @FindBy(name = "postcode")
    WebElement postCode;

    @FindBy(xpath = "//button[contains(text(),'KAYDET')]")
    WebElement saveButton;

    @FindBy(xpath = "//span[contains(text(),'Sendeo')]")
    WebElement chooseCargo;

    @FindBy(xpath = "//button[contains(text(),'Kaydet ve Devam Et')]")
    WebElement submitButton;

    @FindBy(xpath = "//span[contains(text(),'Siparişi Tamamla')]")
    WebElement orderComplete;

    @FindBy(xpath = "//span[contains(text(),'Lütfen kart seçin veya kart bilgisi girin.')]")
    WebElement verifyOrderComplete;

    public void clickCreateNewAddress(){
        utility.waitForElementPresent(createNewAddress);
        createNewAddress.click();
    }

    public void fillAddressTitle(){
        utility.waitForElementPresent(addressTitle);
        addressTitle.sendKeys(utility.randomTitle());
    }

    public void fillFirstName(){
        utility.waitForElementPresent(firstName);
        firstName.sendKeys(ReadFromFile.readConfigProperties("firstName"));
    }

    public void fillLastName(){
        utility.waitForElementPresent(lastName);
        lastName.sendKeys(ReadFromFile.readConfigProperties("lastName"));
    }

    public void fillPhoneNumber(){
        utility.waitForElementPresent(phoneNumber);
        phoneNumber.sendKeys(ReadFromFile.readConfigProperties("phoneNumber"));
    }

    public void selectCity(){
        utility.waitForElementPresent(city);
        Select select = new Select(city);
        select.selectByValue(ReadFromFile.readConfigProperties("cityValue"));
    }

    public void selectTownShip(){
        utility.waitForElementPresent(townShip);
        Select select = new Select(townShip);
        select.selectByValue(ReadFromFile.readConfigProperties("townShipValue"));
    }

    public void selectDistrict(){
        utility.waitForElementPresent(district);
        Select select = new Select(district);
        select.selectByValue(ReadFromFile.readConfigProperties("districtValue"));
    }

    public void fillAddressDetail(){
        utility.waitForElementPresent(addressDetail);
        addressDetail.sendKeys(utility.randomAddress());
    }

    public void fillPostCode(){
        utility.waitForElementPresent(postCode);
        postCode.sendKeys(utility.randomZipCode());
    }

    public void clickSaveButton(){
        utility.waitForElementPresent(saveButton);
        saveButton.click();
    }

    public void chooseCargoField(){
        utility.waitForElementPresent(chooseCargo);
        chooseCargo.click();
    }

    public void clickSubmitButton(){
        utility.waitForElementPresent(submitButton);
        submitButton.click();
    }

    public void clickOrderComplete(){
        utility.waitForElementPresent(orderComplete);
        orderComplete.click();
    }

    public boolean verifyMessage(){
        utility.waitForElementPresent(verifyOrderComplete);
        if (verifyOrderComplete.getText().equals("Lütfen kart seçin veya kart bilgisi girin.")){
            System.out.println("You are in Payment Screen");
            return true;
        }else {
            return false;
        }
    }

    public void checkOutPage(){
        clickCreateNewAddress();
        fillAddressTitle();
        fillFirstName();
        fillLastName();
        fillPhoneNumber();
        selectCity();
        utility.sleep(2);
        selectTownShip();
        utility.sleep(2);
        selectDistrict();
        fillAddressDetail();
        fillPostCode();
        clickSaveButton();
        chooseCargoField();
        utility.sleep(3);
        clickSubmitButton();
        utility.sleep(2);
        clickOrderComplete();
    }
}
