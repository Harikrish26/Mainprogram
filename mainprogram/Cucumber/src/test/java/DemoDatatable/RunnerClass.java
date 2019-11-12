package DemoDatatable;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Uma-Hari\\eclipse-workspace\\Cucumber\\src\\test\\java\\DemoDatatable\\datatable.feature",
		glue="DemoDatatable",
		dryRun=false,
		monochrome=true,
		plugin= {"html:html-output"}
		)

public class RunnerClass {

}
