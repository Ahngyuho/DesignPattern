package org.example;

public class DarkRoast extends Beverage {
    public DarkRoast(String description) {
        this.description = description;
    }
    @Override
    public double cost() {
        return 0.99F;
    }
}
