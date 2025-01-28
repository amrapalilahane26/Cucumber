package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"C:\\Users\\HP\\eclipse-workspace\\Cucumber\\src\\main\\resources\\FeatureFiles\\Ex5_Generate Report in Cucumber.feature"},
		glue = {"Steps"},
		publish = true
		)

		
public class Ex5_GenerateReportinCucumberRunner extends AbstractTestNGCucumberTests{

}


