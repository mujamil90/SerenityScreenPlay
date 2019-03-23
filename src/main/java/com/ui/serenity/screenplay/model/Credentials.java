package com.ui.serenity.screenplay.model;

/****
 * 
 * @author Muzzamil
 *
 * An enum contains all navigation categories of ebay
 */
public enum Credentials {
    UserName("muzzans-55"),
    Password("Te5t@cc0unt"),
    FirstName("Muzzamil");

	 private final String label;
	
	Credentials(String label) {
	        this.label = label;
	    }

	   

	    public String label() {
	        return label;
	    }

}
