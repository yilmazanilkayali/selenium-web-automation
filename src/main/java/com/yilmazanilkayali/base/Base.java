package com.yilmazanilkayali.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    private WebDriver driver;
    private WebDriverWait wait;

    public Base() {
        System.setProperty("driver","");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
    }

    public void before(){
        driver.manage().window().maximize();
    }
    public void after(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
