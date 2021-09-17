package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\features\\login.feature",
                glue="stepDefinition",
                dryRun=false
		        )

public class TestRunnerJUnitClass {

}

