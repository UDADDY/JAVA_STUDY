package org.example.StrategyPatternPractice.character;

import org.example.StrategyPatternPractice.wepon.WeaponBehavior;

public class King extends Character {

    public King(WeaponBehavior weaponBehavior) {
        setWeapon(weaponBehavior);
    }

    public void fight() {
        System.out.print("왕이 ");
        super.fight();
    }
}
