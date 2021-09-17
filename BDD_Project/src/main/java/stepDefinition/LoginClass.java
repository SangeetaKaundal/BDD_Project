package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginClass {
	WebDriver driver;
	
	@Given("Launch the application with valid URL")
	public void launch_app() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("user enter the valid credentials")
	public void user_enter_the_valid_credentials() {
		driver.findElement(By.id("txtUsernmae")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click(); 
	}

	@Then("user should be redirect to Home Page")
	public void user_should_be_redirect_to_Home_Page() {
	   String dashBoardTxt = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
	  Assert.
	}
	@Then("check availability of all the elements")
	public void check_availability_of_all_the_elements() {
	   System.out.println("check availability of all the elements");
	}
	

}
