package com.Ecommerce.testScripts.loginModule;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ecommerce.genericLibrary.BaseClass;
import com.Ecommerce.genericLibrary.objectRepository.LoginPage;
public class ValidLoginTest extends BaseClass{
	@Test
	public void doValidLogin() {
		// Click on login link
		WelcomePage wp = new WelcomePage(driver);
		
		//Verify User land on Welcome page
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		wp.goToLoginPage();
		
		//Fill the valid credentials
		LoginPage lp = new LoginPage(driver);
		lp.doLogin("bethany91@gmail.com", "*Lw3ZlUiXE");
		
		
		
		
		
		
		
	}
	
	
	
	
}