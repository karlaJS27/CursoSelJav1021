package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String exePath = "./Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();//maximizar pantalla
		
		//obteniondo objetos /webElements de la pagina web
		WebElement userName = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		
		userName.sendKeys("Admin");
		Thread.sleep(2000);
		password.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
				
		//obtener titulo de la pagina
		String title = driver.getTitle();
		System.out.println(title);
		
		//validacion de la URL
		String urlActual = driver.getCurrentUrl();
		System.out.println("La URL actual es: " + urlActual);
		
		//Metodos de Navegacion
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		
		WebElement assignLeaveBtn = driver.findElement(By.className("quickLinkText"));
		assignLeaveBtn.click();
		
		//Borrar texto en textbox
		WebElement employeeNameTxt = driver.findElement(By.id("assignleave_txtEmployee_empName"));
		employeeNameTxt.sendKeys("Marcial Rivera");
		Thread.sleep(2000);
		employeeNameTxt.clear();
		
		//verificar que un elemento desplegado en la pagina
		WebElement assignBtn = driver.findElement(By.id("assignBtn"));
		boolean isDisplayed = assignBtn.isDisplayed();
		if (isDisplayed){
			System.out.println("El boton esta desplegado");
			
		}
		
		//obtener text de un elemento web
		
		//WebElement welcomeMsg = driver.findElement(By.id("welcome"));
		//String message = welcomeMsg.getText();
		
		//if(message.contains("Charu")) { //.contains() verifica que un string contenga otro string y regresa booleano 
			//System.out.println("El mensaje contiene el nombre de Charu");
		//}
		//else {
		//System.out.println("Error el mensaje no contiene nombre de sai");
			//}
		
		//DropDowns
		Select drpDwnLeaveType = new Select (driver.findElement(By.id("assignleave_txtLeaveType")));
		drpDwnLeaveType.selectByVisibleText("US - Vacation");
		drpDwnLeaveType.selectByIndex(1);
		
		//cerrar navegador web
		driver.close();//cerrar la ventana actual del webdriver
		driver.quit();//cerrar todas las ventanas del browser que el webdriver ha abierto
		
		
		
		
		
				
				
				
				
				
				
	}

}
