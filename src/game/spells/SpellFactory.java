package game.spells;

import game.field.CustomGameField;
import game.hero.Hero;

/**
 * Used for creating appropriate Spell objects
 */
public class SpellFactory {

    /**
     *
     * @param type Name of the Spell class
     * @param gameField custom game field as an argument for the spell constructor
     * @param hero Hero for the spell constructor
     * @return Returns the spell
     */
    public static Spell getAppropriateSpell(String type, CustomGameField gameField, Hero hero) {
        if(type.equals("InfernoSpell")) {
            return new InfernoSpell(gameField, hero);
        }
        else if(type.equals("LuckySpell")) {
            return new LuckySpell(gameField, hero);
        }
        else if(type.equals("DeathSpell")) {
            return new DeathSpell(gameField, hero);
        }
        else {
            return new InfernoSpell(gameField, hero);
        }
    }
}
