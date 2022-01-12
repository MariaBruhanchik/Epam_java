package com.epam.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;


public class AbstractHelperClass {
    protected WebDriver driver;
    protected final Logger logger = LogManager.getRootLogger();
    protected final ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

    protected final int WAIT_TIMEOUT_SECONDS = 40;

    protected AbstractHelperClass(WebDriver driver) {
        this.driver = driver;
    }
}
