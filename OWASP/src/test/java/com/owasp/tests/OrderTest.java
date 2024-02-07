package com.owasp.tests;

import java.util.Locale;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.owasp.utils.BaseTest;

public class OrderTest extends BaseTest {
	Faker faker = new Faker(new Locale("en-US"));

	@Test
	public void createOrderTest() {
		String fcountry = faker.country().name();
		String name = faker.name().firstName();
		String mobile = faker.phoneNumber().cellPhone();
		String state = faker.address().state();
		String zip = faker.address().zipCode();
		String address = faker.address().fullAddress();
		String city = faker.address().city();
		String fname = faker.name().fullName();
		String fcard = faker.finance().creditCard();
		fcard = fcard.replaceAll("-", "");
		

		homePage.goToRegister();
		registerPage.registerUser("mails@mail.com", "pass123", "pass123", "sensa");
		homePage.goToLogin();
		loginPage.login("mails@mail.com", "pass123");
		homePage.goToAddAddress();
		addressPage.addNewAddress(fcountry, name, "7896541236", "85412", address, city, state);
		homePage.goToPayment();
		paymentPage.addPayment(fname, fcard);
		homePage.goToOrder();
		orderPage.createOrder();
	}
}
