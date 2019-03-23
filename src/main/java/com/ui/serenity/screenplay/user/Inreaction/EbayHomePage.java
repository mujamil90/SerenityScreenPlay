package com.ui.serenity.screenplay.user.Inreaction;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
/**
 * 
 * @author Muzzamil
 *
 *
 *This class is responsible to open home page of @ebay
 */

@DefaultUrl("http://www.ebay.com")
public class EbayHomePage extends PageObject {
	
	 public static Target SIGN_IN = Target.the("Sign in Button").located(By.linkText("Sign in"));
	 public static Target LOGGED_IN_USER = Target.the("Logged in user").located(By.id("gh-ug"));
}
