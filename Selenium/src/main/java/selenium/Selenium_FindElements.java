package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_FindElements {

	public static void main(String[] args) throws InterruptedException {
		
		String exePath = "./Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		userName.sendKeys("Admin");
		Thread.sleep(3000);
		password.sendKeys("admin123");
		Thread.sleep(3000);
		btnLogin.click();
		
		List<WebElement> firstLevelMenu = driver.findElements(By.xpath("//*[@class=\"firstLevelMenu\"]/b"));
		System.out.println("Numero de elementos: " + firstLevelMenu );
		
		String primerMenu = firstLevelMenu.get(0).getText();
		
		for (int i=0; i<firstLevelMenu.size(); i++) {
			System.out.println("Los menus son: " + firstLevelMenu.get(i).getText());
			
		}
		
		
		
		

	}

}
