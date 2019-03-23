package com.ui.serenity.screenplay.tasks;

import com.ui.serenity.screenplay.user.Inreaction.EbayHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class ClickTo implements Task {


	private EbayHomePage ebay;
	
	@Step("{0} click on signin button")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ebay.SIGN_IN));
				
		
	}
	
    public static ClickTo loginLink() {
        return new ClickTo();
    }

}
