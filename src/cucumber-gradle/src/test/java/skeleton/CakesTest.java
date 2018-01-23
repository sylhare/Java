package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:./cucumber/default-cucumber-report/html",
                            "json:./cucumber/cucumber-report.json",
                            "pretty:./cucumber/default-cucumber-report/cucumber-pretty.txt",
                            "usage:./cucumber/default-cucumber-report/cucumber-usage.json",
                            "junit:./cucumber/default-cucumber-report/cucumber-results.xml" },
                features = { "./src/test/resources/features/" })
                //glue = { "./src/test/java/skeleton/" })
public class CakesTest {
}
