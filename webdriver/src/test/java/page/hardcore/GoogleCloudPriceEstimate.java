package page.hardcore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class GoogleCloudPriceEstimate extends AbstractHelperClass {
   public final String priceFromTheLetter="//*[@id='mail']/div/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]";

//    @FindBy(xpath = "//*[@id='mail']/div/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td[4]")
//    private WebElement priceFromTheLetter;

    public GoogleCloudPriceEstimate(WebDriver driver) {
        super(driver);
    }

    public String priceThatHasReceived() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.id("ifmail")));
        WebElement currentPrice = driver.findElement(By.xpath(priceFromTheLetter));
        System.out.println(currentPrice.getText());
        return currentPrice.getText();


    }

}
