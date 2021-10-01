package test;

import com.yilmazanilkayali.base.Base;
import com.yilmazanilkayali.page.*;
import com.yilmazanilkayali.page.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestAutomation extends Base {

    public static final Logger LOGGER = LogManager.getLogger("");

    @Before
    @Override
    public void before(){
        super.before();
        getDriver().get("https://www.lcwaikiki.com/tr-TR/TR");
    }

    @Test
    public void test(){
        HomePage homePage = new HomePage(getDriver());
        homePage.goToSignInPage();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login();
        homePage.search("pantolan");
        SearchResultPage searchResultPage = new SearchResultPage((getDriver()));
        searchResultPage.scrollDown();
        searchResultPage.seeMore();
        searchResultPage.chooseRandomProduct();
        ProductPage productPage = new ProductPage(getDriver());
        productPage.addToCart();
        productPage.goToCartPage();
        CartPage cartPage = new CartPage(getDriver());
        cartPage.oneMoreItem();
        cartPage.CleanCart();


    }
    @After
    public void after(){
        super.after();

    }
}
