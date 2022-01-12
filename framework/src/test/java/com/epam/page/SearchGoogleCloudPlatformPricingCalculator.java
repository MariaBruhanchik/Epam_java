package com.epam.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchGoogleCloudPlatformPricingCalculator extends AbstractHelperClass {

    private static final String HOMEPAGE_URL = "http://cloud.google.com/";

    @FindBy(xpath = "//devsite-search[@tenant-name='Google Cloud']")
    private WebElement buttonSearch;

    @FindBy(className = "devsite-search-query")
    private WebElement writeSearchQuery;

    @FindBy(className = "devsite-tabs-dropdown")
    private WebElement choiceHint;

    public SearchGoogleCloudPlatformPricingCalculator(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SearchGoogleCloudPlatformPricingCalculator openPage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public SearchGoogleCloudPlatformPricingCalculator clickButtonSearch() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        buttonSearch.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public ChooseCorrectResultOfSearch enterQuery(String query) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        writeSearchQuery.sendKeys(query, Keys.ENTER);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return new ChooseCorrectResultOfSearch(driver);
    }
}
