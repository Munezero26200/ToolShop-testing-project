package pages;

import Utils.ConfigLoader;
import constants.EndPoint;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected final String baseUrl;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.baseUrl = ConfigLoader.getInstance().getBaseUrl();

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);

    }

    public void load(EndPoint endPoint){
        driver.get( baseUrl + endPoint.url);
    }
    public void loadHomePage(){
        driver.get(baseUrl);
    }
}
