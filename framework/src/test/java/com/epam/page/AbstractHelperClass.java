package com.epam.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


public abstract class AbstractHelperClass {
    protected WebDriver driver;
    protected final Logger logger = LogManager.getRootLogger();

    protected abstract AbstractHelperClass openPage();

    protected final int WAIT_TIMEOUT_SECONDS = 40;

    protected AbstractHelperClass(WebDriver driver) {
        this.driver = driver;
    }
}
