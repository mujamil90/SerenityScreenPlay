package com.ui.serenity.screenplay.base;


/****
 * @author Muzzamil
 */
import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;

public class BaseActors {
	
	/***
	 * Base actors who will perform action  like @click, @type  and @openBrowser to perform given task.
	 */
	public static Actor DEAN = Actor.named("Dean");
	public static Actor SAM = Actor.named("Sam");
	
	/***
	 * Driver or browser instance will be use to open browser.
	 */
	@Managed(uniqueSession=true)
    public  WebDriver hisBrowser;


}
