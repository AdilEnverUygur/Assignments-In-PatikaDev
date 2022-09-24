package com.testcase.a101.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromFile {
    //Method for read a specific key value pair from "config.properties" file
    public static String readConfigProperties(String key)
    {
        Properties properties=new Properties();
        String value;
        String workingDir=System.getProperty("user.dir");
        try {
            properties.load(new FileInputStream(workingDir+ File.separator+"config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        value=properties.getProperty(key);
        return value;
    }
}
