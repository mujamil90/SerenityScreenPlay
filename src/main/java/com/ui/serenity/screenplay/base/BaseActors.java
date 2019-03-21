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
	public static Actor dean = Actor.named(Constant.ACTOR_DEAN);
	public static Actor sam = Actor.named(Constant.ACTOR_SAM);
	
	/***
	 * Driver or browser instance will be use to open browser.
	 */
	@Managed(uniqueSession=true)
    public  WebDriver hisBrowser;


}
