package com.yilmazanilkayali.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class HomePage extends WebPage {

    private By signInButton = By.className("header-icon-label");
    private By searchInputBox = By.id("search");
    private By searchButton = By.className("search-button");
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToSignInPage(){
        getElement(signInButton).click();
    }
    private void searchInput(String item){
        getElement(searchInputBox).sendKeys(item);

    }
    public void search(String item){
        searchInput(item);
        getElement(searchButton).click();
    }
}
