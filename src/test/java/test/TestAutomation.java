package test;

import com.yilmazanilkayali.base.Base;
import com.yilmazanilkayali.page.HomePage;
import com.yilmazanilkayali.page.LoginPage;
import com.yilmazanilkayali.page.ProductPage;
import com.yilmazanilkayali.page.SearchResultPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Cookie;
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
    }
    @After
    public void after(){
        super.after();

    }
}
