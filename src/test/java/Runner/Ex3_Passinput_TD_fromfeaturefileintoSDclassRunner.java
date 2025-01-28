package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"C:\\Users\\HP\\eclipse-workspace\\Cucumber\\src\\main\\resources\\FeatureFiles\\Ex3_Pass input(TD)fromfeaturefileintoSDclass.feature"},
		glue={"Steps"}
		)





public class Ex3_Passinput_TD_fromfeaturefileintoSDclassRunner extends AbstractTestNGCucumberTests {

}
