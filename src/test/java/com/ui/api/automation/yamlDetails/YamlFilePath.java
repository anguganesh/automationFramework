package com.ui.api.automation.yamlDetails;

public enum YamlFilePath {
	
	LOGIN_DATA_FILEPATH("./YamlData/Login/LoginPage.yaml"),
	BROWSER_DATA_FILEPATH("./YamlData/BrowserData/BrowserDetails.yaml");
	
	private final String filePath;
	
	private YamlFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public String getFilePath() {
		return filePath;
	}
}
