package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import page.hurtMePlenty.FirstPageOfSearch;
import page.hurtMePlenty.SecondPageOfSearch;
import page.hurtMePlenty.ThirdPageOfSearch;


public class HurtMePlentyTest {

    private  WebDriver driver=new ChromeDriver();

    @Before
    public void scriptResultOfApplication(){
        new FirstPageOfSearch(driver)
                .openPage()
                .clickButtonSearch()
                .enterQuery("Google Cloud Platform Pricing Calculator");
        new SecondPageOfSearch(driver)
                .openCalculator();
        new ThirdPageOfSearch(driver)
                .activateNumberOfInstance("4")
                .selectOperatingSystem()
                .selectMachineClass()
                .selectMachineType()
                .inputNumberOfNodes("1")
                .checkTheBox()
                .selectGRUsType()
                .selectNumberOfGRUsType()
                .selectLocalSSD()
                .selectLocation()
                .selectCommittedUsage()
                .pressAddToEstimate();
    }


    @Test
    public void resultsOfApplicationIsNotEmpty()  {
        WebElement testResult=driver.findElement(By.xpath("//*/md-card/md-toolbar/div/h2"));
        String resultIsNotEmpty = testResult.getText() ;
        Assert.assertEquals("Estimate", resultIsNotEmpty);
    }


    @Test
    public void theRegionIsCorrect(){
        String currentRegion=driver.findElement(By.xpath("//*/md-list/md-list-item[1]/div")).getText();
        Assert.assertEquals("Region: Belgium",currentRegion);
    }


    @Test
    public void theCommitmentTermIsCorrect(){
        Assert.assertTrue(driver.findElement(By.xpath("//*/md-list/md-list-item[3]/div"))
                .getText().contains("Commitment term: 1 Year"));
    }


    @Test
    public void localSSDIsCorrect(){
        Assert.assertTrue(driver.findElement(By.xpath("//*/md-list/md-list-item[5]/div[1]"))
                .getText().contains("Local SSD: 24x375 GiB"));
    }

    @Test
    public void instanceTypeIsCorrect(){
        Assert.assertTrue(driver.findElement(By.xpath("//*/md-list/md-list-item[4]/div[1]"))
                .getText().contains("Instance type: n1-node-96-624"));
    }
    @After
    public void browserTearDown(){
        driver.quit();
        driver=null;
    }
}