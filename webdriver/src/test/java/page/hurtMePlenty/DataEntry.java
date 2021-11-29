package page.hurtMePlenty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DataEntry extends AbstractClass {

    private static final String OPERATION_SYSTEM = "//*[@id='select_option_77']/div[1]";
    private static final String MACHINE_CLASS = "//*[@id='select_option_90']/div[1]";
    private static final String MACHINE_TYPE = "//*[@id='select_option_272']";
    private static final String LOCAL_SSD = "//*[@id='select_option_133']";
    private static final String GRUs_TYPE = "//*[@value='NVIDIA_TESLA_P4']";
    private static final String NUMBER_OF_GRUs_TYPE = "//*[@id='select_option_424']/div[1]";
    private static final String DATACENTER_LOCATION = "//*[@id='select_option_291']";
    private static final String COMMITTED_USAGE = "//*[@id='select_option_140']";


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

    public DataEntry(WebDriver driver) {
        super(driver);
    }


    public DataEntry activateNumberOfInstance(String number) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id='cloud-site']/devsite-iframe/iframe")));
        driver.switchTo().frame(driver.findElement(By.id("myFrame")));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        numberOfInstances.sendKeys(number);
        return this;
    }


    public DataEntry selectOperatingSystem() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        listOfOperationSystems.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(OPERATION_SYSTEM))).click();
        return this;
    }


    public DataEntry selectMachineClass() {
        listOfMachineClass.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(MACHINE_CLASS)));
        webElement.click();
        return this;
    }


    public DataEntry selectMachineType() {
        listOfMachineTypes.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(MACHINE_TYPE))).click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }


    public DataEntry checkTheBox() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        checkAddGRUs.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public DataEntry selectGRUsType() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        listOfGRUsType.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(GRUs_TYPE)));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webElement.click();
        return this;
    }


    public DataEntry selectNumberOfGRUsType() throws InterruptedException {
        listOfNumberOfGRUs.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement webElement = driver.findElement(By.xpath(String.format(NUMBER_OF_GRUs_TYPE)));
        webElement.click();
        return this;
    }


    public DataEntry selectLocalSSD() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        localSSD.click();
        WebElement webElement = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCAL_SSD)));
        webElement.click();
        return this;
    }


    public DataEntry selectLocation() {
        listOfLocations.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        WebElement webElement = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(DATACENTER_LOCATION)));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webElement.click();
        return this;
    }


    public DataEntry selectCommittedUsage() {
        openCommitedUsage.click();
        WebElement webElement = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(COMMITTED_USAGE)));
        webElement.click();
        return this;
    }


    public DataEntry inputNumberOfNodes(String text) {
        numberOfNodes.sendKeys(text);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }


    public DataEntry pressAddToEstimate() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(buttonAddToEstimate)).click();
        return this;
    }
}
