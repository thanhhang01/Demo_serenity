package Runners;

import org.junit.platform.suite.api.*;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
//login feature/steps
@SelectClasspathResource("ui/Login")
//Step definition for login
@SelectPackages("stepdefinition.login")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepdefinition.login")
@IncludeTags("Login_OK")
public class LoginRunner {
}
