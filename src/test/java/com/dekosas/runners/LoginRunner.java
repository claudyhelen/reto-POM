package com.dekosas.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/feature/login.feature",
        glue = "com.dekosas.stepDefinitions",
        snippets = SnippetType.CAMELCASE

)

public class LoginRunner {
}
