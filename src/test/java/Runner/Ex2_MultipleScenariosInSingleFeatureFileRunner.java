package Runner;

import io.cucumber.java.en.Then;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features= {"C:\\Users\\HP\\eclipse-workspace\\Cucumber\\src\\main\\resources\\FeatureFiles\\Ex2_MultipleScenariosInSingleFeatureFile.feature"},
		glue= {"Steps"}
		
		
		)

public class Ex2_MultipleScenariosInSingleFeatureFileRunner extends AbstractTestNGCucumberTests{


}