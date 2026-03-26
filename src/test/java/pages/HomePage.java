package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HomePage extends BasePage{

    @FindBy(css = ".nav-link[data-test='nav-sign-in']") private WebElement signInBtn;



    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomepage(){
        loadHomePage();
    }

    public void clickOnSignInBtn(){
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(signInBtn));
        signInButton.click();
    }
}
