package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "src/test/resources",
        glue = {"stepdefinitions","hooks"},
<<<<<<< HEAD
        tags = "@",
=======
        tags = "@simge",
>>>>>>> 0d602b697250bc7dffb636285d19905925515c58
        dryRun = false

)

public class Runner {
}
