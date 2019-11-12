package Loginfeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionClass {
	WebDriver driver;

	@Given("^the user is in facebook page$")
	public void the_user_is_in_facebook_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Uma-Hari\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@When("^the user enters the login and password in the text box$")
	public void the_user_enters_the_login_and_password_in_the_text_box() throws Throwable{

		driver.findElement(By.xpath("//*[contains(@type,'email')]")).sendKeys("bhk.harikrish07@gmail.com");
		driver.findElement(By.xpath("//*[contains(@name,'pass') | @type=\"password\"]")).sendKeys("12351991");

	}

	@And("^the user clicks the login button$")
	public void the_user_clicks_the_login_button() throws Throwable {
		WebElement login = driver.findElement(
				By.xpath("//*[starts-with(@id,'login')][@class='login_form_login_button uiButton uiButtonConfirm']"));
		login.click();
	}

	@Then("^the user enter into facebook page and verify the home page$")
	public void the_user_enter_into_facebook_page_and_verify_the_home_page() throws Throwable {
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
	}

}
