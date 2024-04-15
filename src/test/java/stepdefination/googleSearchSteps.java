package stepdefination;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.google;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


public class googleSearchSteps {

    ExtentReports extent;
    ExtentSparkReporter spark;
    AndroidDriver driver;
    ExtentTest test;
    @Before
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName" , "27251JEGR06423");
        capabilities.setCapability("platformname" ,"Android");
        capabilities.setCapability("automationName" ,"UiAutomator2");
//        capabilities.setCapability("app", System.getProperty("user.dir")+ "src/test/resources/apps/TheApp-v1.9.0.apk");
        capabilities.setCapability("platformversion" , "14");

        capabilities.setCapability("browsename","chrome");
        capabilities.setCapability("chromedriverExecutable" , "/home/vishal/Downloads/chromedriver_linux64.zip");

        URL url = URI.create("http://127.0.0.1:4723/").toURL();

        extent = new ExtentReports();
        spark = new ExtentSparkReporter("reports.html");
        extent.attachReporter(spark);

        driver = new AndroidDriver(url , capabilities);

    }
    @After
    public void tearDown(){
        driver.close();
        driver.quit();
        extent.flush();
    }
    google gle = new google(driver);
    @Given("Google page open in browser")
    public void google_page_open_in_browser() {
        test.log(Status.INFO, "test execution started");
    }

    @When("the search phase {string} is enterd")
    public void the_search_phase_is_enterd(String string) {
       gle.enterSearch(string);
    }

    @Then("result shown")
    public void result_shown() {
        test.log(Status.PASS, "test execution started");
    }

}
