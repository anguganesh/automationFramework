package com.ui.api.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.ui.api.automation.common.enums.ApplicationInputs;
import com.ui.api.automation.common.enums.WebElementAttributes;
import com.ui.api.automation.configuration.Hooks;
import com.ui.api.automation.model.LoginDataModel;
import com.ui.automation.helpers.CommonFunctions;
import com.ui.automation.helpers.VisibilityHelper;



public class LoginPage extends BasePage {

   
	
	public LoginPage(Hooks hooks,
			         CommonFunctions commonFunctions,
			         VisibilityHelper visibilityHelper) {
		// TODO Auto-generated constructor stub
		super(hooks, commonFunctions, visibilityHelper);		
	}
	
	@FindBy(how = How.ID, using="")
	private WebElement username;
	@FindBy(how = How.ID, using="")
	private WebElement password;
	
	public void login(LoginDataModel inputLoginData) {
		System.out.println("Input Login Data : " + inputLoginData);
		System.out.println(driver.getTitle());
	}

	
	
		
}
