package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FooterSection {

	@FindBy(xpath = "//button[@title='Accept Cookies']")
	public WebElement linkAcceptCookies;

	AppiumDriver driver;

	public FooterSection(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 15, TimeUnit.SECONDS), this);

	}

	public boolean clickOnAcceptCoockiePolicy() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(linkAcceptCookies));
		linkAcceptCookies.click();
		Thread.sleep(2000);
		return true;
	}

}
