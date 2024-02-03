package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features" , 
		glue = "steps" , 
		tags = "@SelectScenario3",
		plugin = {"pretty", "html:target/reports/report.html" , "json:target/reports/report.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/"} , dryRun = false
		)




public class TestRunner {

}
