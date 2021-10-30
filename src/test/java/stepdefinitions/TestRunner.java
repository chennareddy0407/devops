package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/Feature/", glue= "stepdefinitions",plugin={"pretty","html:target/cucumber-reports","json:target/JSONReports/report.json"}, tags="@rags")
public class TestRunner {
	
	}
