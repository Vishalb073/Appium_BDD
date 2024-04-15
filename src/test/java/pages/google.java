package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class google {

    AndroidDriver driver;

    public google(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    @FindBy(name = "q")
    WebElement searchBox;



    public void enterSearch(String value){
        searchBox.sendKeys(value);
        searchBox.sendKeys(Keys.RETURN);
    }
}
