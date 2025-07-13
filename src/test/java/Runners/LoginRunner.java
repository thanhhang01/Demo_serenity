package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.platform.suite.api.*;
import org.junit.runner.RunWith;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
//login feature/steps
@SelectClasspathResource("ui/Login")
//Step definition for login
@SelectPackages("stepdefinition.login")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepdefinition.login")
@IncludeTags("Login_OK")

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/resources/ui/Login",
//        glue = "stepdefinitions.login",
//        plugin = {"pretty", "html:target/cucumber-reports/html", "json:target/cucumber.json"},
//        monochrome = true
//)
public class LoginRunner {
}
