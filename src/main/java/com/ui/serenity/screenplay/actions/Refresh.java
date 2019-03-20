package com.ui.serenity.screenplay.actions;

import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

/***
 * 
 * @author Muzzamil
 *
 */
public class Refresh implements Interaction, IsSilent {
	
	/***
	 * This function is responsible to delete all cookies of browser.
	 */
    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().deleteAllCookies();
    }

    public static Refresh theBrowserSession() {
        return new Refresh();
    }
}
