package Tagged;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Movie {
	
	@Given("^Launch the Bookmyshow website$")
	public void launch_the_Bookmyshow_website() {
		System.out.println("Launch the Bookmyshow website");
	}

	@When("^Select the seat and snacks$")
	public void select_the_seat_and_snacks() {
		System.out.println("Select the seat and snacks");
	}

	@When("^select the no of member to watch$")
	public void select_the_no_of_member_to_watch() {
		System.out.println("select the no of member to watch");
	}

	@When("^make the paymet through debit card$")
	public void make_the_paymet_through_debit_card() {
		System.out.println("make the paymet through debit card");
	}

	@Then("^finally watch the bigil movie$")
	public void finally_watch_the_bigil_movie() {
		System.out.println("finally watch the bigil movie");
	}

}
