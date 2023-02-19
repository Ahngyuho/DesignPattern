package org.example;

abstract public class Beverage {
    String description;
    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
