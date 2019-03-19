package com.ui.serenity.screenplay.tasks;

import com.ui.serenity.screenplay.user.Inreaction.EbayHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

/***
 * 
 * @author Muzzamil
 *
 */
public class OpenTheApplication implements Task {

    EbayHomePage theEbayHomePage;

    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(theEbayHomePage)
        );
    }
}
