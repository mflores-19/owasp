package com.owasp.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.owasp.utils.BaseTest;

public class LoginTest extends BaseTest {
	public WebDriver driver;

	// In this test Data Providers are being used because it is necessary to have a registered user to login
	// OWASP is a test page, users expires after a while, that's why registered users can't be used in this test
	// These new users will be registered and then login with their credentials
	@Test(dataProvider = "dataLogin")
	public void loginTest(String email, String pass, String ans) {
		homePage.goToRegister();
		registerPage.registerUserDataProvided(email, pass, pass, ans);
		homePage.goToLogin();
		loginPage.login(email, pass);

		assertEquals(loginPage.logedSucc(), true);
	}

	@DataProvider
	public Object[][] dataLogin() {
		return new Object[][] { new Object[] { "mail@mail.com", "pass123", "mail answer" },
				new Object[] { "admin@mail.com", "admin123", "admin answer" },
				new Object[] { "user@mail.com", "user123", "user answer" } };
	}
}
