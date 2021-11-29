package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.hardcore.*;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;


public class СorrespondenceOfThePriceOfTheLetterAndCalculatorPriceTest {
    private WebDriver driver = new ChromeDriver();

    
    @Test
    public void scriptResultOfApplication() throws InterruptedException, IOException, UnsupportedFlavorException {
        new SearchGoogleCloudPlatformPricingCalculator(driver)
                .openPage()
                .clickButtonSearch()
                .enterQuery("Google Cloud Platform Pricing Calculator");
        new ChooseCorrectResultOfSearch(driver)
                .openCalculator();
        FillingOutTheForm fillingOutTheForm = new FillingOutTheForm(driver)
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
        PageOfGeneratedEmail pageOfGeneratedEmail = new PageOfGeneratedEmail(driver)
                .openNewTab()
                .clickTheButtonEmailGenerator()
                .clickTheButtonCopy();
        fillingOutTheForm
                .clickTheButtonEmailEstimate()
                .sendEmail();
        pageOfGeneratedEmail
                .checkEmail();
        GoogleCloudPriceEstimate googleCloudPriceEstimate = new GoogleCloudPriceEstimate(driver);

          Assert.assertTrue(fillingOutTheForm.priceFromTheCalculator(googleCloudPriceEstimate.priceThatHasReceived()));
    }

    @After
    public void browserTearDown(){
        driver.quit();
        driver=null;
    }
}
