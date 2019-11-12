package Tagged;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFile", 
        glue = { "Tagged", "Hooks" }, 
        dryRun = false, 
        monochrome = true, 
        plugin = {"html:html-output" }, 
        tags = "@Login")

public class RunnerClass {

}
