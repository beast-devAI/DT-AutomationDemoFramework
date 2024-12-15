package com.dt.automexercise.factory;

import com.dt.automexercise.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    static WebDriver driver;


    public static WebDriver driver_initialization() {

        if (ConfigReader.getBrower_FromConfig().equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();

        } else if (ConfigReader.getBrower_FromConfig().equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();
        } else if (ConfigReader.getBrower_FromConfig().equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();
        } else {

            System.out.println("No browser found");

        }

        return driver;

    }


}
