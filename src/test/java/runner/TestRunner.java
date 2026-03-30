package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepsDefinitions","customParameter", "DomainObj","hook"},
        plugin = {"pretty", "json:target/cucumber-report/cucumber.json", "html:target/cucumber-report"}
)


public class TestRunner  extends AbstractTestNGCucumberTests {
}
