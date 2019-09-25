package com.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	AppiumDriver driver;

	public HomePage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 15, TimeUnit.SECONDS), this);

	}

	public boolean accessUrl(String url) {
		driver.get(url);
		return true;
	}

}
