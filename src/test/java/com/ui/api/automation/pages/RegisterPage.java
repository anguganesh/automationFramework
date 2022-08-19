package com.ui.api.automation.pages;


import com.ui.api.automation.configuration.Hooks;
import com.ui.automation.helpers.CommonFunctions;
import com.ui.automation.helpers.VisibilityHelper;

public class RegisterPage extends  BasePage {
	
	public RegisterPage(Hooks hooks,
	        CommonFunctions commonFunctions,
	        VisibilityHelper visibilityHelper) {
		// TODO Auto-generated constructor stub
		super(hooks, commonFunctions, visibilityHelper);
	}

	
	public void enterRegisterDetails() {
		System.out.println("enter register details");
		driver.getTitle();
		
	}
}
