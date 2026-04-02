package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AccessibilityTestingPage extends BasePage{

    @FindBy(xpath = "//h1[normalize-space()='Accessibility Testing']")
    private WebElement pageTitle;



    public AccessibilityTestingPage(WebDriver driver) {
        super(driver);
    }

    public void accessibilityPageTitleVisibility(){
        String expectedTitle = "Accessibility Testing";
        WebElement ActualTitle = wait.until(ExpectedConditions.visibilityOf(pageTitle));

        Assert.assertEquals(ActualTitle.getText(),expectedTitle);
    }
}
