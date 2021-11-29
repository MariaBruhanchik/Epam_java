package page.bringItOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestHelper {
    public WebDriver driver;
    private static final String textLines = "/html/body/div[1]/div[2]/div[1]/div[2]/textarea";

    public TestHelper(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/h1")
    private WebElement checkTitle;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/a")
    private WebElement checkSyntax;


    public boolean hasResultOfTextValidated(String expectedCode) {
        WebElement currentResult = driver.findElement(By.xpath(textLines));
        return currentResult.getText().contains(expectedCode);
    }

    public boolean hasResultOfTitleValidated(String expectedTitle) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.className("post-view")));
        return checkTitle.getText().contains(expectedTitle);
    }

    public boolean hasSyntaxRight(String expectedSyntax) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.className("left")));
        return checkSyntax.getText().contains(expectedSyntax);

    }
}
