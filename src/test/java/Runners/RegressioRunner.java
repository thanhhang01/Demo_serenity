package Runners;

import org.junit.platform.suite.api.*;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
//login feature/steps
@SelectClasspathResource("ui")
//Step definition for login
@SelectPackages("stepdefinition")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepdefinition")
@IncludeTags("regression")
public class RegressioRunner {
}
