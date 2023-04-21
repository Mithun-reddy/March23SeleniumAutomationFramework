package steps;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\main\\java\\features"}, tags = "@regression or @smoke",
glue = "steps", plugin = {"pretty","html:src\\main\\resources\\reports\\cucumber.html"}, monochrome = true)
public class TestRunnerJunit {

}
