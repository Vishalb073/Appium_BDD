import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class appLaunch {

    AndroidDriver driver;

    private static final String APP_ANDROID = "https://github.com/cloudgrey-io/the-app/releases/download/v1.9.0/TheApp-v1.9.0.apk";
    private static final String APPIUM = "http://localhost:4723";

    private static final By URL_INPUT = AppiumBy.accessibilityId("urlInput");
    private static final By WEBVIEW_BTN = AppiumBy.accessibilityId("Webview Demo");

    @Test
    public void setUp() throws MalformedURLException, InterruptedException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setAutomationName("UiAutomator2")
                .setPlatformName("Android")
                .setPlatformVersion("14.0")
                .setNoReset(true)
                .amend("deviceName","27251JEGR06423")
                .amend("appPackage","in.amazon.mShop.android.shopping")
                .amend("appActivity", "com.amazon.mShop.navigation.MainActivity")
                .amend("noReset", true);


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }

//    @Test
//    public void loginTest(){
//  "in.amazon.mShop.android.shopping"
//    "com.amazon.mShop.navigation.MainActivity"

//    }
@Test
public void testHybridAppMultipleContext() throws InterruptedException {
//    TakesScreenshot screenshot = ((TakesScreenshot)driver);
//    File src = screenshot.getScreenshotAs(OutputType.FILE);
//    driver.findElement(WEBVIEW_BTN).click();
//
//    WebElement url = driver.findElement(URL_INPUT);
//    WebElement btn = driver.findElement(AppiumBy.accessibilityId("navigateBtn"));
//
//    url.sendKeys("https://cloudgrey.com");
//    btn.click();
//
//    assert driver.switchTo().alert().getText().contains("Sorry");
//    driver.switchTo().alert().accept();
//
//    Thread.sleep(1000);
//    driver.context(getWebContext(driver));
//    Thread.sleep(1000);
//
//    assert driver.findElement(By.cssSelector("body > center > h1")).getText().equals("Please navigate to a webpage");
//
//    Thread.sleep(1000);
//    driver.context("NATIVE_APP");
//    Thread.sleep(1000);
//
//    url.clear();
//    url.sendKeys("https://appiumpro.com");
//    btn.click();
//
////        driver.get("https://cloudgrey.io");
//    Thread.sleep(1000);
//    driver.context(getWebContext(driver));
//    Thread.sleep(1000);

//    assert new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.titleContains("Appium Pro"));

}

}
