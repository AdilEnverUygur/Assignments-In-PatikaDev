package com.testcase.a101test.testNG;

import com.testcase.a101.ui.CartPage;
import com.testcase.a101.ui.CheckOutPage;
import com.testcase.a101.ui.DashboardPage;
import com.testcase.a101.utility.ReadFromFile;
import com.testcase.a101.utility.Utility;
import com.testcase.a101test.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstCase extends BasePage {

    static DashboardPage dashboardPage;
    static CartPage cartPage;
    static CheckOutPage checkOutPage;
    static Utility utility;
    static String url = ReadFromFile.readConfigProperties("url");

    @BeforeClass(alwaysRun = true)
    public static void setUp(){
        setUpBrowser(url);
        dashboardPage = new DashboardPage(driver);
        cartPage = new CartPage(driver);
        checkOutPage = new CheckOutPage(driver);
        utility = new Utility(driver);
    }

    @Test
    public static void dashBoardPageSteps(){
        dashboardPage.dashboardPageActions();
        Assert.assertTrue(dashboardPage.isSocksBlack());
    }

    @Test(dependsOnMethods = "dashBoardPageSteps")
    public static void cartPageSteps(){
        cartPage.cartPageActions();
    }

    @Test(dependsOnMethods = "cartPageSteps")
    public static void checkOutPageActions(){
        checkOutPage.checkOutPage();
        Assert.assertTrue(checkOutPage.verifyMessage());
    }

    @AfterClass(alwaysRun = true)
    public static void tearDown(){
        teardown();
    }
}
