package com.testcase.a101test.stepdefinationfile;

import com.testcase.a101.ui.CartPage;
import com.testcase.a101.ui.CheckOutPage;
import com.testcase.a101.ui.DashboardPage;
import com.testcase.a101.utility.ReadFromFile;
import com.testcase.a101test.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EndToEndTest extends BasePage {
    DashboardPage dashboardPage;
    CartPage cartPage;
    CheckOutPage checkOutPage;
    static String url= ReadFromFile.readConfigProperties("url");

    @Given("Go to the dashboard page")
    public void goToTheDashboardPage() {
        setUpBrowser(url);
    }

    @When("Go to the Go to Clothing--> Accessories--> Women's Underwear-->Knee High Socks.")
    public void goToTheGoToClothingAccessoriesWomenSUnderwearKneeHighSocks() {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.clickClothes();
        dashboardPage.clickWomanKneeHighSocks();
    }

    @Then("Need to verify the opened product is black")
    public void needToVerifyTheOpenedProductIsBlack() {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.clickBlackSocks();
        dashboardPage.isSocksBlack();
    }

    @And("Click the Add to Cart button.")
    public void clickTheAddToCartButton() {
        cartPage = new CartPage(driver);
        cartPage.clickAddToCart();
    }

    @And("Click the View Cart button.")
    public void clickTheViewCartButton() {
        cartPage = new CartPage(driver);
        cartPage.clickViewCart();
    }

    @And("Click on the Confirm Cart button.")
    public void clickOnTheConfirmCartButton() {
        cartPage = new CartPage(driver);
        cartPage.clickConfirmCart();
    }

    @And("Click the Continue without registration button.")
    public void clickTheContinueWithoutRegistrationButton() {
        cartPage = new CartPage(driver);
        cartPage.clickContinueWithoutRegis();
    }

    @And("Go to the mail screen")
    public void goToTheMailScreen() {
        cartPage = new CartPage(driver);
        cartPage.enterUserEmail();
    }

    @And("The address screen appears.After creating an address,the payment screen comes up.")
    public void theAddressScreenAppearsAfterCreatingAnAddressThePaymentScreenComesUp() {
        checkOutPage = new CheckOutPage(driver);
        checkOutPage.checkOutPage();
    }

    @And("Need to verify you are in the correct screen")
    public void needToVerifyYouAreInTheCorrectScreen() {
        checkOutPage = new CheckOutPage(driver);
        checkOutPage.verifyMessage();
    }
}
