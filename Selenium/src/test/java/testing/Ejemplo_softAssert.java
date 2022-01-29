package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ejemplo_softAssert {
	
	SoftAssert softAssert = new SoftAssert();
	
  @Test
  public void softAssertEquals() {
	  String exePath = "./Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String actualiceTitle = driver.getTitle();
		String expectedTile = "OrangeHRM";
		String badTitle = "sakdju";
		
		softAssert.assertEquals(actualiceTitle, badTitle);
		softAssert.assertEquals(actualiceTitle, expectedTile);
		softAssert.assertAll();
		
	  
	  
	  
	  
  }
  
  
}
