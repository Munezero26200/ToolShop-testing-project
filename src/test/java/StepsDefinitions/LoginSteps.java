package StepsDefinitions;

import DomainObj.Email;
import DomainObj.Password;
import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    private WebDriver driver;
    private HomePage homePage;




    @Given("I am on home page")
    public void beingOnHomePage() {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        homePage.openHomepage();
    }
    @When("I click on sign in button")
    public void clickOnSingIn() {
        homePage.clickOnSignInBtn();
    }
    @And("I login with valid {email} and {password}")
    public void iLoginWithValidAnd(Email email, Password password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithValidCredentials(email, password);
    }

    @Then("I should be redirected to Account page confirmed with this Title {string}")
    public void beOnAccountPage(String expectedTitle) {

        AccountPage accountPage = new AccountPage(driver);

        Assert.assertEquals(accountPage.getAccountPageTitle(), expectedTitle);
    }
}
