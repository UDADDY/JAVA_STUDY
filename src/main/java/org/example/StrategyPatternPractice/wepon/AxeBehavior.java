package org.example.StrategyPatternPractice.wepon;

public class AxeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("도끼로 찍습니다");
    }
}
