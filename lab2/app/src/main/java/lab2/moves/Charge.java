// https://pokemondb.net/move/charge

package lab2.moves;

import ru.ifmo.se.pokemon.*;

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
