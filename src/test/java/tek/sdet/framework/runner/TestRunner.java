package tek.sdet.framework.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@Test1",
		features = "classpath:features",   //is a parameter that provides the path of the Feature file
		glue = "tek.sdet.framework",  //is another parameter, that provides the path of the step definitions class. 
		                              //We don't write .steps because we don't want limit one package but every package start with: tek.sdet.framework
		dryRun = false,           //True: it's gonna check and I need steps and feature file which are missing a step definition. It's gonna generate them and it's gonna print them and console.
		                          //False: it will move on not check steps
		plugin = {
				"pretty",                                         //basic report (how many pass - how many fail)
                "html:target/htmlReports/cucumber-pretty.html",   //able to use send email to manager as report (with details)
                "json:target/jsonReports/cucumber.json"           //json file which os used by cucumber JVM report to generate the charts and graphs false cases and passed cases
        },
		snippets = CAMELCASE,          //how test case name will be store. CAMELCASE: 
		monochrome = true //set true log will be readable - false will not be readable
		)
 
//run class by Junit not Java
public class TestRunner {
	
}
