package com.epam.test;

import com.epam.model.DataForFillingOutTheForm;
import com.epam.service.DataCreator;
import org.junit.Assert;
import org.junit.Test;
import com.epam.page.*;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;


public class CorrespondenceOfThePriceOfTheLetterAndCalculatorPriceTest extends CommonConditions {
    DataForFillingOutTheForm dataForFillingOutTheForm = DataCreator.dataWithProperty();

    @Test
    public void scriptResultOfApplication() throws InterruptedException, IOException, UnsupportedFlavorException {
        new SearchGoogleCloudPlatformPricingCalculator(driver)
                .openPage()
                .clickButtonSearch()
                .enterQuery("Google Cloud Platform Pricing Calculator");
        new ChooseCorrectResultOfSearch(driver)
                .openCalculator();
        FillingOutTheForm fillingOutTheForm = new FillingOutTheForm(driver)
                .activateNumberOfInstance(dataForFillingOutTheForm)
                .selectOperatingSystem(dataForFillingOutTheForm)
                .selectMachineClass(dataForFillingOutTheForm)
                .selectMachineType(dataForFillingOutTheForm)
                .checkTheBox()
                .inputNumberOfNodes(dataForFillingOutTheForm)
                .selectGRUsType(dataForFillingOutTheForm)
                .selectNumberOfGRUsType(dataForFillingOutTheForm)
                .selectLocalSSD(dataForFillingOutTheForm)
                .selectLocation(dataForFillingOutTheForm)
                .selectCommittedUsage(dataForFillingOutTheForm)
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
}

