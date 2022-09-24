package com.testcase.a101test.cucumbertest;

import com.testcase.a101.utility.ReadFromFile;
import com.testcase.a101test.BasePage;
import io.cucumber.java.Before;

public class Hooks extends BasePage {

    String url= ReadFromFile.readConfigProperties("url");

    @Before
    public void setUp(){
        setUpBrowser(url);
    }
//    @After
//    public void tearDown(){
//        teardown();
//    }


}
