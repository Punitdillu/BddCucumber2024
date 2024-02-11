package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageFactoryObjectRepo.HomePage;
import PageFactoryObjectRepo.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefLoginPage {
	
	 WebDriver driver;
	 LoginPage lp;
	 HomePage home;
	
	@Given("User at log in page")
	public void user_at_log_in_page() {
	   
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
	}

	@When("Enter {string} and {string}")
	public void enter_user_id_and_password(String Userid, String password) {
		lp=new LoginPage(driver);
		lp.enterUsername(Userid);;
		lp.enterPassword(password);

	}

	@And("Click on login button")
	public void click_on_login_button() {
	   
         lp.clickLoginBtn();
	}

	@Then("User Navigate to home page")
	public void user_navigate_to_home_page() {
	   home= new HomePage(driver);
         home.homePageDisplayed();
}

	@And("Close browser;")
	public void close_browser() {
	    
		driver.quit();
	}

}
