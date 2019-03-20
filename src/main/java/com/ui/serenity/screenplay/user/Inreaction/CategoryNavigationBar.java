package com.ui.serenity.screenplay.user.Inreaction;

/****
 * @author Muzzamil
 * 
 * This class is responsible to interact with navigation bar in @ebay
 */
import com.ui.serenity.screenplay.model.Category;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class CategoryNavigationBar extends PageObject
{
	
	
    public void selectCategory(Category category) {
        find(By.linkText(category.name())).click();
    }
}
