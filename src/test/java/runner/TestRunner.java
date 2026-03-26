package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepsDefinitions","customParameter", "DomainObj","hook"},
        plugin = {"pretty","html:target/cucumber.html",
                "html:target/cucumber/cucumber.html"}




)

public class TestRunner  extends AbstractTestNGCucumberTests {
}
