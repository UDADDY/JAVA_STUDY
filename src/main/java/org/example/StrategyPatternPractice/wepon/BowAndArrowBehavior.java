package org.example.StrategyPatternPractice.wepon;

public class BowAndArrowBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("화살을 쏩니다");
    }
}
