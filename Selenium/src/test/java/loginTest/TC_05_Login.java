package loginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import NavigationPages.CommonMethods;
import NavigationPages.LoginPage;
import globalVariables.VariablesGlobales;
import setupDriver.DriverSetup;

public class TC_05_Login {
	//Declarar e inicializar un objeto del tipo webdriver para usarlo en nuestro TC
	WebDriver driver = DriverSetup.setupDriver();
	
	//Login Page Object
	LoginPage login = new LoginPage(driver);
	
	String user = CommonMethods.getJSONValue("TC_05", "username");
	String password = CommonMethods.getJSONValue("TC_05", "password");
	
	@BeforeTest
	public void startWebDriver() {
		
		driver.get(VariablesGlobales.HOME_PAGE);
	}
	
  @Test
  public void TC_05() {
	  login.login(user,password);
  }
  
  @AfterTest
  public void closeDriver() {
	  CommonMethods.takeScreenshot(driver, "TC_01_Login");
	  driver.quit();
  }
}
