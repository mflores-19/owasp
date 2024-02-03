package com.owasp.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	WebDriverWait wait;
	//WebElement selectElement;
	int timeOutSec = 10;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		//Select select = new Select(selectElement);
		wait = new WebDriverWait(driver, Duration.ofSeconds(Variables.timeOut));
	}
	
	public void setTimeoutSec(int timeOutSec) {
		this.timeOutSec = timeOutSec;
	}
	
	public void visit(String url) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOutSec));
		driver.get(Variables.baseURL);
	}

	// Find Element
	public WebElement find(By element) {
		return driver.findElement(element);
	}

	// Click element
	public void click(By element) {
		find(element).click();
	}

	// Type
	public void type(By element, String text) {
		find(element).sendKeys(text);
	}

	// Verify an element is displayed
	public boolean isDisplayed(By element) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(element));
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}