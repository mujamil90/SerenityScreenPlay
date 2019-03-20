package com.ui.serenity.screenplay.actions;

import net.serenitybdd.screenplay.Action;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * 
 * @author Muzzamil
 * 
 * An example of a custom WebDriver Action.
 */
public class JSClick implements Action {

    private final Target target;

    public JSClick(Target target) {
        this.target = target;
    }

    /***
     * @thetheActor an object who is performing an action.
     */
    @Override
    @Step("{0} clicks on #target")
    public <T extends Actor> void performAs(T theActor) {
        WebElement targetElement = target.resolveFor(theActor);
        BrowseTheWeb.as(theActor).evaluateJavascript("arguments[0].click()", targetElement);
    }

    /***
     * 
     * @param target can be a webelement or locator
     * @return Action can be click.
     */
    public static Action on(Target target) {
        return instrumented(JSClick.class, target);
    }

}
