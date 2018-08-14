package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features={"D:\\Workspace2\\cucumberTest\\features"}
,glue={"stepdefinations","utility"}
,plugin = {"pretty", "html:target/cucumber"}
,tags ={"@web,@appium"}
)

public class Testrunner {			
	
}
