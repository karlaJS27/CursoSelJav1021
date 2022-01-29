package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTarea1 {

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
		
		WebElement Directorio = driver.findElement(By.id("menu_directory_viewDirectory"));
		Directorio.click();
		
		WebElement EscribirNombre = driver.findElement(By.id("searchDirectory_emp_name_empName"));
		EscribirNombre.sendKeys("Nathan");
		Thread.sleep(3000);
		
		WebElement BtnBuscar = driver.findElement(By.id("searchBtn"));
		BtnBuscar.click();
		
		WebElement Tabla = driver.findElement(By.id("resultTable"));
		String nombre = Tabla.getText();
		
		if (nombre.contains("Nathan Elliot")) {
			System.out.println("El mensaje contiene el nombre de Nathan Elliot ");
		}
		else {
			System.out.println("El mensaje no contiene el nombre de Nathan Elliot ERROR");
		}
		
		
	}

}
