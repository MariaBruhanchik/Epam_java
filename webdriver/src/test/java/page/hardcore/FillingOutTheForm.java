package page.hardcore;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class FillingOutTheForm extends AbstractHelperClass {
    private static final String OPERATION_SYSTEM = "//*[@id='select_option_77']/div[1]";
    private static final String MACHINE_CLASS = "//*[@id='select_option_90']/div[1]";
    private static final String MACHINE_TYPE = "//*[@id='select_option_272']";
    private static final String LOCAL_SSD = "//*[@id='select_option_133']";
    private static final String GRUs_TYPE = "//*[@value='NVIDIA_TESLA_P4']";
    private static final String NUMBER_OF_GRUs_TYPE = "//*[@id='select_option_424']/div[1]";
    private static final String DATACENTER_LOCATION = "//*[@id='select_option_291']";
    private static final String COMMITTED_USAGE = "//*[@id='select_option_140']";

   ArrayList <String> tabs = new ArrayList<String>(driver.getWindowHandles());
    public final String priceFromTheCalculator="//*[@id='resultBlock']/md-card/md-card-content/div/div/div/h2/b";

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

    public FillingOutTheForm(WebDriver driver) {
        super(driver);
    }


    public FillingOutTheForm activateNumberOfInstance(String number) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id='cloud-site']/devsite-iframe/iframe")));
        driver.switchTo().frame(driver.findElement(By.id("myFrame")));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        numberOfInstances.sendKeys(number);
        return this;
    }


    public FillingOutTheForm selectOperatingSystem() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        listOfOperationSystems.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(OPERATION_SYSTEM))).click();
        return this;
    }


    public FillingOutTheForm selectMachineClass() {
        listOfMachineClass.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(MACHINE_CLASS)));
        webElement.click();
        return this;
    }


    public FillingOutTheForm selectMachineType() {
        listOfMachineTypes.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(MACHINE_TYPE)));
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

    public FillingOutTheForm selectGRUsType() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        listOfGRUsType.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(GRUs_TYPE)));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webElement.click();
        return this;
    }


    public FillingOutTheForm selectNumberOfGRUsType() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        listOfNumberOfGRUs.click();
        Thread.sleep(2000);
        WebElement webElement = driver.findElement(By.xpath(String.format(NUMBER_OF_GRUs_TYPE)));
        webElement.click();
        return this;
    }


    public FillingOutTheForm selectLocalSSD() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        localSSD.click();
        WebElement webElement = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCAL_SSD)));
        webElement.click();
        return this;
    }


    public FillingOutTheForm selectLocation() {
        listOfLocations.click();
        WebElement webElement = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(DATACENTER_LOCATION)));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webElement.click();
        return this;
    }


    public FillingOutTheForm selectCommittedUsage() {
        openCommitedUsage.click();
        WebElement webElement = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(COMMITTED_USAGE)));
        webElement.click();
        return this;
    }


    public FillingOutTheForm inputNumberOfNodes(String text) {
        numberOfNodes.sendKeys(text);
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
        String mainPage=tabs.get(0);
        driver.switchTo().window(mainPage);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id='cloud-site']/devsite-iframe/iframe")));
        driver.switchTo().frame(driver.findElement(By.id("myFrame")));
        buttonEmailEstimate.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return this;
    }


    public FillingOutTheForm sendEmail() throws IOException, UnsupportedFlavorException {
        new WebDriverWait(driver,WAIT_TIMEOUT_SECONDS);
        String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        new WebDriverWait(driver,WAIT_TIMEOUT_SECONDS);
        pasteEmail.sendKeys(myText);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        buttonSendEmail.click();
        new WebDriverWait(driver,WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public boolean priceFromTheCalculator(String expectedPrice){
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id='cloud-site']/devsite-iframe/iframe")));
        driver.switchTo().frame(driver.findElement(By.id("myFrame")));
        WebElement currentPrice=driver.findElement(By.xpath(priceFromTheCalculator));
        System.out.println(currentPrice.getText());
      return currentPrice.getText().contains(expectedPrice);

    }


}
