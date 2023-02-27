package org.example;

import java.util.*;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected final List<String> toppings = new ArrayList<>();

    public abstract void setUpIngredient();
    public void prepare() {
        System.out.println("preparing ...");
    }
    public void bake() {
        System.out.println("baking ...");
    }
    public void cut() {
        System.out.println("Cutting ...");
    }
    public void box() {
        System.out.println("Boxing...");
    }
}
