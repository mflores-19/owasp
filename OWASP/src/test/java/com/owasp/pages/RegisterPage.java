package com.owasp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.owasp.utils.BasePage;

public class RegisterPage extends BasePage {
	public WebDriver driver;
	
	// WebElemets HTML 
	By email = By.id("emailControl");
	By pass = By.id("passwordControl");
	By repPass = By.id("repeatPasswordControl");
	By ans = By.id("securityAnswerControl");
	
	By secQuestion = By.name("securityQuestion");
	By ansSec = By.id("mat-option-9");
	
	By registerBtn = By.id("registerButton");
	
	By succMsg = By.className("mat-simple-snack-bar-content");

	// Constructor
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	// Methods
	public void registerUser(String xemail, String xpass, String xrepPass, String xans) {
		type(email, xemail);
		type(pass, xpass);
		type(repPass, xrepPass);
		click(secQuestion);
		click(ansSec);
		type(ans, xans);
		click(registerBtn);
	}
	
	public boolean completeRegistration() {
		if(isDisplayed(succMsg)) {
			return true;
		}
		return false;
	}

}
