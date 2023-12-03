package org.example.StrategyPattern;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("삑");
    }
}
