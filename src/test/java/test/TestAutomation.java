package test;

import com.yilmazanilkayali.base.Base;
import com.yilmazanilkayali.page.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
        WebElement webElement = homePage.signIn();
        webElement.click();
    }
    @After
    public void after(){
        super.after();

    }
}
