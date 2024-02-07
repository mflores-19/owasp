package com.owasp.tests;

import static org.testng.Assert.assertEquals;

import java.util.Locale;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.owasp.utils.BaseTest;

public class PaymentTest extends BaseTest{
	Faker faker = new Faker(new Locale("en-US"));
	
	@Test
	public void addPaymentTest() {
		String fname = faker.name().fullName();
		String fcard = faker.finance().creditCard();
		fcard = fcard.replaceAll("-", "");
		
		homePage.goToRegister();
		registerPage.registerUser("maila@mail.com", "pass123", "pass123", "sensa");
		homePage.goToLogin();
		loginPage.login("maila@mail.com", "pass123");
		homePage.goToPayment();
		paymentPage.addPayment(fname, fcard);
		
		assertEquals(registerPage.completeRegistration(), true);
	}
}
