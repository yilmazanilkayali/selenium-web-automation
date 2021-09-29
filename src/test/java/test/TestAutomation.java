package test;

import com.yilmazanilkayali.base.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;

public class TestAutomation extends Base {

    public static final Logger LOGGER = LogManager.getLogger("");


    @Before
    @Override
    public void before(){
        super.before();
        getDriver().get("https://www.lcwaikiki.com/tr-TR/TR");
    }
}
