package com.epam.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ChooseCorrectResultOfSearch extends AbstractHelperClass {
    private static final String CALCULATOR_LINK = "Google Cloud Platform Pricing Calculator";

    public ChooseCorrectResultOfSearch(WebDriver driver) {
        super(driver);
    }

    public FillingOutTheForm openCalculator() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText(CALCULATOR_LINK))).click();
        return new FillingOutTheForm(driver);
    }
}
