package page.hurtMePlenty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterCalculatorLink extends InitDriverChrome {

    private static final String CALCULATOR_LINK = "Google Cloud Platform Pricing Calculator";

    public EnterCalculatorLink(WebDriver driver) {
        super(driver);
    }

    public DataEntry openCalculator() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText(CALCULATOR_LINK))).click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return new DataEntry(driver);
    }
}
