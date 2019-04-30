package com.ui.serenity.screenplay.actions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.screenplay.Action;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

/**
 * 
 * @author Muzzamil
 * 
 * This class having global custom Action using a low-level WebDriver API 
 */
@SuppressWarnings("deprecation")
public class DoubleClick implements Action {

	/**
	 * 
	 * @param target is given object can be locator with @css and @id
	 * @return double click
	 */
    public static DoubleClick on(Target target) {
        return instrumented(DoubleClick.class, target);
    }

    private final Target target;

    public DoubleClick(Target target) {
        this.target = target;
    }

    /**
     * @actor  who is performing action.
     */
    @Step("{0} double-clicks on #target")
    public <T extends Actor> void performAs(T actor) {
        WebElement element = target.resolveFor(actor);

        as(actor).doubleClick(element).perform();
    }

    /***
     * 
     * @param actor who is performing action.
     * @return Action can be open browser or click.
     */
    private Actions as(Actor actor) {
        return new Actions(BrowseTheWeb.as(actor).getDriver());
    }
}
