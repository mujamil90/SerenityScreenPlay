package com.ui.serenity.screenplay.steps;


import java.util.concurrent.ThreadLocalRandom;

import net.thucydides.core.annotations.Step;

public class JiraTestSteps {

    @Step
    public void initialization() {
        action();
    }

    @Step
    public void when_example_action_for(final int value) {
        action();
   
    }

    @Step
    public void then_example_result_should_be(final int value) {
        action();
        
    }

    private void action() {
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(50, 200));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
