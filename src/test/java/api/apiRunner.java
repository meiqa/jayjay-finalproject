package api;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"api.stepDefinitions"},
        features = {"src/test/resources/api/features"},
        tags = "@api",
        plugin = {"pretty", "html:reports/api/api-report.html", "json:reports/api/api-report.json"}
)

public class apiRunner {

}