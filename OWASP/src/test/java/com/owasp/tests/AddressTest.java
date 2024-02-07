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
		String mobile = faker.phoneNumber().cellPhone();
		String state = faker.address().state();
		String zip = faker.address().zipCode();
		String address = faker.address().fullAddress();
		String city = faker.address().city();
		
		mobile = mobile.replaceAll(".", "");
		zip = zip.replaceAll("-", "");
		
		
		homePage.goToRegister();
		registerPage.registerUser("maila@mail.com", "pass123", "pass123", "sensa");
		homePage.goToLogin();
		loginPage.login("maila@mail.com", "pass123");
		homePage.goToAddAddress();
		addressPage.addNewAddress(fcountry, name, "7896541236", "85412", address, city, state);
		
		assertEquals(addressPage.completeRegistration(), true);
	}
}
