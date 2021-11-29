package page.hardcore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class AbstractHelperClass {
    protected WebDriver driver;

    protected final int WAIT_TIMEOUT_SECONDS = 40;

    protected AbstractHelperClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
