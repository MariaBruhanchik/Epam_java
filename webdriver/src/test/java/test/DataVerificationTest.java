package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import page.hurtMePlenty.EnterQuery;
import page.hurtMePlenty.EnterCalculatorLink;
import page.hurtMePlenty.DataEntry;


public class DataVerificationTest {

    private WebDriver driver = new ChromeDriver();

    @FindBy(xpath = "//*/md-card/md-toolbar/div/h2")
    private WebElement titleEstimate;

    @FindBy(xpath = "//*/md-list/md-list-item[1]/div")
    private WebElement region;

    @FindBy(xpath = "//*/md-list/md-list-item[3]/div")
    private WebElement commitmentTerm;

    @FindBy(xpath = "//*/md-list/md-list-item[5]/div[1]")
    private WebElement localSSD;

    @FindBy(xpath = "//*/md-list/md-list-item[4]/div[1]")
    private WebElement localType;


    @Before
    public void scriptResultOfApplication() throws InterruptedException {
        new EnterQuery(driver)
                .openPage()
                .clickButtonSearch()
                .enterQuery("Google Cloud Platform Pricing Calculator");
        new EnterCalculatorLink(driver)
                .openCalculator();
        new DataEntry(driver)
                .activateNumberOfInstance("4")
                .selectOperatingSystem()
                .selectMachineClass()
                .selectMachineType()
                .inputNumberOfNodes("1")
                .checkTheBox()
                .selectGRUsType()
                .selectNumberOfGRUsType()
                .selectLocalSSD()
                .selectLocation()
                .selectCommittedUsage()
                .pressAddToEstimate();
    }


    @Test
    public void resultsOfApplicationIsNotEmpty() {
        WebElement testResult = driver.findElement(By.xpath(String.valueOf(titleEstimate)));
        String resultIsNotEmpty = testResult.getText();
        Assert.assertEquals("Estimate", resultIsNotEmpty);
    }


    @Test
    public void theRegionIsCorrect() {
        String currentRegion = driver.findElement(By.xpath(String.valueOf(region))).getText();
        Assert.assertEquals("Region: Belgium", currentRegion);
    }


    @Test
    public void theCommitmentTermIsCorrect() {
        Assert.assertTrue(driver.findElement(By.xpath(String.valueOf(commitmentTerm)))
                .getText().contains("Commitment term: 1 Year"));
    }


    @Test
    public void localSSDIsCorrect() {
        Assert.assertTrue(driver.findElement(By.xpath(String.valueOf(localSSD)))
                .getText().contains("Local SSD: 24x375 GiB"));
    }

    @Test
    public void instanceTypeIsCorrect() {
        Assert.assertTrue(driver.findElement(By.xpath(String.valueOf(localType)))
                .getText().contains("Instance type: n1-node-96-624"));
    }


    @After
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
