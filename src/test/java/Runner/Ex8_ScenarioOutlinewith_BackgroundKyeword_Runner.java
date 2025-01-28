package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = {"C:\\Users\\HP\\eclipse-workspace\\Cucumber\\src\\main\\resources\\FeatureFiles\\'Ex8_ScenarioOutlinewith_BackgroundKyeword.feature"},
		glue = {"Steps"}
		
		
		)
public class Ex8_ScenarioOutlinewith_BackgroundKyeword_Runner extends AbstractTestNGCucumberTests{

}
