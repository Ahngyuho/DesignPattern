package org.example;

public class Ingredient {
    private String name;
    private String dough;
    private String sauce;
    public Ingredient(String name, String dough, String sauce) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
    }

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

//    public static Ingredient of(String name, String dough, String sauce) {
//
//    }
}
