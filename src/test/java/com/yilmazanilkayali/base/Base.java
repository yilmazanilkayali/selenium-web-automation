package com.yilmazanilkayali.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    private WebDriver driver;
    private WebDriverWait wait;

    public Base() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\YILMAZ ANIL\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 20);

    }
    public void before(){
        driver.manage().window().maximize();
    }
    public void after(){
     //   driver.quit();
    }
    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }


}
