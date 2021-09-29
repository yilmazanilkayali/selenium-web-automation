package com.yilmazanilkayali;

import com.yilmazanilkayali.base.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestAutomation extends Base {

    public static final Logger LOGGER = LogManager.getLogger("");



    public void before1(){
        super.before();
        getDriver().get("https://www.lcwaikiki.com/tr-TR/TR");
    }
}
