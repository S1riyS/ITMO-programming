// Replacement: "Light Screen" -> "Light Of Ruin"
// https://pokemondb.net/move/light-of-ruin

package moves;

import pokemons.Sharpedo;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class LightOfRuin extends SpecialMove {
    private final Sharpedo ownerInstance;

    public LightOfRuin(Sharpedo ownerInstance, double power, double acc) {
        super(Type.FAIRY, power, acc);
        this.ownerInstance = ownerInstance;
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) Math.round(damage * 0.5));
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
        this.ownerInstance.previousMove = this;
    }

    @Override
    protected String describe() {
        return "uses Light of Rain";
    }
}
