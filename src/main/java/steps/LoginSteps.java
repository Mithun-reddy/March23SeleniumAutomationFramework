package steps;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.LoginPage;
import tests.BaseTest;

public class LoginSteps {
	
	private static WebDriver driver;
	public static LoginPage lp = new LoginPage(driver);
	
	
//	@Before(order = 1)
//	public void reportConfig() {
//		System.out.println("report .. ");
//	}
	
	@Before (order = 2)
	public void setUp(){
//		System.out.println("Setup method .. ");
		driver = BaseTest.getBrowserType("chrome", false);
		
		
	}

	
	@After
	public void tearDown() {
		System.out.println("Tear down .. ");
		driver.close();
	}
	
	@Given("User launches login page")
	public void user_launches_login_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		driver.get("https://login.salesforce.com");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		lp.password.sendKeys("");
		lp.username.sendKeys("");
		
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		lp.login.click();
	}

	@Then("User should see the homepage")
	public void user_should_see_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
	}

	@When("User enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see the error message on the login screen")
	public void user_should_see_the_error_message_on_the_login_screen() {
		
		String text = lp.loginErrorMsg.getText();
		System.out.println(text);
		

//		List<Map<String, Integer>> sa = student.asMaps(String.class, Integer.class);
//		
//		for (Map<String, Integer> map : sa) {
//			
//			map.get("Student");
//		}
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	
	@When("User do not clicks on remember me checkbox")
	public void user_do_not_clicks_on_remember_me_checkbox() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("UserName: "+ string+" Pass: "+string2);
	}


}
