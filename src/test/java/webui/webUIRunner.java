package webui;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"webui"},
        features = {"src/test/resources/webui/features"},
        tags = "@web",
        plugin = {"pretty", "html:reports/web/ui-report.html", "json:reports/web/ui-report.json"}
)


public class webUIRunner {

}