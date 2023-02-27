package org.example;

public class NYStyle extends Pizza {
    @Override
    public void setUpIngredient() {
        this.name = "NY style cheese and sauce";
        this.dough = "NY dough";
        this.sauce = "NY sauce";
        toppings.add("cheese");
    }

    public NYStyle() {

    }
}
