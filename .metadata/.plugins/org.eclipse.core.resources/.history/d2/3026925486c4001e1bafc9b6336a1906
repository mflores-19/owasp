package com.owasp.tests;

import static org.testng.Assert.assertEquals;

import java.util.Locale;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.owasp.utils.BaseTest;

public class AddressTest extends BaseTest{

	Faker faker = new Faker(new Locale("en-US"));
	
	@Test
	public void addAddressTest() {
		String fcountry = faker.country().name();
		String name = faker.name().firstName();
		String state = faker.address().state();
		//String zip = faker.address().zipCodeByState(state);
		String address = faker.address().fullAddress();
		String city = faker.address().city();
		
		
		homePage.goToRegister();
		registerPage.registerUserDataProvided("maila@mail.com", "pass123", "pass123", "sensa");
		homePage.goToLogin();
		loginPage.login("maila@mail.com", "pass123");
		homePage.goToAddAddress();
		addressPage.addNewAddress(fcountry, name, "1234567890", "34567", address, city, state);
		
		assertEquals(addressPage.completeRegistration(), true);
	}
}
