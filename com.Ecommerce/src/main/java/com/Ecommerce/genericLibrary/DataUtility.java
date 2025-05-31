package com.Ecommerce.genericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class DataUtility {

	public void implicitWait(WebDriver driver, int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
}
