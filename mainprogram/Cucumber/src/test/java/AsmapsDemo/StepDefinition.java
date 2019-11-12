package AsmapsDemo;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("^User is already on automation practise SignIn Page$")
	public void user_is_already_on_automation_practise_SignIn_Page() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
	
	@When("^User click signin button$")
	public void user_click_signin_button() {
		
		driver.findElement(By.xpath("//*[contains(@class,'login')]")).click();	
	}

	@When("^User should enters$")
	public void user_should_enters(DataTable data) {
		List<Map<String, String>> credentials = data.asMaps(String.class,String.class);
		driver.findElement(By.xpath("//*[contains(@name,'email') | @id='email']")).sendKeys(credentials.get(0).get("Username"));
		driver.findElement(By.xpath("//*[contains(@id,'passwd')]")).sendKeys(credentials.get(0).get("Password"));
	}

	@When("^User clicks the sign button$")
	public void user_clicks_the_sign_button() {
		
		driver.findElement(By.xpath("//*[contains(@class,'icon-lock left')]")).click();
	}

	@Then("^User should see the home page$")
	public void user_should_see_the_home_page() {
		
		WebElement out = driver.findElement(By.xpath("//*[contains(@title,'Log me out')]"));
		Assert.assertEquals("Sign out", out.getText());
		
	}



}
