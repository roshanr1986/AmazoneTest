package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/Features"},
		glue={"stepDefinition"},
		plugin = { "pretty", "html:target/cucumber-reports", "json:target/cucumber_json.json", "junit:target/cucumber-results.xml"}
		)

public class TestRunner {

}
