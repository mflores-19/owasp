package com.owasp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.owasp.utils.BasePage;

public class LoginPage extends BasePage{

	public WebDriver driver;
	
	By email = By.id("email");
	By pass = By.id("password");
	By loginBtn = By.id("loginButton");
	
	By basket = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void login(String xemail, String xpass) {
		type(email, xemail);
		type(pass, xpass);
		click(loginBtn);
	}
	
	public boolean logedSucc() {
		find(basket);
		if(isDisplayed(basket)) {
			return true;
		}
		return false;
	}
}
