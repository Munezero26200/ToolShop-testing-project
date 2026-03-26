package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AccountPage extends  BasePage{

@FindBy(css = "h1[data-test='page-title']") private WebElement cartPageTitle;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String getAccountPageTitle(){

        WebElement title = wait.until(ExpectedConditions.visibilityOf(cartPageTitle));

        return title.getText();
    }
}
