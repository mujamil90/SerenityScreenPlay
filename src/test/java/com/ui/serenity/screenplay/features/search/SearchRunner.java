package com.ui.serenity.screenplay.features.search;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.Matchers.containsString;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.ui.serenity.screenplay.base.BaseActors;
import com.ui.serenity.screenplay.model.SearchStack;
import com.ui.serenity.screenplay.tasks.OpenTheApplication;
import com.ui.serenity.screenplay.tasks.Search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Steps;

/***
 * 
 * @author Muzzamil
 *
 *
 *This class having test cases to verify @serach
 */
@RunWith(SerenityRunner.class)
public class SearchRunner extends BaseActors{


    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void samCanBrowseTheWeb() {
        SAM.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test				
    public void search_results_should_show_the_search_term_in_the_title() {

        givenThat(SAM).wasAbleTo(openTheApplication);

        when(SAM).attemptsTo(Search.forTheTerm(SearchStack.Iphone.name()));

        then(SAM).should(eventually(seeThat(TheWebPage.title(), containsString(SearchStack.Iphone.name()))));

    }
}