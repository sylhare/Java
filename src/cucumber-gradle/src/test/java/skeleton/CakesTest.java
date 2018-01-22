package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:./src/test/resources/reporting/default-cucumber-report/html",
        "json:./src/test/resources/reporting/cucumber-report.json", "pretty:./src/test/resources/reporting/default-cucumber-report/cucumber-pretty.txt",
        "usage:./src/test/resources/reporting/default-cucumber-report/cucumber-usage.json", "junit:./src/test/resources/reporting/default-cucumber-report/cucumber-results.xml" },
        features = { "./src/test/resources/features/" })
        //glue = { "./src/test/java/skeleton/" })
public class CakesTest {
}
