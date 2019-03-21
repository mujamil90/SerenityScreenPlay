package com.ui.serenity.screenplay.tasks;

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
public class NavigateWithParametrization implements Task{

	private EbayHomePage theEbayHomePage;
	private final String category;
	
	public NavigateWithParametrization(String category) {
		this.category=category;
	}
	
	/***
	 *  @actor performs click after open @theEbayHomePage
	 */
	
	@Override
	@Step("{0} navigates to the #category category")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Open.browserOn(theEbayHomePage),
		        Click.on(NavigateBar.category(category))
		        );
		
	}
	
	/***
	 * 
	 * @param category of task to perform an action
	 * @return
	 */
	
	public static Performable theCategory(String category) {
		return Instrumented.instanceOf(NavigateWithParametrization.class).withProperties(category);
		

	}

}
