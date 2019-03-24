package com.ui.serenity.screenplay.features.navigation;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ui.serenity.screenplay.base.Base;
import com.ui.serenity.screenplay.model.Category;
import com.ui.serenity.screenplay.tasks.NavigateTo;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
/**
 * @author Muzzamil
 * 
 * 
 * This class having test cases to verify @navigation.
 */
@RunWith(SerenityRunner.class)
public class NavigationRunner extends Base {

    
    
    
    @Before public void deanCanBrowseTheWeb() {
        dean.can(BrowseTheWeb.with(hisBrowser));
    }
    
        
    @Test
    public void shouldBeAbleToNavigateToTheMotorsProducts() {
		
    	
    	when(dean).attemptsTo(NavigateTo.theCategory(Category.Motors));
    	
    	then(dean).should(seeThat(TheWebPage.title(), containsString(Category.Motors.toString())));
	}
    
    
    @Test
    public void shouldBeAbleToNavigateToTheFashionProducts() {
		
    	
    	when(dean).attemptsTo(NavigateTo.theCategory(Category.Fashion));
    	
    	then(dean).should(seeThat(TheWebPage.title(), containsString(Category.Fashion.toString())));
	}
}
