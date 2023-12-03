package org.example.StrategyPatternPractice.wepon;

public class KnifeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("칼로 벱니다");
    }
}
