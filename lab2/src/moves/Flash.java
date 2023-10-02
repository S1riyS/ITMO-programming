// https://pokemondb.net/move/flash

package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public class Flash extends StatusMove {
    public Flash(double power, double acc) {
        super(Type.NORMAL, power, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().stat(Stat.ACCURACY, -1);
        p.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "uses Flash";
    }
}
