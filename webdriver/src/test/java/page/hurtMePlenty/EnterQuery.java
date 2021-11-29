package page.hurtMePlenty;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EnterQuery extends AbstractClass {

    public static final String HOMEPAGE_URL = "http://cloud.google.com/";


    @FindBy(xpath = "//devsite-search[@tenant-name='Google Cloud']")
    private WebElement buttonSearch;

    @FindBy(className = "devsite-search-query")
    private WebElement writeSearchQuery;

    @FindBy(className = "devsite-tabs-dropdown")
    private WebElement choiceHint;

    public EnterQuery(WebDriver driver) {
        super(driver);
    }

    public EnterQuery openPage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public EnterQuery clickButtonSearch() {
        buttonSearch.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public EnterCalculatorLink enterQuery(String query) {
        writeSearchQuery.sendKeys(query, Keys.ENTER);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return new EnterCalculatorLink(driver);
    }


}
