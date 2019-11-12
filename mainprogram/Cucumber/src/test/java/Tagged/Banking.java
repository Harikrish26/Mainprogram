package Tagged;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Banking {

	@Given("^open the net banking page$")
	public void open_the_net_banking_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User enter the login and password click login button$")
	public void user_enter_the_login_and_password_click_login_button() {
	}

	@When("^check the mini statemnet$")
	public void check_the_mini_statemnet() {
	}

	@When("^user transfer the amount$")
	public void user_transfer_the_amount() {
	}

	@Then("^logout the net banking page$")
	public void logout_the_net_banking_page(){
	}
}
