package stepdefinitions;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import io.cucumber.java.en.*;

public class login {
	
@BeforeClass
	public void setout() {
		System.out.println("before");
	}
@AfterClass
public void getout() {
	System.out.println("after");
}
	
	@Given("I want to write a step with preconditions")
	public void i_want_to_write_a_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("gjlkfdh");
	}

	@When("I complete actions")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("aftergegtrer");
	}

	@And("check more outcomess")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("aftewtweffer");
	}

	@Then("I validate the outcomess")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("aftwegewgtweer");
	}



}
