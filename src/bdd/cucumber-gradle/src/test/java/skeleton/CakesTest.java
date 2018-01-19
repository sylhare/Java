package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features/",
        format = {"pretty", "json:./src/test/resources/reporting/cucumber-report.json"})

public class CakesTest {
}
