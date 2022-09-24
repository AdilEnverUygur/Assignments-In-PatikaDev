package com.testcase.a101.ui;

import com.testcase.a101.utility.ReadFromFile;
import com.testcase.a101.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;
    Utility utility;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utility=new Utility(driver);
    }

    @FindBy(css = "button[data-pk=\"18864\"]")
    WebElement addToCart;

    @FindBy(css = "a[class=\"go-to-shop\"]")
    WebElement viewCart;

    @FindBy(partialLinkText = "Sepeti Onay")
    WebElement confirmCart;

    @FindBy(xpath = "//a[contains(text(),'ÜYE OLMADAN DEVAM ET')]")
    WebElement continueWithoutRegis;

    @FindBy(name = "user_email")
    WebElement userEmail;

    @FindBy(xpath = "//button[contains(text(),'DEVAM ET')]")
    WebElement submitContinueButton;

    public void clickAddToCart(){
        utility.waitForElementPresent(addToCart);
        addToCart.click();
    }

    public void clickViewCart(){
        utility.waitForElementPresent(viewCart);
        viewCart.click();
    }

    public void clickConfirmCart(){
        utility.waitForElementPresent(confirmCart);
        confirmCart.click();
    }

    public void clickContinueWithoutRegis(){
        utility.waitForElementPresent(continueWithoutRegis);
        continueWithoutRegis.click();
    }

    public void enterUserEmail(){
        utility.waitForElementPresent(userEmail);
        userEmail.sendKeys(ReadFromFile.readConfigProperties("userEmail"));
    }

    public void clickContinueButton(){
        utility.waitForElementPresent(submitContinueButton);
        submitContinueButton.click();
    }

    public void cartPageActions(){
        clickAddToCart();
        clickViewCart();
        clickConfirmCart();
        clickContinueWithoutRegis();
        enterUserEmail();
        clickContinueButton();
    }
}
