package page.hurtMePlenty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InitDriverChrome {
    protected WebDriver driver;

    protected final int WAIT_TIMEOUT_SECONDS = 40;

    protected InitDriverChrome(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
