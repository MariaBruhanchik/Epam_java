package com.epam.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class PageOfGeneratedEmail extends AbstractHelperClass {

    private static final String NEW_URL = " https://yopmail.com/ ";

    @FindBy(xpath = "//*[@href='email-generator']")
    private WebElement buttonEmailGenerator;

    @FindBy(id = "cprnd")
    private WebElement buttonCopy;

    @FindBy(id = "email_quote")
    private String buttonEmailEstimate;

    @FindBy(xpath = "//*[@onclick='egengo();']")
    private WebElement buttonCheckEmail;


    public PageOfGeneratedEmail(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }


    public PageOfGeneratedEmail openPage() {
        ((JavascriptExecutor) driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get(NEW_URL);
        logger.info("Open page of generated email ");
        return this;
    }

    public PageOfGeneratedEmail clickTheButtonEmailGenerator() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        buttonEmailGenerator.click();
        return this;
    }

    public PageOfGeneratedEmail clickTheButtonCopy() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        buttonCopy.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public GoogleCloudPriceEstimate checkEmail() throws InterruptedException {
        // Waiting for the reply of the letter
        Thread.sleep(3000);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        buttonCheckEmail.click();
        return new GoogleCloudPriceEstimate(driver);
    }


}
