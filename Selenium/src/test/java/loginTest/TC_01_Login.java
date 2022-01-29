package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import NavigationPages.CommonMethods;
import NavigationPages.LoginPage;
import globalVariables.VariablesGlobales;
import setupDriver.DriverSetup;

public class TC_01_Login {
	//Declarar e inicializar un objeto del tipo webdriver para usarlo en nuestro TC
	WebDriver driver = DriverSetup.setupDriver();
	
	//Login Page Object
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		
		driver.get(VariablesGlobales.HOME_PAGE);
	}
	
  @Test
  public void TC_01() {
	  login.login(VariablesGlobales.USER_ADMIN, VariablesGlobales.PWD_Admin);
  }
  
  @AfterTest
  public void closeDriver() {
	  CommonMethods.takeScreenshot(driver, "TC_01_Login");
	  driver.quit();
  }
}
