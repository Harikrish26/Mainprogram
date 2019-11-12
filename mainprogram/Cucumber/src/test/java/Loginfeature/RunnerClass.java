package Loginfeature;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\Uma-Hari\\eclipse-workspace\\Cucumber\\src\\test\\java\\Loginfeature\\Login.feature",
		glue="Loginfeature",
		dryRun=false,
		monochrome=true,
		plugin= {"html:html-Output"}
		)

public class RunnerClass {

}
