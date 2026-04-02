package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepsDefinitions","hook"},
        plugin = {"pretty",
                "json:target/cucumber/report.json",
                "html:target/cucumber/report.html"}
)


public class TestRunner  extends AbstractTestNGCucumberTests {
}
