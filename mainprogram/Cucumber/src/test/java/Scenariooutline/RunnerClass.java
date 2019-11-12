package Scenariooutline;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Uma-Hari\\eclipse-workspace\\Cucumber\\src\\test\\java\\Scenariooutline\\DemoAutomation.feature",
		glue="Scenariooutline",
		dryRun=false,
		monochrome=true
		)

public class RunnerClass {

}
