package page.bringItOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondPageBringItOn {
    public WebDriver driver;
   // private static final String checkTitle="//div[@class='info-top']";

    public SecondPageBringItOn(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/h1")
    private WebElement checkTitle;

    @FindBy(xpath = "//ol[@class='bash']")
    private WebElement checkSyntax;

    @FindBy(xpath = "//textarea[@class='textarea']")
    private WebElement checkPasteText;


    public boolean hasResultOfTextValidated(String expectedCode){
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("de1")));
        return checkPasteText.getText().contains(expectedCode);
    }
 public boolean hasResultOfTitleValidated(String expectedTitle){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.className("post-view")));
        return checkTitle.getText().contains(expectedTitle);
 }

public boolean hasSyntaxRight(String expectedSyntax){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.className("bash")));
       if(checkSyntax.equals(expectedSyntax)) {
           return true;
       }
           return false;

}
}
