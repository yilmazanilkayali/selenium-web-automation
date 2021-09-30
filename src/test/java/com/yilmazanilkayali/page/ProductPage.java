package com.yilmazanilkayali.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends WebPage{
    private By addToCartButton = By.id("pd_add_to_cart");
    private By chooseSize = By.cssSelector("#option-size > a:nth-child(7)");
    private By priceBy = By.className("price");
    private By goToCartButton = By.className("header-cart");
    private double price;
    public ProductPage(WebDriver webDriver) {
        super(webDriver);
        price = Double.valueOf(getElement(priceBy).getText());
    }
    public void addToCart(){
        getElement(chooseSize).click();
    getElement(addToCartButton).click();
    }

    public double getPrice() {
        return price;
    }
    public void goToCartPage(){
    getElement(goToCartButton).click();
    }
}
