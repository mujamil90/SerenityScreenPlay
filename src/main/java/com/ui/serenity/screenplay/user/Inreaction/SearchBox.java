package com.ui.serenity.screenplay.user.Inreaction;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/***
 * 
 * @author Muzzamil
 * 
 * This class is responsible to provide target @search textbox
 *
 */

public class SearchBox {
    public static Target SEARCH_FIELD = Target.the("search field").located(By.id("gh-ac"));
}
