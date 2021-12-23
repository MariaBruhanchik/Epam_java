package com.epam.test;

import com.epam.driver.DriverSingleton;
import com.epam.model.DataForFillingOutTheForm;
import com.epam.service.DataCreator;
import com.epam.util.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({TestListener.class})
public class CommonConditions {
    public static final String DRIVER_PATH = "src//test//resources//";
    protected WebDriver driver = DriverSingleton.getDriver();

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH + "chromedriver.exe");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void browserTearDown() {
        DriverSingleton.closeDriver();
    }
}

