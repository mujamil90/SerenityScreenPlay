package com.ui.serenity.screenplay.features.datadriven;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ui.serenity.screenplay.base.Base;
import com.ui.serenity.screenplay.tasks.NavigateWithParametrization;
import com.ui.serenity.screenplay.tasks.OpenTheApplication;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;

/***
 * 
 * @author Muzzamil
 * 
 * 
 * This class explain how to perform data driven test cases in @serenity Api.
 *
 */
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src\\test\\resources\\test-data\\search.csv")  
public class NavigationRunnerDataDriven extends Base{

	private String category;
    private String expectedPageTitle;
	

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void samCanBrowseTheWeb() {
        sam.can(BrowseTheWeb.with(hisBrowser));
    }
    
    public void searchKeyword(String category) {
        this.category = category;
    }
    
    @Qualifier
    public String qualifier() {
       return category + "=>" + expectedPageTitle;
    }
   

    @Test				
  public void shouldBeAbleToNavigateToTheDataDrivenProducts() {
		
    	
    	when(sam).attemptsTo(NavigateWithParametrization.theCategory(category));
    	
    	then(sam).should(seeThat(TheWebPage.title(), containsString(expectedPageTitle)));
	}
}