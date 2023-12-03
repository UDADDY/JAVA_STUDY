package org.example.StrategyPatternPractice.character;

import org.example.StrategyPatternPractice.wepon.WeaponBehavior;

public class Queen extends Character {

    public Queen(WeaponBehavior weaponBehavior) {
        setWeapon(weaponBehavior);
    }

    public void fight() {
        System.out.print("여왕이 ");
        super.fight();
    }
}
