package com.Ecommerce.genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass implements IAutoConstant {
	public DataUtility d = new DataUtility();
	public FileUtility f = new FileUtility();
	public static WebDriver driver;
	
	@BeforeSuite
	public void toConnectServer() {
		Reporter.log("==server connected successfully==", true);
	}
	@BeforeTest
	public void toConnectDatabase() {
		Reporter.log("==database connected successfully", true);
	}
	@BeforeClass
	public void setUp() {
		String browser = f.getDataFromProperty(PROP_PATH, "browser");
		String url = f.getDataFromProperty(PROP_PATH, "url");
		System.out.println("browser name : " + browser);
		System.out.println("url : " + url);
		Reporter.log("browser " + browser + " launched successfully", true);
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			Reporter.log("Invalid browser", true);
			break;
		}
		driver.manage().window().maximize();
		d.implicitWait(driver, 20);
		driver.get(url);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		Reporter.log("browser closed sucessfully", true);
	}

	@AfterTest
	public void toCloseDatabase() {
		Reporter.log("==database closed successfully==",true);
	}

	@AfterSuite
	public void toCloseServer() {
		Reporter.log("==server closed successfully", true);
	}

}
