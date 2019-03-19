package com.ui.serenity.screenplay.model;

/***
 * 
 * @author Muzzamil
 *
 */

public enum SearchStack {
    Iphone("iPhone"),
    Fashion("Samsung"),
    HomeAndGarden("Blackberry");

    SearchStack(String label) {
        this.label = label;
    }

    private final String label;

    public String label() {
        return label;
    }
}
