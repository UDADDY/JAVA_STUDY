package org.example.StrategyPatternPractice;

import org.example.StrategyPatternPractice.character.Character;
import org.example.StrategyPatternPractice.character.King;
import org.example.StrategyPatternPractice.character.Queen;
import org.example.StrategyPatternPractice.wepon.AxeBehavior;
import org.example.StrategyPatternPractice.wepon.BowAndArrowBehavior;
import org.example.StrategyPatternPractice.wepon.KnifeBehavior;

public class GameSimulator {
    public static void main(String[] args) {
        Character queen = new Queen(new BowAndArrowBehavior());
        queen.fight();
        queen.setWeapon(new AxeBehavior());
        queen.fight();

        Character king = new King(new KnifeBehavior());
        king.fight();
    }
}
