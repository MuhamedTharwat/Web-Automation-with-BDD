package runner;

import base.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/resources/Features/Login.feature",
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/cucumber.html"}
)
public class TestRunner extends BaseClass {
}
