package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",glue = "steps",tags = "@regression or @smoke",monochrome = true,publish = true)
public class RunTest extends AbstractTestNGCucumberTests {
}
