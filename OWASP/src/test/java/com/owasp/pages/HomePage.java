package com.owasp.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.owasp.utils.BasePage;
import com.owasp.utils.Variables;

public class HomePage extends BasePage{

	WebDriver driver;

	// HTML Objects
	By account = By.id("navbarAccount");
	By login = By.id("navbarLoginButton");
	By newCustomer = By.linkText("Not yet a customer?");
	By loginLink = By.linkText("Log in");
	By ordersNPay = By.xpath("/html/body/div[3]/div[2]/div/div/div/button[2]");
	By address = By.xpath("/html/body/div[3]/div[3]/div/div/div/button[3]");
	By payment = By.xpath("//*[@id=\"mat-menu-panel-3\"]/div/button[4]");
	
	//By dis = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-welcome-banner/div/div[2]/button[2]");
	By dis = By.xpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]");
	By meWant = By.linkText("Me want it!");
	
	By mainPage = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[2]/span[1]/span");
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		visit(Variables.baseURL);
		// TODO Auto-generated constructor stub
	}

	public HomePage(WebDriver driver, int timeoutSec) {
		super(driver);
		setTimeoutSec(timeoutSec);
	}
	
	public void dismissButtons() {
		wait.until(ExpectedConditions.presenceOfElementLocated(dis));
		click(dis);
		click(meWant);
	}
	
	public void goToRegister() {
		dismissButtons();
		click(account);
		click(login);
		find(newCustomer).click();
	}

	public void goToLogin() {
		click(account);
		click(login);
	}
	
	public void goToAddAddress() {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(account));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		click(account);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ordersNPay));
		click(ordersNPay);
		click(address);
	}
	
	public void goToPayment() {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(account));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		click(account);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ordersNPay));
		click(ordersNPay);
		click(payment);
	}
	
	public void goToOrder() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		click(mainPage);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
