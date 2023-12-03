package org.example.StrategyPatternPractice.wepon;

public class SwordBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("검을 휘두룹니다");
    }
}
