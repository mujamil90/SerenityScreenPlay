package com.ui.serenity.screenplay.base;


/****
 * @author Muzzamil
 */
import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;

public class BaseActors {
	
	public static Actor DEAN = Actor.named("Dean");
	public static Actor SAM = Actor.named("Sam");
	
	
	@Managed(uniqueSession=true)
    public  WebDriver hisBrowser;


}
