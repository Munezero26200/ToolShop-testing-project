package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class HomePage extends  BasePage {


    @FindBy(css = "a.mega[aria-haspopup='true']") private WebElement serviceMenu;
    @FindBy(xpath = "(//a[contains(text(),'Accessibility Testing')])[1]") private WebElement accessibilitySubMenu;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void openHomePage(){
        loadHomePage();
    }
    public void hoverOverElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(serviceMenu).pause(Duration.ofSeconds(5)).perform();

    }

    public void navigateToAccessibilityTesting() {
        hoverOverElement(serviceMenu);
        ((JavascriptExecutor) driver).executeScript(
                "document.querySelector(\"a[href*='accessibility-testing']\").click();"
        );
    }


}
