package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepsDefinitions","customParameter", "DomainObj","hook"},
        plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber-html-report"}




)

public class TestRunner  extends AbstractTestNGCucumberTests {
}
