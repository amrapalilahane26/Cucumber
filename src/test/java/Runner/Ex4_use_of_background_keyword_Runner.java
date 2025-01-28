package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"C:\\Users\\HP\\eclipse-workspace\\Cucumber\\src\\main\\resources\\FeatureFiles\\Ex4_use of background keyword.feature"},
		glue = {"Steps"}
		
		
		
		)


public class Ex4_use_of_background_keyword_Runner extends AbstractTestNGCucumberTests{

}
