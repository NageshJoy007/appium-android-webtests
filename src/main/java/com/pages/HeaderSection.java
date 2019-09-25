package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HeaderSection {

	@FindBy(xpath = "//a[contains(text(),'Login/Register')]")
	public WebElement linkLoginOrRegister;

	String parentWindow;
	AppiumDriver driver;

	public HeaderSection(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 15, TimeUnit.SECONDS), this);

	}

	public boolean clickOnLoginOrRegister() {
		linkLoginOrRegister.click();
		return true;
	}

}
