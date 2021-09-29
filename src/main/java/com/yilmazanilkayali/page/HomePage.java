package com.yilmazanilkayali.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class HomePage {
    private WebDriver webDriver;
    private Wait<WebDriver> wait;
    private By signInButton = By.className("header-icon-label");
    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver,30);
        PageFactory.initElements(this.webDriver,this);
        waitForPageLoad();

    }

    public  WebElement signIn(){
        return webDriver.findElement(signInButton);
    }
    private void waitForPageLoad(){
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                return String
                        .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                        .equals("complete");
            }
        });
    }
}
