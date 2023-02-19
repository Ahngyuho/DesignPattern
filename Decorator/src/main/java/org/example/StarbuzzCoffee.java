package org.example;
import java.util.*;
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage dark = new DarkRoast("Dark Roast");
        dark = new Mocha(dark);
        dark = new Whip(dark);
        System.out.println(dark.getDescription() + " " + dark.cost());
    }
}
