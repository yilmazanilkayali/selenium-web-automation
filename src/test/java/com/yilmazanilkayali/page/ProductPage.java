package com.yilmazanilkayali.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends WebPage{
    private By addToCartButton = By.cssSelector("#rightInfoBar > div:nth-child(1) > div > div.mobile-size-and-cart-container > div.row.buttons-area > div");
    private By chooseSize = By.xpath("//*[@id=\"option-size\"]/a[1]");  //#option-size > a:nth-child(7)id
    private By priceBy = By.xpath("//span[@class='price']");
    private By goToCartButton = By.className("header-cart");

   ;

    public ProductPage(WebDriver webDriver) {
        super(webDriver);


    }
    public void addToCart(){
    getElement(chooseSize).click();
    getElement(addToCartButton).click();
    }



    public void goToCartPage(){
    getElement(goToCartButton).click();
    }
}
