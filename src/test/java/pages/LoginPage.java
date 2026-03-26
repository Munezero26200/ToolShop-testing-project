package pages;

import DomainObj.Email;
import DomainObj.Password;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    @FindBy(css = "input[type='email']") private WebElement emailAddressField;
    @FindBy(css = "#password") private WebElement passwordField;
    @FindBy(css = "input[type='submit']") private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginWithValidCredentials(Email email, Password password){
        WebElement emailField = wait.until(ExpectedConditions.visibilityOf(emailAddressField));
        emailField.sendKeys(email.getEmailAddress());

        WebElement fillPasswordField = wait.until(ExpectedConditions.visibilityOf(passwordField));
        fillPasswordField.sendKeys(password.getPassword());

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginButton.click();
    }


}
