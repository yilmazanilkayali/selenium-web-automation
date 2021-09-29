package com.yilmazanilkayali.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver webDriver;
    private By signInButton = By.className("header-icon-label");
    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver,this);
    }

    public  WebElement signIn(){
        return webDriver.findElement(signInButton);
    }
}
