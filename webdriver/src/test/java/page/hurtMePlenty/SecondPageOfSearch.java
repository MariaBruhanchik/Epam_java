package page.hurtMePlenty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondPageOfSearch extends AbstractClass {

    public static final String CALCULATOR_LINK = "Google Cloud Platform Pricing Calculator";

    public SecondPageOfSearch(WebDriver driver) {
        super(driver);
    }

    public ThirdPageOfSearch openCalculator() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText(CALCULATOR_LINK))).click();
        return new ThirdPageOfSearch(driver);
    }


}
