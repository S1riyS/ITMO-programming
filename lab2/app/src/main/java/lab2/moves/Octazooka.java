// https://pokemondb.net/move/octazooka

package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Octazooka extends SpecialMove {
    public Octazooka(double power, double acc) {
        super(Type.WATER, power, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().chance(0.5).stat(Stat.ACCURACY, -1);
        p.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "uses Octazooka";
    }
}
