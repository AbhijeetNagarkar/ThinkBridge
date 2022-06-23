package RunnerClasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\main\\java\\FeatureFiles\\SignUp.feature",   //feature file path
		glue = {"StepDefinitions"},     // step definitions folder name
		dryRun = false,   // check mapping of feature file and step def using dry run 
		strict = true,   
		monochrome = true, //for formatted output
		format = {"pretty","html: html-output","junit: junit-output"} // formatted output using pretty and html and junit report creation
		)

public class SignUpRunnerClass {

}
