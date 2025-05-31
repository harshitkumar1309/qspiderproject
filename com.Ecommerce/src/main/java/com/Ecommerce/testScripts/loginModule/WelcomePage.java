package com.Ecommerce.testScripts.loginModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Ecommerce.genericLibrary.objectRepository.BaseTest;
public class WelcomePage extends BaseTest{
	
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	private WebElement pageLogo;
	
	public WebElement getPageLogo() {
		return pageLogo;
	}
	
	public void goToRegistrationPage() {
		registerLink.click();
	}
	
	public void goToLoginPage() {
		loginLink.click();
	}
}