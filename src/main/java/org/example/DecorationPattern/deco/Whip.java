package org.example.DecorationPattern.deco;

import org.example.DecorationPattern.coffee.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    public double cost() {
        return beverage.cost() + .10;
    }
}