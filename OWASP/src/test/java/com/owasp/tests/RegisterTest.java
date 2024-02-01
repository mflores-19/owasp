package com.owasp.tests;

import static org.testng.Assert.assertEquals;

import java.util.Locale;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.owasp.utils.BaseTest;

public class RegisterTest extends BaseTest {
	Faker faker = new Faker(new Locale("en-US"));

	@Test
	public void registerUserTest() {
		String femail = faker.internet().emailAddress();
		String fpass = faker.internet().password();
		String fans = faker.superhero().name();

		homePage.goToRegister();
		registerPage.registerUser(femail, fpass, fpass, fans);
		
		assertEquals(registerPage.completeRegistration(), true);
	}
}
