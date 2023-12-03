package org.example.StrategyPatternPractice.character;

import org.example.StrategyPatternPractice.wepon.WeaponBehavior;

public class Troll extends Character {

    public Troll(WeaponBehavior weaponBehavior) {
        setWeapon(weaponBehavior);
    }

    public void fight() {
        System.out.print("트롤이 ");
        super.fight();
    }
}
