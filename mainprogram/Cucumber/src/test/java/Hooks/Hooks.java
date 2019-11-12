package Hooks;

import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void beforeScenario() {
		System.out.println("Launch the Chrome");

	}

	@After
	public void afterScenario() {
		System.out.println("Close the Chrome");
	}

	@Test
	public void newMethod() {

		System.out.println("New Method has been added======");
	}

	/*
	 * @Before("@First") public void beforeFirst() {
	 * System.out.println("This will run only before the First Scenario"); }
	 * 
	 * @Before("@Second") public void beforeSecond() {
	 * System.out.println("This will run only before the Second Scenario"); }
	 * 
	 * @Before("@Third") public void beforeThird() {
	 * System.out.println("This will run only before the Third Scenario");
	 * 
	 * }
	 * 
	 * @Before("@Four") public void beforeFour() {
	 * System.out.println("This will run only before the fourth Scenario"); }
	 * 
	 * 
	 * 
	 * @After("@First") public void afterFirst() {
	 * System.out.println("This will run only after the first scenario");
	 * 
	 * }
	 * 
	 * @After("@Second") public void aftersecond() {
	 * System.out.println("This will run only after the second scenario"); }
	 * 
	 * @After("@Third") public void afterthird() {
	 * 
	 * System.out.println("This will run after the third scenarion"); }
	 * 
	 * @After("@Four") public void afterfour() {
	 * 
	 * System.out.println("This will run after the fourth scenario"); }
	 */

}
