package com.ui.api.automation.steps;

import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.ui.api.automation.configuration.Hooks;
import com.ui.api.automation.model.LoginDataModel;
import com.ui.api.automation.pages.LoginPage;
import com.ui.api.automation.pages.RegisterPage;
import com.ui.api.automation.yamlDetails.YamlFilePath;
import com.ui.automation.helpers.YamlHelper;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;



public class LoginStepDefn {
	
	private final LoginPage loginPage;
	private final YamlHelper yamlHelper;
	private final Hooks hooks;
	private LoginDataModel inputLoginData;
	
	public LoginStepDefn(LoginPage loginPage,						 
			 			 YamlHelper yamlHelper,
			 			 Hooks hooks) {
		this.hooks = hooks;		
		this.loginPage = loginPage;
		this.yamlHelper = yamlHelper;
		
	}
	
		
	
	@Given("User has to login first")
	public void userHasToLoginFirst() {	
		
		setLoginPagePojo();
		System.out.println(inputLoginData);
		loginPage.login(inputLoginData);
	    System.out.println("Executed in User has to login first");
	}

	@Given("User navigate to {string}")
	public void user_navigate_to(String url) {
	    hooks.getDriver().get(url);
	    System.out.println(hooks.getDriver().getTitle());
	}
	
	@Given("User navigates to {string}")
	public void user_navigates_to(String url) {
		hooks.getDriver().get(url);
	    Assert.assertTrue(false);
	}
	
	@Given("User click on logoff in HomePage")
	public void userClickLogoff() {
		System.out.println("HomePage in gherkin line");		
	}
	
	@Given("User click on logoff")
	public void userClickLogoffAgain() {
		Assert.assertTrue(true);
		System.out.println("LogOff in gherkin line");
	}
	
	@Given("finally Validated")
	public void finallValidated() {
		Assert.assertTrue(true);
		System.out.println("LogOff in gherkin line");
	}
	
	@Given("finally twist")
	public void finTwist() {
		Assert.assertTrue(true);
		System.out.println("final Twist");
	}

	@Given("finally twist2")
	public void finTwist2() {
		Assert.assertTrue(true);
		System.out.println("final Twist2");
	}
	
	
	
	
	public LoginDataModel setLoginPagePojo()  {
		try {
			inputLoginData = yamlHelper.readYamlToPojo(LoginDataModel.class, YamlFilePath.LOGIN_DATA_FILEPATH.getFilePath());
		} catch (IOException IoEx) {
			System.out.println("Yaml to POJO exception: " + IoEx.getMessage());
		}
		return inputLoginData;		
	}

}
