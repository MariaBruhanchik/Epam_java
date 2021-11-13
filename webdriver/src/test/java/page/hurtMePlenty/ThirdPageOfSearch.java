package page.hurtMePlenty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ThirdPageOfSearch extends AbstractClass {

    private static final String OPERATION_SYSTEM = "//*[@id='select_option_76']/div[1]";
    private static final String MACHINE_CLASS = "//*[@id='select_option_89']/div[1]";
    private static final String MACHINE_TYPE = "//*[@id='select_option_271']";
    private static final String LOCAL_SSD = "//*[@id='select_option_132']";
    private static final String GRUs_TYPE = "//*[@value='NVIDIA_TESLA_P4']";
    private static final String NUMBER_OF_GRUs_TYPE = "//*[@id='select_option_427']";
    private static final String DATACENTER_LOCATION = "//*[@id='select_option_290']";
    private static final String COMMITTED_USAGE = "//*[@id='select_option_139']";


    @FindBy(id = "input_74")
    private WebElement numberOfInstances;

    @FindBy(xpath = "//*[@id='select_value_label_66']/span[1]/div")
    private WebElement listOfOperationSystems;

    @FindBy(xpath = "//*[@id='select_value_label_67']/span[1]/div")
    private WebElement listOfMachineClass;

    @FindBy(xpath = "//*[@id='select_value_label_70']")
    private WebElement listOfMachineTypes;

    @FindBy(xpath = "//md-checkbox[@aria-label='Add GPUs']")
    private WebElement checkAddGRUs;

    @FindBy(xpath = "//md-select[@aria-label='Local SSD: 0']")
    private WebElement localSSD;

    @FindBy(xpath = "//*[@id='select_value_label_410']")
    private WebElement listOfGRUsType;

    @FindBy(id = "select_value_label_409")
    private WebElement listOfNumberOfGRUs;

    @FindBy(id = "select_value_label_118")
    private WebElement listOfLocations;

    @FindBy(id = "select_value_label_119")
    private WebElement openCommitedUsage;

    @FindBy(id = "input_120")
    private WebElement numberOfNodes;

    @FindBy(css = "button[ng-click^='listingCtrl.soleTenant.submitted = true']")
    private WebElement buttonAddToEstimate;

    public ThirdPageOfSearch(WebDriver driver) {
        super(driver);
    }


    public ThirdPageOfSearch activateNumberOfInstance(String number) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id='cloud-site']/devsite-iframe/iframe")));
        driver.switchTo().frame(driver.findElement(By.id("myFrame")));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        numberOfInstances.sendKeys(number);
        return this;
    }


    public ThirdPageOfSearch selectOperatingSystem() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        listOfOperationSystems.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(OPERATION_SYSTEM))).click();
        return this;
    }


    public ThirdPageOfSearch selectMachineClass() {
        listOfMachineClass.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(MACHINE_CLASS)));
        webElement.click();
        return this;
    }


    public ThirdPageOfSearch selectMachineType() {
        listOfMachineTypes.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(MACHINE_TYPE)));
        webElement.click();
        return this;
    }


    public ThirdPageOfSearch checkTheBox() {
        checkAddGRUs.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public ThirdPageOfSearch selectGRUsType() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        listOfGRUsType.click();
        WebElement webElement = driver.findElement(By.xpath(String.format(GRUs_TYPE)));
        webElement.click();
        return this;
    }



    public ThirdPageOfSearch selectNumberOfGRUsType() {
        listOfNumberOfGRUs.click();
        WebElement webElement = driver.findElement(By.xpath(String.format(NUMBER_OF_GRUs_TYPE)));
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        webElement.click();
        return this;
    }


    public ThirdPageOfSearch selectLocalSSD() {
        localSSD.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(LOCAL_SSD)));
        webElement.click();
        return this;
    }


    public ThirdPageOfSearch selectLocation() {
        listOfLocations.click();
        WebElement webElement = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(DATACENTER_LOCATION)));
        webElement.click();
        return this;
    }


    public ThirdPageOfSearch selectCommittedUsage() {
        openCommitedUsage.click();
        WebElement webElement = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(COMMITTED_USAGE)));
        webElement.click();
        return this;
    }


    public ThirdPageOfSearch inputNumberOfNodes(String text) {
        numberOfNodes.sendKeys(text);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }


    public ThirdPageOfSearch pressAddToEstimate() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(buttonAddToEstimate)).click();
        return this;
    }
}
