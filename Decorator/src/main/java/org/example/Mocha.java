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
        //first my code
        //return beverage.description + "" -> 이건 행동을 위임한 행동이 아니므로 제대로 작동하지 않음
        return beverage.getDescription() + " Mocha!";
    }
}
