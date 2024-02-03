package com.owasp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.owasp.utils.BasePage;

public class AddressPage extends BasePage{
	
	public AddressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;
	
	By addAddr = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-saved-address/div/app-address/mat-card/div/button");
	By country = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[1]/mat-form-field[1]/div/div[1]/div[3]/input");
	By uName = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[1]/mat-form-field[2]/div/div[1]/div[3]/input");
	By mobile = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[1]/mat-form-field[3]/div/div[1]/div[3]/input");
	By zipCode = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[1]/mat-form-field[4]/div/div[1]/div[3]/input");
	By address = By.id("address");
	By city = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[1]/mat-form-field[6]/div/div[1]/div[3]/input");
	By state = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[1]/mat-form-field[7]/div/div[1]/div[3]/input");
	By submit = By.id("submitButton");
	
	By succMsg = By.className("mat-simple-snack-bar-content");
	
	public void addNewAddress(String xcountry, String xname, String xmobile, String xzip, String xaddress, String xcity, String xstate) {
		click(addAddr);
		type(country, xcountry);
		type(uName, xname);
		type(mobile, xmobile);
		type(zipCode, xzip);
		type(address, xaddress);
		type(city, xcity);
		type(state, xstate);
		click(submit);
	}
	
	public boolean completeRegistration() {
		if(isDisplayed(succMsg)) {
			return true;
		}
		return false;
	}
}
