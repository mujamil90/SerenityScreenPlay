package com.ui.serenity.screenplay.tasks;

import com.ui.serenity.screenplay.model.Category;
import com.ui.serenity.screenplay.user.Inreaction.EbayHomePage;
import com.ui.serenity.screenplay.user.Inreaction.NavigateBar;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;


/**
 * 
 * @author Muzzamil
 *
 */
public class NavigateTo implements Task{

	private EbayHomePage theEbayHomePage;
	private final Category category;
	
	public NavigateTo(Category category) {
		this.category=category;
	}
	
	@Override
	@Step("{0} navigates to the #category category")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Open.browserOn(theEbayHomePage),
		        Click.on(NavigateBar.category(category))
		        );
		
	}
	
	
	
	public static Performable theCategory(Category category) {
		return Instrumented.instanceOf(NavigateTo.class).withProperties(category);
		

	}

}
