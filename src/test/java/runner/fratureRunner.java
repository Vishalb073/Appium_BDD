package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/vishal/android_automation/src/test/resources/features",
        glue = "stepdefination",
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class fratureRunner {
}
