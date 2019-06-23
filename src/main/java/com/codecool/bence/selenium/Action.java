package com.codecool.bence.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Action {

    public static WebDriver driver;

    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver", System.getenv("webdriverPath"));
        driver = new ChromeDriver();
    }

    public static void navigate()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(System.getenv("baseUrl"));
    }

    public static void navigate(String subpage)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(System.getenv("baseUrl")+subpage);
    }
}
