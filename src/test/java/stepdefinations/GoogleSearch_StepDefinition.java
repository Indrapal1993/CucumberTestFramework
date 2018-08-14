package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;

public class GoogleSearch_StepDefinition {

	private WebDriver driver;
	 public GoogleSearch_StepDefinition() {
		this.driver=Hook.getDriver();
	}
	
	@Given("^I open a browser$")
	public void i_open_a_browser() throws Throwable {
		System.out.println("Browser is opened successfully");	  
	}

	@When("^I navigate to google page$")
	public void i_navigate_to_google_page() throws Throwable {
		driver.get("https://www.google.com");
	}

	@Then("^I validate the search text field$")
	public void i_validate_the_search_text_field() throws Throwable {
		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
	}
	
}
