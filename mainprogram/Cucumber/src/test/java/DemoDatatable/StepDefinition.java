package DemoDatatable;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;

	@Given("^User is already on automation practise SignIn Page$")
	public void user_is_already_on_automation_practise_SignIn_Page() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Uma-Hari\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	@When("^User click signin button$")
	public void user_click_signin_button() {
		
		driver.findElement(By.xpath("//*[contains(@class,'login')]")).click();
	}

	@When("^User should enters |b\\.harikrish(\\d+)@gmail\\.com|hari(\\d+)|$")
	public void user_should_enters_b_harikrish_gmail_com_hari(String Username, String Password, DataTable data) {
		
		List<String> Credentials=data.asList(String.class);
		WebElement uname = driver.findElement(By.xpath("//*[contains(@name,'email') | @id='email']"));
		uname.sendKeys(Credentials.get(0));
		
		WebElement pass = driver.findElement(By.xpath("//*[contains(@id,'passwd')]"));
		pass.sendKeys(Credentials.get(1));
		
		
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



