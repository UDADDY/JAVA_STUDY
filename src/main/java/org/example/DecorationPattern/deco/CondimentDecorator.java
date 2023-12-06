package org.example.DecorationPattern.deco;

import org.example.DecorationPattern.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
