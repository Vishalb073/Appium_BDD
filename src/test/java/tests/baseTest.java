package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class baseTest extends ExtentReDemo {
     AndroidDriver driver;
     @BeforeTest
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

        driver = new AndroidDriver(url , capabilities);

    }
    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
