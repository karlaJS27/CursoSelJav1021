package NavigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageDirectory {
	
	public PageDirectory(WebDriver driver) {
		PageFactory.initElements(driver, this);}
	
	//WebElements
	
	@FindBy (id="menu_directory_viewDirectory")
	private WebElement Directorio;
	@FindBy (id="searchDirectory_emp_name_empName")
	private WebElement EscribirNombre;
	@FindBy (id="searchBtn")
	private WebElement BtnBuscar;
	@FindBy (id="resultTable")
	private WebElement Tabla;
	
	
	

}
