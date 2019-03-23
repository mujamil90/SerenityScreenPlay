package com.ui.serenity.screenplay.questions;

import java.util.List;

import net.serenitybdd.screenplay.Question;

public class LoggedInUser {
	
	public static Question<List<String>> userName() {
        return new UserName() ;
    }

    

}
