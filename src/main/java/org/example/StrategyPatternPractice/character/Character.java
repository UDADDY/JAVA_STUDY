package org.example.StrategyPatternPractice.character;

import org.example.StrategyPatternPractice.wepon.WeaponBehavior;

public abstract class Character {
    public WeaponBehavior weapon;

    public Character() {
    }

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        weapon = w;
    }
}
