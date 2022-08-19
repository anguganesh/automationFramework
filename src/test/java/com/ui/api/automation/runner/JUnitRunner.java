package com.ui.api.automation.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "./Features",
		glue = {"com.ui.api.automation.steps",
				"com.ui.api.automation.configuration"},
		plugin = {"pretty","html:target/cucumberHTML/cucumber-html-report.html",
				   "json:target/cucumberJson/cucumber.json", 				
				   "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" 
				},
		monochrome = true,
		publish = true,
		dryRun = false
				
		
		)

public class JUnitRunner {

}
