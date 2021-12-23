package com.epam.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class GoogleCloudPriceEstimate extends AbstractHelperClass {
    private static final String PRICE_FROM_THE_LETTER = "//*[@id='mail']/div/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]";
    private final Logger logger = LogManager.getRootLogger();

    public GoogleCloudPriceEstimate(WebDriver driver) {
        super(driver);
    }

    public String priceThatHasReceived() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.id("ifmail")));
        WebElement currentPrice = driver.findElement(By.xpath(PRICE_FROM_THE_LETTER));
        logger.info(currentPrice.getText());
        return currentPrice.getText();


    }

}
