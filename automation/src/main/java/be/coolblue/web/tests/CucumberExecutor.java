package be.coolblue.web.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/",
        glue= {"be.coolblue.web.steps"},
        plugin = {"progress", "json:target/cucumber/json/results.json", "html:target/cucumber/html/results.html"},
        tags = "@WIP"
)

public class CucumberExecutor {

}