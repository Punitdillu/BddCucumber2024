package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	By userName= By.xpath("//input[@name='user_name']");
	By passwordBox= By.xpath("//input[@name='user_password']");
	By loginButton= By.xpath("//input[@id='submitButton']");
	By administratorIcon= By.xpath("//span[text()=' Administrator']");
	
	// business logic
	public void sendUserName(String Userid)
	{
		driver.findElement(userName).sendKeys(Userid);
	}
	public void sendPassword(String password)
	{
		driver.findElement(passwordBox).sendKeys(password);
	}
	public void clickOnLoginBtn()
	{
		driver.findElement(loginButton).click();
	}
	
	public void homePageDisplayed()
	{
		Assert.assertTrue(driver.findElements(administratorIcon).size()>0,"User Ia at Home Page");

	}
}
