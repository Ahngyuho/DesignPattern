package org.example;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.description;
    }

    @Override
    public double cost() {
        return beverage.cost() + 3.23F;
    }
}
