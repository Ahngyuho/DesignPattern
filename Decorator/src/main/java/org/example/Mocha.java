package org.example;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 20L;
    }

    @Override
    public String getDescription() {
        return beverage.description;
    }
}
