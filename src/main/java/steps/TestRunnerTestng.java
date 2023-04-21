package steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src\\main\\java\\features"}, tags = "@regression or @smoke",
glue = "steps", plugin = {"pretty","html:src\\main\\resources\\reports\\cucumber.html"}, monochrome = true)
public class TestRunnerTestng extends AbstractTestNGCucumberTests {

}
