package page.bringItOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class PasteCreator {

    private WebDriver driver;
    private final int WAIT_TIMEOUT_SECONDS = 30;
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

    @FindBy(xpath = "//*/a[@href='/login']")
    private WebElement pressLogin;

    public PasteCreator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public PasteCreator openPage() {
        driver.get("https://pastebin.com/");
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public PageOfRegistration signInToProfile(){
        pressLogin.click();
        return new PageOfRegistration(driver);
    }

    public PasteCreator searchForTerms(String term) {
        searchInput.sendKeys(term);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public PasteCreator selectForDropDownHighlight(String element) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dropDownHighlight.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(HIGHLIGHT_CHOICE,element)));
        webElement.click();
        return this;
    }

    public PasteCreator selectForDropDownExpiration(String element) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        dropDownExpiration.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        WebElement webElement = driver.findElement(By.xpath(String.format(EXPIRATION_CHOICE,element)));
        webElement.click();
        return this;
    }

    public TestHelper pasteTitle(String nameOfTitle) {
        writeTitle.sendKeys(nameOfTitle);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
        buttonCreateNewPaste.click();
        return new TestHelper(driver);

    }

}


