package com.ui.serenity.screenplay.steps;

/***
 * @author Muzzamil
 */
import static org.assertj.core.api.Assertions.assertThat;

import com.ui.serenity.screenplay.model.Category;
import com.ui.serenity.screenplay.user.Inreaction.CategoryNavigationBar;
import com.ui.serenity.screenplay.user.Inreaction.CurrentPage;
import com.ui.serenity.screenplay.user.Inreaction.EbayHomePage;

import net.thucydides.core.annotations.Step;


public class NavigatingUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;
    CategoryNavigationBar categoryNavigationBar;

    @Step
    public void isOnTheHomePage() {
        ebayHomePage.open();
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }

    @Step
    public void navigatesToCategory(Category category) {
        categoryNavigationBar.selectCategory(category);
    }
}
