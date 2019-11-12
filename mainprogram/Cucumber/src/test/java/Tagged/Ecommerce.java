package Tagged;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ecommerce {
	
	@Given("^Open the ecommerce website$")
	public void open_the_ecommerce_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^select the product$")
	public void select_the_product() {
	}

	@When("^user choose the quantity of the product$")
	public void user_choose_the_quantity_of_the_product() {
	}

	@When("^user make paymet$")
	public void user_make_paymet() {
	}

	@Then("^close the app$")
	public void close_the_app() {
		
		System.out.println("Hi Hari....-");
		
		
		
	}

}
