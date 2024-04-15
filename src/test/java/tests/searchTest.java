package tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.google;

public class searchTest extends baseTest {

    google cr = new google(driver);

    @Test
    public void test(){
        ExtentTest test1 = extent.createTest("chrome", "searching functionality");
        test1.log(Status.INFO, "test execution started");
        driver.get("https://www.google.com/");
        cr.enterSearch("harry potter");
        test1.log(Status.PASS, "search bar working fine");
        

    }
}
