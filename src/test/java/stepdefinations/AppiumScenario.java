package stepdefinations;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;

public class AppiumScenario {

	private WebDriver driver;
	
	public AppiumScenario() {
		this.driver = Hook.getDriver();
	}
	
	@Given("^Launch the application$")
	public void launch_the_application() throws Throwable {
	   System.out.println("^Launch the application$");
	}

	@When("^User invalid credentials got entered$")
	public void user_invalid_credentials_got_entered() throws Throwable {
		   System.out.println("^User invalid credentials got entered$");
	}

	@Then("^Verify validation message on screen$")
	public void verify_validation_message_on_screen() throws Throwable {
		System.out.println("^Verify validation message on screen$");
	}
}
