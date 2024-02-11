package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@smoke and @regression", 
features = {"src/test/resources/FeaturesWithTags"},
glue = {"StepDefinition"},
plugin = {"pretty", "html:target/htmlreport.html"})

public class CucumberLoginRunnerFeatures2 extends AbstractTestNGCucumberTests{

}
