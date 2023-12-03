package org.example.StrategyPatternPractice.character;

import org.example.StrategyPatternPractice.wepon.WeaponBehavior;

public class Knight extends Character {

    public Knight(WeaponBehavior weaponBehavior) {
        setWeapon(weaponBehavior);
    }

    public void fight() {
        System.out.print("기사가 ");
        super.fight();
    }
}
