package com.ui.api.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;

@io.cucumber.testng.CucumberOptions(

		features = "./Features",
		glue = { "com.ui.api.automation.steps",
				"com.ui.api.automation.configuration" }, 
		plugin = { "pretty",
				   "html:target/cucumberHTML/cucumber-html-report.html",
				   "json:target/cucumberJson/cucumber.json",
				   "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
				   }, 
		monochrome = true, 
		publish = true, 
		dryRun = false

)

public class TestNGRunner extends AbstractTestNGCucumberTests {

	/**
	 * Returns two dimensional array of {@link PickleWrapper}s with their associated
	 * {@link FeatureWrapper}s.
	 *
	 * @return a two dimensional array of scenarios features.
	 */
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		super.tearDownClass();
	}
}
