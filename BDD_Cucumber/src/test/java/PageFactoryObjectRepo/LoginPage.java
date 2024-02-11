package PageFactoryObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(xpath = "//input[@name='user_name']")
	WebElement txt_username;
	
	@FindBy(xpath = "//input[@name='user_password']")
	WebElement txt_password;
	
	@FindBy(xpath = "//input[@id='submitButton']")
	WebElement btn_login;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickLoginBtn()
	{
		btn_login.click();
	}

}
