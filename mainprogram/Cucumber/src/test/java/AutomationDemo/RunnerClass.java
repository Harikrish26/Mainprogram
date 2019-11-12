package AutomationDemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\Uma-Hari\\eclipse-workspace\\Cucumber\\src\\test\\java\\AutomationDemo\\Demopractice.feature",
		glue="AutomationDemo",
		dryRun=false,
		monochrome=true,
		plugin= {"html : html-output"}	
		)

public class RunnerClass {

}
