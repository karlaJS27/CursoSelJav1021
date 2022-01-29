package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ejemplo_hardAssert {
  @Test
  public void verificarTitulo() {
	  String exePath = "./Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String actualiceTitle = driver.getTitle();
		String expectedTile = "OrangeHRM";
		
		Assert.assertEquals(actualiceTitle, expectedTile);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	  
  }
}
