package com.ui.serenity.screenplay.cucumber.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;

import com.ui.serenity.screenplay.base.Base;
import com.ui.serenity.screenplay.model.Credentials;
import com.ui.serenity.screenplay.questions.LoggedInUser;
import com.ui.serenity.screenplay.tasks.ClickTo;
import com.ui.serenity.screenplay.tasks.Login;
import com.ui.serenity.screenplay.tasks.OpenTheApplication;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Steps;

public class LoginSteps extends Base{
	
	/***
	 * 
	 * This class provides steps to @cucumber feature file to execute.
	 */
	
	@Steps
	private OpenTheApplication openTheApplication;
	
	@Before
	public void setUp() {
		dean.can(BrowseTheWeb.with(hisBrowser));
		
	}
	
		 
	 @Given("^that dean open the ebay login page$")
	    public void that_dean_open_the_ebay_login_page() throws Throwable {
		 
		 dean.wasAbleTo(openTheApplication);
		 
		 dean.attemptsTo(ClickTo.loginLink());
	        
	    }
	 
	 @When("^he login with \"([^\"]*)\" and \"([^\"]*)\" in ebay$")
	    public void he_login_with_correct_credentials(String UserName, String Password) throws Throwable {

		 dean.attemptsTo(Login.withCorrectCredentials(UserName, Password));
	        
	    }

	 @When("^he should see loggedin User as 'Muzzamil' on homepage$")
	    public void he_should_see_loggedin_User_as_username_on_homepage() throws Throwable {
		 
		 dean.should(seeThat(LoggedInUser.userName(), hasItem(containsString(Credentials.FirstName.label()))));
	        
	    }
}
