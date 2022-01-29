package NavigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//Iniciando los pageObjetos con PageFactory
										//THIS es un keyword de java con el que le indicamos que en esta misma clase vamos a inicializar los metodos
		
	}
	
	
	//Login PagueObjetos/WebElements
	@FindBy (id= "txtUsername")
	private WebElement userNameTxt;
	@FindBy (id= "txtPassword")
	private WebElement passwordTxt;
	@FindBy (id= "btnLogin")
	private WebElement btnLogin;
	
	public void login(String user, String password) {
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
	}
}
