package com.epam.page;

import com.epam.model.DataForFillingOutTheForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FillingOutTheForm extends AbstractHelperClass {

    public final String priceFromTheCalculator = "//*[@id='resultBlock']/md-card/md-card-content/div/div/div/h2/b";
    public final String universalLocatorForSearchData = "//md-option/div[contains(text(),'";
    public final String mainFrame = "//*[@id='cloud-site']/devsite-iframe/iframe";
    public final String findPriceFromCalculator = "/html/body/md-content/md-card/md-toolbar/div/div[1]/h2";

    @FindBy(id = "input_75")
    private WebElement numberOfInstances;

    @FindBy(xpath = "//*[@id='select_value_label_67']/span[1]/div")
    private WebElement listOfOperationSystems;

    @FindBy(xpath = "//*[@id='select_value_label_68']/span[1]/div")
    private WebElement listOfMachineClass;

    @FindBy(xpath = "//*[@id='select_value_label_71']")
    private WebElement listOfMachineTypes;

    @FindBy(xpath = "//md-checkbox[@aria-label='Add GPUs'][@tabindex='0']")
    private WebElement checkAddGRUs;

    @FindBy(xpath = "//*[@id='select_value_label_118']")
    private WebElement localSSD;

    @FindBy(xpath = "//*[@id='select_412']")
    private WebElement listOfGRUsType;

    @FindBy(id = "select_414")
    private WebElement listOfNumberOfGRUs;

    @FindBy(id = "select_value_label_119")
    private WebElement listOfLocations;

    @FindBy(id = "select_value_label_120")
    private WebElement openCommitedUsage;

    @FindBy(id = "input_121")
    private WebElement numberOfNodes;

    @FindBy(css = "button[ng-click^='listingCtrl.soleTenant.submitted = true']")
    private WebElement buttonAddToEstimate;

    @FindBy(id = "email_quote")
    private WebElement buttonEmailEstimate;

    @FindBy(id = "input_471")
    private WebElement pasteEmail;

    @FindBy(xpath = "//*[@aria-label='Send Email']")
    private WebElement buttonSendEmail;

    @Override
    protected FillingOutTheForm openPage() {
        return this;
    }

    public FillingOutTheForm(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }


    public FillingOutTheForm activateNumberOfInstance(DataForFillingOutTheForm number) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(mainFrame)));
        driver.switchTo().frame(driver.findElement(By.id("myFrame")));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        numberOfInstances.sendKeys(number.getNumberOfInstance());
        return this;
    }


    public FillingOutTheForm selectOperatingSystem(DataForFillingOutTheForm os) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        listOfOperationSystems.click();
        WebElement webElement = driver.findElement(By.xpath(locatorData(os.getOperationSystem())));
        webElement.click();
        return this;
    }


    public FillingOutTheForm selectMachineClass(DataForFillingOutTheForm mc) {
        listOfMachineClass.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        List<WebElement> elem = driver.findElements(By.xpath(String.format(locatorData(mc.getMachineClass()))));
        elem.get(1).click();
        return this;
    }


    public FillingOutTheForm selectMachineType(DataForFillingOutTheForm mt) {
        listOfMachineTypes.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(locatorData(mt.getMachineType()))));
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        webElement.click();
        return this;
    }


    public FillingOutTheForm checkTheBox() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        checkAddGRUs.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public FillingOutTheForm selectGRUsType(DataForFillingOutTheForm GType) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        listOfGRUsType.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(locatorData(GType.getGRUsType()))));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webElement.click();
        return this;
    }


    public FillingOutTheForm selectNumberOfGRUsType(DataForFillingOutTheForm numberOfG) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        listOfNumberOfGRUs.click();
        Thread.sleep(2000);
        List<WebElement> elements = driver.findElements(By.xpath(String.format(locatorData(numberOfG.getNumberOfGRUsType()))));
        elements.get(30).click();
        return this;
    }


    public FillingOutTheForm selectLocalSSD(DataForFillingOutTheForm local) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        localSSD.click();
        WebElement webElement = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(locatorData(local.getLocalSSD()))));
        webElement.click();
        return this;
    }


    public FillingOutTheForm selectLocation(DataForFillingOutTheForm location) {
        listOfLocations.click();
        List<WebElement> elements = driver.findElements(By.xpath(String.format(locatorData(location.getDatacenterLocation()))));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        elements.get(2).click();
        return this;
    }


    public FillingOutTheForm selectCommittedUsage(DataForFillingOutTheForm commitedUsage) {
        openCommitedUsage.click();
        List<WebElement> elements = driver.findElements(By.xpath(String.format(locatorData(commitedUsage.getCommittedUsage()))));
        elements.get(1).click();
        return this;
    }


    public FillingOutTheForm inputNumberOfNodes(DataForFillingOutTheForm text) {
        numberOfNodes.sendKeys(text.getNumberOfNodes());
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }


    public FillingOutTheForm pressAddToEstimate() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(buttonAddToEstimate)).click();
        return this;
    }

    public FillingOutTheForm clickTheButtonEmailEstimate() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        String mainPage = tabs.get(0);
        driver.switchTo().window(mainPage);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(mainFrame)));
        driver.switchTo().frame(driver.findElement(By.id("myFrame")));
        buttonEmailEstimate.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return this;
    }


    public FillingOutTheForm sendEmail() throws IOException, UnsupportedFlavorException {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        pasteEmail.sendKeys(myText);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        buttonSendEmail.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public boolean priceFromTheCalculator(String expectedPrice) {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(mainFrame)));
        driver.switchTo().frame(driver.findElement(By.id("myFrame")));
        WebElement currentPrice = driver.findElement(By.xpath(priceFromTheCalculator));
        logger.info("Price from the calculator: " + currentPrice.getText());
        return currentPrice.getText().contains(expectedPrice);
    }

    public String hasTheCalculatorOpen() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(mainFrame)));
        driver.switchTo().frame(driver.findElement(By.id("myFrame")));
        WebElement element = driver.findElement(By.xpath(findPriceFromCalculator));
        return element.getText();
    }

    public String locatorData(String dataByString) {
        String mockElements = universalLocatorForSearchData + dataByString + "')]";
        return mockElements;
    }
}
