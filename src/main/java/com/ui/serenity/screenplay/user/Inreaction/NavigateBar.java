package com.ui.serenity.screenplay.user.Inreaction;

import org.openqa.selenium.By;

import com.ui.serenity.screenplay.model.Category;

import net.serenitybdd.screenplay.targets.Target;
/***
 * 
 * @author Muzzamil
 *
 *
 *This class is responsible to open categories @category.
 */
public class NavigateBar {
	
	
	public static Target category(Category category) {
		return Target.the(category.name())
				.located(By.linkText(category.name()));

	}

}
