package Tagged;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("^User should launch the automation website$")
	public void user_should_launch_the_automation_website()  {
		
		System.out.println("User should launch the automation website");
	}

	@When("^User should enter the login and password button$")
	public void user_should_enter_the_login_and_password_button()  {
		System.out.println("User should enter the login and password button");
	}

	@When("^User clicks the sigin button$")
	public void user_clicks_the_sigin_button()  {
		System.out.println("User clicks the sigin button");
	}

	@When("^User should verify the home page$")
	public void user_should_verify_the_home_page() {
	System.out.println("User should verify the home page");
	}

}
