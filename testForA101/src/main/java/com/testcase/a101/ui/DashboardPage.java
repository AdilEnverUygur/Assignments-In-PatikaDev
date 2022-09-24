package com.testcase.a101.ui;

import com.testcase.a101.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    WebDriver driver;
    Utility utility;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utility=new Utility(driver);
    }

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    WebElement acceptButton;
    @FindBy(xpath = "//a[contains(text(),'Giyim & aksesuar')]")
    WebElement clothes;

    @FindBy(xpath = "//a[contains(text(),'Dizaltı Çorap')]")
    WebElement kneeHighSocks;

    @FindBy(xpath = "//h3[contains(text(),'Penti Kadın 50 Denye Pantolon Çorabı Siyah')]")
    WebElement blackSocks;

    @FindBy(xpath = "//span[contains(text(),'SİYAH')]")
    WebElement verifyData;


    public void clickPopupAccept(){
        utility.waitForElementPresent(acceptButton);
        acceptButton.click();
    }
    public void clickClothes(){
        utility.waitForElementPresent(clothes);
        Actions actions = new Actions(driver);
        actions.moveToElement(clothes).build().perform();
    }


    public void clickWomanKneeHighSocks(){
        utility.waitForElementPresent(kneeHighSocks);
        kneeHighSocks.click();
    }

    public void clickBlackSocks(){
        utility.waitForElementPresent(blackSocks);
        blackSocks.click();
    }

    public boolean isSocksBlack(){
        utility.waitForElementPresent(verifyData);
        if (verifyData.getText().equals("SİYAH")){
            System.out.println("Selected color is Black");
            return true;
        }else {
            return false;
        }
    }

    public void dashboardPageActions(){
        clickPopupAccept();
        clickClothes();
        clickWomanKneeHighSocks();
        clickBlackSocks();
    }


}
