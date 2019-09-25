package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	AppiumDriver driver;

	public LoginPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 15, TimeUnit.SECONDS), this);

	}

	@FindBy(xpath = "//*[@id='customer_email']")
	WebElement txtUserName;
	@FindBy(xpath = "//*[@id='customer_password']")
	WebElement txtPassword;
	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	WebElement btnSignin;

	public boolean loginAsUser(String userName, String password) {
		txtUserName.click();
		txtUserName.sendKeys(userName);
		// driver.getKeyboard().sendKeys(userName);
		txtPassword.click();
		txtPassword.sendKeys(password);
		btnSignin.click();
		return true;
	}

}
