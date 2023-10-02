// https://pokemondb.net/move/charge

package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Charge extends StatusMove {
    public Charge(double power, double acc) {
        super(Type.ELECTRIC, power, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, 1);
        p.addEffect(effect);
    }
}
