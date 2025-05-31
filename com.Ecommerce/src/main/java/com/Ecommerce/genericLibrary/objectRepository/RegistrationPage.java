package com.Ecommerce.genericLibrary.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BaseTest {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getGender(WebDriver driver, String gender) {
		return driver.findElement(By.xpath("//label[text()='" + gender + "']"));
	}

	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;

	@FindBy(id = "LastName")
	private WebElement lastNameTextField;

	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextField;

	@FindBy(id = "register-button")
	private WebElement registerButton;

	public void registration(WebDriver driver, String gender, String firstName, String lastName, String email,
			String password) throws InterruptedException {
		Thread.sleep(2000);
		getGender(driver, gender).click();
		Thread.sleep(2000);
		firstNameTextField.sendKeys(firstName);
		Thread.sleep(2000);
		lastNameTextField.sendKeys(lastName);
		Thread.sleep(2000);
		emailTextField.sendKeys(email);
		Thread.sleep(2000);
		passwordTextField.sendKeys(password);
		Thread.sleep(2000);
		confirmPasswordTextField.sendKeys(password);
		Thread.sleep(2000);
		registerButton.click();
	}

}
