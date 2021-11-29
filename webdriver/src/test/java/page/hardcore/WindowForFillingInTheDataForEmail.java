package page.hardcore;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class WindowForFillingInTheDataForEmail extends AbstractHelperClass{
    ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());


    public WindowForFillingInTheDataForEmail(WebDriver driver) {
        super(driver);
    }




}
