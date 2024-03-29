package com.owasp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.owasp.utils.BasePage;

public class PaymentPage extends BasePage{
	public WebDriver driver;
	
	By addPay = By.id("mat-expansion-panel-header-0");
	By name = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[1]/div/div[1]/div[3]/input");
	By cardNumber = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[2]/div/div[1]/div[3]/input");
	By expiryMonth = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[3]/div/div[1]/div[3]/select");
	By selExpMonth = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[3]/div/div[1]/div[3]/select/option[2]");
	//*[@id="mat-input-13"]/option[3]
	By expiryYear = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[4]/div/div[1]/div[3]/select");
	By selExpYear = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-payment-methods/mat-card/app-payment-method/div/div/mat-expansion-panel/div/div/div/mat-form-field[4]/div/div[1]/div[3]/select/option[2]");
	//*[@id="mat-input-14"]/option[3]
	By submitBtn = By.id("submitButton");
	
	By succMsg = By.className("mat-simple-snack-bar-content");

	public PaymentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void addPayment(String xname, String xcardNumber) {
		click(addPay);
		type(name, xname);
		type(cardNumber, xcardNumber);
		//type(expiryMonth, xexpiryYear);
		click(expiryMonth);
		click(selExpMonth);
		click(expiryYear);
		click(selExpYear);
		click(submitBtn);
	}
	
	public boolean completeRegistration() {
		if(isDisplayed(succMsg)) {
			return true;
		}
		return false;
	}
}
