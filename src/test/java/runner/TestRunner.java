package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"features","StepsDefinitions", "hook"},
        monochrome = true,
        plugin = {
                "pretty",
                "json:target/cucumber/report.json",
                "html:target/cucumber/report.html"
        }

)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}