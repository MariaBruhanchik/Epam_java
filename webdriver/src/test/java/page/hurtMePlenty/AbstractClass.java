package page.hurtMePlenty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractClass {
    protected WebDriver driver;

    protected final int WAIT_TIMEOUT_SECONDS = 40;

    protected AbstractClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
