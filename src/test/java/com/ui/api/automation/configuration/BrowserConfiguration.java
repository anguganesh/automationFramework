package com.ui.api.automation.configuration;

import java.io.ByteArrayInputStream;

import org.apache.hc.core5.http.ContentType;

import com.ui.api.automation.configuration.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.qameta.allure.Allure;

public class BrowserConfiguration {

	public final Hooks hooks;
	private final ReportsConfiguration reportConfiguration;
	
	public BrowserConfiguration(Hooks hooks,
			 ReportsConfiguration allureReportConfiguration) {
		// TODO Auto-generated constructor stub
		this.hooks = hooks;
		this.reportConfiguration = allureReportConfiguration;
	}
	
	
	
	@Before
	public void openBrowser(Scenario scenario) {
		System.out.println("scenario Name : " + scenario.getName());
		System.out.println("Thread : " + Thread.currentThread().getId());
		System.out.println("Driver Address Initial : " + hooks.getDriver());
		hooks.launchBrowser();
		System.out.println("Driver Address after creating : " + hooks.getDriver());
	}

	@After
	public void closeBrowser(Scenario scenario) {
		System.out.println("Executing CloseBrowser Method");
		if(scenario.isFailed())  {
			hooks.copyScreenshotAsFile(scenario);
			scenario.attach(hooks.getScreenshotAsBytes(), ContentType.IMAGE_BMP.toString(), scenario.getName());
			Allure.addAttachment("Screenshot for test failure for scenario: " + scenario.getName(), 
					new ByteArrayInputStream(reportConfiguration.takesScreenshotForAllureReport()));
		}
		     	
		
		hooks.closeBrowser();
	}
	
	
	
}
