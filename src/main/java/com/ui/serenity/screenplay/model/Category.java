package com.ui.serenity.screenplay.model;

/****
 * 
 * @author Muzzamil
 *
 */
public enum Category {
    Motors("Motors"),
    Fashion("Fashion"),
    HomeAndGarden("Home & Garden");

    Category(String label) {
        this.label = label;
    }

    private final String label;

    public String label() {
        return label;
    }
}
