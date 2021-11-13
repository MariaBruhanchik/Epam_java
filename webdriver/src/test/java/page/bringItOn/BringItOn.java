package page.bringItOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BringItOn {

    private WebDriver driver;
    private final int WAIT_TIMEOUT_SECONDS = 10;
    private static final String HIGHLIGHT_CHOICE="//ul[@id='select2-postform-format-results']//*[text()='Bash']";
    private static final String EXPIRATION_CHOICE="//*[@id='select2-postform-expiration-results']//*[text()='10 Minutes']";


    @FindBy(xpath = "//span[contains(@class,'select2-container')and @data-select2-id='1']")
    private WebElement dropDownHighlight;

    @FindBy(id = "postform-text")
    private WebElement searchInput;


    @FindBy(xpath = "//span[contains(@class,'select2-container')and @data-select2-id='3']")
    private WebElement dropDownExpiration;


    @FindBy(xpath = "//*[@id='postform-name']")
    private WebElement writeTitle;

    @FindBy(xpath = "//button[contains(text(),'Create New Paste')]")
    private WebElement buttonCreateNewPaste;

    public BringItOn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BringItOn openPage() {
        driver.get("https://pastebin.com");
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public BringItOn searchForTerms(String term) {
        searchInput.sendKeys(term);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public BringItOn selectForDropDownHighlight(String element) {
        dropDownHighlight.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(HIGHLIGHT_CHOICE,element)));
        webElement.click();
        return this;
    }

    public BringItOn selectForDropDownExpiration(String element) {
        dropDownExpiration.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(EXPIRATION_CHOICE,element)));
        webElement.click();
        return this;
    }

    public SecondPageBringItOn pasteTitle(String nameOfTitle) {
        writeTitle.sendKeys(nameOfTitle);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        buttonCreateNewPaste.click();
        return new SecondPageBringItOn(driver);

    }

}


