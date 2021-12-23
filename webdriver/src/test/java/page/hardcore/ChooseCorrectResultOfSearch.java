package page.hardcore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.hurtMePlenty.DataEntry;

public class ChooseCorrectResultOfSearch extends AbstractHelperClass {
    private static final String CALCULATOR_LINK = "Google Cloud Platform Pricing Calculator";

    public ChooseCorrectResultOfSearch(WebDriver driver) {
        super(driver);
    }

    public DataEntry openCalculator() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText(CALCULATOR_LINK))).click();
        return new DataEntry(driver);
    }
}
