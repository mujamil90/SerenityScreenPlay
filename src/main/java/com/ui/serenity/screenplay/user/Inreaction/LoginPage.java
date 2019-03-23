package com.ui.serenity.screenplay.user.Inreaction;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	 public static Target USER_NAME = Target.the("User name").located(By.id("userid"));
	 public static Target USER_PASSWORD = Target.the("user password").located(By.id("pass"));
	 public static Target SUBMIT_BUTTON = Target.the("user password").located(By.id("sgnBt"));
}
