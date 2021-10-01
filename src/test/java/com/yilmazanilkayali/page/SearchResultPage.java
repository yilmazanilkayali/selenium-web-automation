package com.yilmazanilkayali.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SearchResultPage extends WebPage {
    private By seeMoreButton = By.id("pageIndex");
    private By product = By.className("a_model_item");
    private Random random = new Random();
    public static int randomNum;
    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);

    }
    public void scrollDown(){
        getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.END);
    }
    public void seeMore(){
        getElement(seeMoreButton).click();
    }
    public void chooseRandomProduct(){
        List<WebElement> elements = getDriver().findElements(product);
        List<WebElement> products = getDriver().findElements(By.xpath("//a[@class='a_model_item']"));
        Random productSize = new Random();
        randomNum = productSize.nextInt(products.size());
        randomNum= randomNum++;

        elements.get(randomNum).click();
    }
}

