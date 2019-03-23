package com.ui.serenity.screenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.ui.serenity.screenplay.model.Credentials;
import com.ui.serenity.screenplay.user.Inreaction.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Login implements Task{
	
	private LoginPage login;
	
	
    private final String username;
    private final String password;
    

    protected Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

	@Step("{0} do Login with #username and #password credentials")
	@Override
	public <T extends Actor> void performAs(T actor) {
		 actor.attemptsTo(
	            Enter.theValue(username).into(login.USER_NAME),
	            Enter.theValue("password").into(login.USER_PASSWORD),
	            Click.on(login.SUBMIT_BUTTON)
	        );
		
	}
	
	
	
	 public static Login withCorrectCredentials(String username, String password) {
	        return instrumented(Login.class, username, password);
	    }

}
