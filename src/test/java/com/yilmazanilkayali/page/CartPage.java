package com.yilmazanilkayali.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage extends WebPage{

    private By oneMoreItem = By.xpath("//*[@class='oq-up plus']");
    private By cleanCart = By.xpath("//*[@class='cart-square-link']");
    private By cleanCartDelete = By.xpath("//*[@class='main-modal-button sc-fav-delete ins-init-condition-tracking']");
    public CartPage(WebDriver webDriver) {
        super(webDriver);

    }
    public void oneMoreItem(){
        getElement(oneMoreItem).click();
    }
    public void CleanCart(){
        getElement(cleanCart).click();
        getElement(cleanCartDelete).click();
    }
}
