package StepsDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AccessibilityTestingPage;
import pages.HomePage;

public class AccessibilityTestingInfoSteps {

    private WebDriver driver;
    private HomePage homePage;


    @Given("I am on the home page")
    public void beOnHomePage() {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        homePage.openHomePage();
    }
    @When("I navigate to ACCESSIBILITY TESTING from service menu")
    public void navigateAccessibilityTestingPage() {
        homePage.navigateToAccessibilityTesting();

    }
    @Then("I should be on accessibility-testing page confirmed by this title {string}")
    public void titleDisplayed(String expectedTitle) {
        AccessibilityTestingPage accessibilityTestingPage = new AccessibilityTestingPage(driver);
        accessibilityTestingPage.accessibilityPageTitleVisibility();
    }


}
