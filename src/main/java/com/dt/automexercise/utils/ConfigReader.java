package com.dt.automexercise.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static String propFilePath = "src/main/resources/config.properties";

    static Properties prop;


    public static void prop_Initialization() throws IOException {

        FileInputStream fis = new FileInputStream(new File(propFilePath));
        prop.load(fis);

    }

    public static String getAppUrl_FromConfig(){

        return prop.getProperty("appURL");
    }

    public static String getBrower_FromConfig(){

        return prop.getProperty("browser");
    }

    public static String getUserName_FromConfig(){

        return prop.getProperty("userName");
    }

    public static String getPassword_FromConfig(){

        return prop.getProperty("password");
    }

    public static String getEnvDetails_FromConfig(){

        return prop.getProperty("Env");
    }


    public static String getUserRole_fromConfig(){

        return prop.getProperty("userRole");
    }



}
