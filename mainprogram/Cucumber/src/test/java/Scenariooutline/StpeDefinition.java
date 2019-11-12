package Scenariooutline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StpeDefinition {
	WebDriver driver;
	
	@Given("^User is already on automation practise SignIn Page$")
	public void User_is_already_on_automation_practise_Signin_Page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Uma-Hari\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
	
	@When("^User click signin button$")
	public void User_click_signin_button() {
		driver.findElement(By.xpath("//*[contains(@class,'login')]")).click();
	}


	@When("^User should enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_enters_credential(String Username, String Password)  {
		driver.findElement(By.xpath("//*[contains(@name,'email') | @id='email']")).sendKeys(Username);
		driver.findElement(By.xpath("//*[contains(@name,'passwd')]")).sendKeys(Password);
	}

	@When("^User clicks the sign button$")
	public void user_clicks_the_sign_button() {
		driver.findElement(By.xpath("//*[contains(@class,'icon-lock left')]")).click();
			
	}

	@Then("^User should see the home page$")
	public void user_should_see_the_home_page()  {
		WebElement out = driver.findElement(By.xpath("//*[contains(@title,'Log me out')]"));
		Assert.assertEquals("Sign out", out.getText());	
	}
}

