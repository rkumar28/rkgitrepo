package Hook;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
			features = "Features"
			,glue= {"stepDefinition"}
			//,tags = {"@Demo"}
			//,tags = {"@UDev"}			
			,tags = {"@RegisterTest"}
			,plugin = { "pretty", "html:target/cucumber-reports",
					   "junit:target/cucumber-reports/Cucumber.xml"},
					   monochrome = true
		) 
public class TestRunner {

}
