package com.ui.serenity.screenplay.questions;

import java.util.List;

import com.ui.serenity.screenplay.user.Inreaction.EbayHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

@Subject("the displayed todo items")
public class UserName implements Question<List<String>>{
	
	@Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(EbayHomePage.LOGGED_IN_USER)
                .viewedBy(actor)
                .asList();
    }

}
