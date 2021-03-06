package com.org.coop.beans;

import java.util.List;

public class InputBean {
	private String jsonInput;
	private String jsonOutput;
	private List<String> requestMethod;
	private String url;
	private String username;
	private String password;
	
	public String getJsonInput() {
		return jsonInput;
	}
	public void setJsonInput(String jsonInput) {
		this.jsonInput = jsonInput;
	}
	public String getJsonOutput() {
		return jsonOutput;
	}
	public void setJsonOutput(String jsonOutput) {
		this.jsonOutput = jsonOutput;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<String> getRequestMethod() {
		return requestMethod;
	}
	public void setRequestMethod(List<String> requestMethod) {
		this.requestMethod = requestMethod;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
