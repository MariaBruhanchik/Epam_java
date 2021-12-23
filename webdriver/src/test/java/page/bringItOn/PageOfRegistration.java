package page.bringItOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageOfRegistration {
    private WebDriver driver;

    public PageOfRegistration(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
