// Replacement: "Solar Beam" -> "Psybeam"
// https://pokemondb.net/move/psybeam

package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Psybeam extends SpecialMove {
    public Psybeam(double power, double acc) {
        super(Type.PSYCHIC, power, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            Effect.confuse(p);
        }
    }

    @Override
    protected String describe() {
        return "uses Psybeam";
    }
}
