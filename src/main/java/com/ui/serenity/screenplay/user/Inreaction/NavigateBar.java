package com.ui.serenity.screenplay.user.Inreaction;

import org.openqa.selenium.By;

import com.ui.serenity.screenplay.model.Category;

import net.serenitybdd.screenplay.targets.Target;
/***
 * 
 * @author Muzzamil
 *
 */
public class NavigateBar {
	
	
	public static Target category(Category category) {
		return Target.the(category.name())
				.located(By.linkText(category.name()));

	}

}
