// Replacement: "Rage" -> "Dragon Rage"
// https://pokemondb.net/move/dragon-rage

package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class DragonRage extends PhysicalMove {
    public DragonRage(double power, double acc) {
        super(Type.DRAGON, power, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, 40); // Exactly 40 HP damage, regardless of typing
    }

    @Override
    protected String describe() {
        return "uses Dragon Rage";
    }
}
