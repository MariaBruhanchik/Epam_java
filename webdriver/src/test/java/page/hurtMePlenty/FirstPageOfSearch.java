package page.hurtMePlenty;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FirstPageOfSearch extends AbstractClass {

    public static final String HOMEPAGE_URL = "http://cloud.google.com/";

    @FindBy(xpath = "//devsite-search[@tenant-name='Google Cloud']")
    private WebElement buttonSearch;

    @FindBy(className = "devsite-search-query")
    private WebElement writeSearchQuery;

    @FindBy(className = "devsite-tabs-dropdown")
    private WebElement choiceHint;

    public FirstPageOfSearch(WebDriver driver) {
        super(driver);
    }

    public FirstPageOfSearch openPage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public FirstPageOfSearch clickButtonSearch() {
        buttonSearch.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public SecondPageOfSearch enterQuery(String query) {
        writeSearchQuery.sendKeys(query, Keys.ENTER);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return new SecondPageOfSearch(driver);
    }


}
