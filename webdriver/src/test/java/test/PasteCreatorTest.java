package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.bringItOn.PasteCreator;
import page.bringItOn.TestHelper;

public class PasteCreatorTest {
    private static WebDriver driver = new ChromeDriver();
    private static TestHelper testHelper = new TestHelper(driver);


    @Before
    public void createNewPaste() {
        new PasteCreator(driver)
                .openPage()
                .searchForTerms("git config --global user.name  \"New Sheriff in Town\"\n" +
                        "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                        "git push origin master --force")
                .selectForDropDownExpiration("10 Minutes")
                .selectForDropDownHighlight("Bash")
                .pasteTitle("how to gain dominance among developers");

    }

    @Test
    public void resultOfTextIsCorrect() {
        Assert.assertTrue(testHelper.hasResultOfTextValidated("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force"));
    }
   

    @Test
    public void resultOfTitleIsCorrect() {
        Assert.assertTrue(testHelper.hasResultOfTitleValidated("how to gain dominance among developers"));
    }

    @Test
    public void resultOfSyntaxIsCorrect() {
        Assert.assertTrue(testHelper.hasSyntaxRight("Bash"));
    }

    @After
    public void browserTearDown(){
        driver.quit();
        driver=null;
    }

}

