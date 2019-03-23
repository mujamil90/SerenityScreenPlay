package com.ui.serenity.screenplay.features.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login/login.feature",
				 glue = "com.ui.serenity.screenplay.cucumber.steps")
public class LoginRunner {}
