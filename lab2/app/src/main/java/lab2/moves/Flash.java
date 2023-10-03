// https://pokemondb.net/move/flash

package lab2.moves;

import ru.ifmo.se.pokemon.*;

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
