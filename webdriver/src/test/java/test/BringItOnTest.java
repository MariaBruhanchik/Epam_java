package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.bringItOn.BringItOn;
import page.bringItOn.SecondPageBringItOn;

public class BringItOnTest {
    private static WebDriver driver;
    private static BringItOn firstPage;
    private static SecondPageBringItOn secondPage;


@BeforeClass
    public void createObjects() {
    driver = new ChromeDriver();
    firstPage = new BringItOn(driver);
    secondPage = new SecondPageBringItOn(driver);
    driver.manage().window().maximize();

}
    @Test
    public void createNewPaste() {
        firstPage
                .openPage()
                .searchForTerms("git config --global user.name  \"New Sheriff in Town\"\n" +
                        "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                        "git push origin master --force")
                .selectForDropDownExpiration("10 Minutes")
                .selectForDropDownHighlight("Bash")
                .pasteTitle("how to gain dominance among developers")
                .hasResultOfTextValidated("git config --global user.name  \"New Sheriff in Town\"\n" +
                        "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                        "git push origin master --force");


    }


}

