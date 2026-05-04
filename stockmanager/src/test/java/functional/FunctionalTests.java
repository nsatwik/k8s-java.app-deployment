package functional;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        features = "classpath:features/",
        plugin = "html:build/reports/cucumber",
        glue = "functional",
        dryRun = false)
public class FunctionalTests {

}
