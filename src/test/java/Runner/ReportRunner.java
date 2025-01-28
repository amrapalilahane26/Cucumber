package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\HP\\eclipse-workspace\\Cucumber\\src\\main\\resources\\FeatureFiles\\Report.feature"},
		glue = {"Steps"},
	    plugin = {"pretty"},
		publish = true
		
		
		
		)
public class ReportRunner extends AbstractTestNGCucumberTests {

	
	
}
